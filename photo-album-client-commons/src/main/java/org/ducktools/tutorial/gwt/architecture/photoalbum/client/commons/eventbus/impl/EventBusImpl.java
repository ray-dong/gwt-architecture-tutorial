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
package org.ducktools.tutorial.gwt.architecture.photoalbum.client.commons.eventbus.impl;

import org.ducktools.tutorial.gwt.architecture.photoalbum.client.commons.eventbus.EventBus;
import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.inject.Singleton;

/**
 * @author Jan Ehrhardt
 */
@Singleton
public class EventBusImpl implements EventBus {

  private final HandlerManager handlerManager;

  public EventBusImpl() {
    handlerManager = new HandlerManager( null );
  }

  /**
   * @see EventBus#addHandler(Type, EventHandler)
   */
  public <H extends EventHandler> HandlerRegistration addHandler(Type<H> type, H handler) {
    return handlerManager.addHandler( type, handler );
  }

  /**
   * @see EventBus#fireEvent(GwtEvent)
   */
  public void fireEvent(GwtEvent<?> event) {
    handlerManager.fireEvent( event );
  }

  @Override
  public void onSuccess(EventRelatedResult result) {
    // TODO: create event based on the type and fire it
  }

  @Override
  public void onFailure(Throwable caught) {
    // TODO: fire error event
  }

}
