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
package org.ducktools.tutorial.gwt.architecture.photoalbum.ui.list.impl;

import org.ducktools.tutorial.gwt.architecture.photoalbum.client.commons.eventbus.EventBus;
import org.ducktools.tutorial.gwt.architecture.photoalbum.ui.common.AbstractPresenter;
import org.ducktools.tutorial.gwt.architecture.photoalbum.ui.list.ListDisplay;
import org.ducktools.tutorial.gwt.architecture.photoalbum.ui.list.ListPresenter;

import com.google.inject.Inject;

/**
 * @author Jan Ehrhardt
 */
public class ListPresenterImpl extends AbstractPresenter<ListDisplay> implements
    ListPresenter {

  private final EventBus eventBus;

  /**
   * 
   * @param display
   */
  @Inject
  public ListPresenterImpl(ListDisplay display, EventBus eventBus) {
    super(display);
    this.eventBus = eventBus;
  }

  /**
   * @see ListPresenter#init()
   */
  @Override
  public void init() {

  }

}
