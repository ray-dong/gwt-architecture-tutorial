/**
 * Copyright © 2010 Jan Ehrhardt
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
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
public class ApplicationPresenterImpl extends AbstractPresenter<ApplicationDisplay> implements ApplicationPresenter {

  private final EventBus eventBus;

  @Inject
  public ApplicationPresenterImpl(ApplicationDisplay display, EventBus eventBus) {

    super( display );

    this.eventBus = eventBus;

    eventBus.addHandler( AlbumSelectedEvent.getType(), new AlbumSelectedEventHandler() {

      @Override
      public void onAlbumSelected(AlbumSelectedEvent event) {
        handleAlbumChange( event.getAlbumId() );
      }

    } );

    display.addValueChangeHandler( new ValueChangeHandler<String>() {

      @Override
      public void onValueChange(ValueChangeEvent<String> event) {
        handleHistoryChange( event.getValue() );
      }

    } );

  }

  /**
   * @param listPresenter
   */
  @Inject
  public void setListPresenter(ListPresenter listPresenter) {
    listPresenter.getDisplay().bindTo( display );
  }

  private void handleHistoryChange(String historyToken) {
    eventBus.fireEvent( new AlbumSelectedEvent( historyToken ) );
  }

  private void handleAlbumChange(String albumId) {
    display.setHistoryToken( albumId );
  }

}
