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
package org.ducktools.tutorial.gwt.architecture.photoalbum.client.commons.events;

import org.ducktools.tutorial.gwt.architecture.photoalbum.client.commons.eventhandlers.AlbumSelectedEventHandler;

import com.google.gwt.event.shared.GwtEvent;

/**
 * @author Jan Ehrhardt
 */
public class AlbumSelectedEvent extends GwtEvent<AlbumSelectedEventHandler> {

  private static Type<AlbumSelectedEventHandler> type;

  private final String albumId;

  public AlbumSelectedEvent(String albumId) {
    this.albumId = albumId;
  }

  public static Type<AlbumSelectedEventHandler> getType() {

    if (type == null) {
      type = new Type<AlbumSelectedEventHandler>();
    }

    return type;

  }

  @Override
  public Type<AlbumSelectedEventHandler> getAssociatedType() {
    return getType();
  }

  public String getAlbumId() {
    return albumId;
  }

  @Override
  protected void dispatch(AlbumSelectedEventHandler handler) {
    handler.onAlbumSelected(this);
  }

}
