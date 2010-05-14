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
    handlerManager = new HandlerManager(null);
  }

  /**
   * @see EventBus#addHandler(Type, EventHandler)
   */
  public <H extends EventHandler> HandlerRegistration addHandler(Type<H> type,
      H handler) {
    return handlerManager.addHandler(type, handler);
  }

  /**
   * @see EventBus#fireEvent(GwtEvent)
   */
  public void fireEvent(GwtEvent<?> event) {
    handlerManager.fireEvent(event);
  }

}