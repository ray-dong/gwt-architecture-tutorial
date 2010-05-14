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
package org.ducktools.tutorial.gwt.architecture.photoalbum.ui.list.impl;

import org.ducktools.tutorial.gwt.architecture.photoalbum.client.commons.eventbus.EventBus;
import org.ducktools.tutorial.gwt.architecture.photoalbum.ui.common.AbstractPresenter;
import org.ducktools.tutorial.gwt.architecture.photoalbum.ui.list.ListDisplay;
import org.ducktools.tutorial.gwt.architecture.photoalbum.ui.list.ListItemDisplay;
import org.ducktools.tutorial.gwt.architecture.photoalbum.ui.list.ListPresenter;
import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * @author Jan Ehrhardt
 */
public class ListPresenterImpl extends AbstractPresenter<ListDisplay> implements ListPresenter {

  private final EventBus eventBus;

  private final Provider<ListItemDisplay> listItemProvider;

  /**
   * @param display
   */
  @Inject
  public ListPresenterImpl(ListDisplay display, EventBus eventBus, Provider<ListItemDisplay> listItemProvider) {

    super( display );

    this.eventBus = eventBus;
    this.listItemProvider = listItemProvider;

  }

}
