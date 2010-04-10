/**
 * © 2010 Jan Ehrhardt
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ducktools.tutorial.gwt.architecture.photoalbum.ui.application.impl;

import org.ducktools.tutorial.gwt.architecture.photoalbum.client.commons.eventbus.EventBus;
import org.ducktools.tutorial.gwt.architecture.photoalbum.client.commons.eventhandlers.AlbumSelectedEventHandler;
import org.ducktools.tutorial.gwt.architecture.photoalbum.client.commons.events.AlbumSelectedEvent;
import org.ducktools.tutorial.gwt.architecture.photoalbum.ui.application.ApplicationDisplay;
import org.ducktools.tutorial.gwt.architecture.photoalbum.ui.application.ApplicationPresenter;
import org.ducktools.tutorial.gwt.architecture.photoalbum.ui.common.AbstractPresenter;
import org.ducktools.tutorial.gwt.architecture.photoalbum.ui.list.ListPresenter;

import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.inject.Inject;

/**
 * @author Jan Ehrhardt
 */
public class ApplicationPresenterImpl extends
    AbstractPresenter<ApplicationDisplay> implements ApplicationPresenter {

  private final EventBus eventBus;

  @Inject
  public ApplicationPresenterImpl(ApplicationDisplay display, EventBus eventBus) {

    super(display);

    this.eventBus = eventBus;

    eventBus.addHandler(AlbumSelectedEvent.getType(),
        new AlbumSelectedEventHandler() {

          @Override
          public void onAlbumSelected(AlbumSelectedEvent event) {
            handleAlbumChange(event.getAlbumId());
          }

        });

    display.addValueChangeHandler(new ValueChangeHandler<String>() {

      @Override
      public void onValueChange(ValueChangeEvent<String> event) {
        handleHistoryChange(event.getValue());
      }

    });

  }

  /**
   * 
   * @param listPresenter
   */
  @Inject
  public void setListPresenter(ListPresenter listPresenter) {
    listPresenter.getDisplay().bindTo(display);
  }

  private void handleHistoryChange(String historyToken) {
    eventBus.fireEvent(new AlbumSelectedEvent(historyToken));
  }

  private void handleAlbumChange(String albumId) {
    display.setHistoryToken(albumId);
  }

}
