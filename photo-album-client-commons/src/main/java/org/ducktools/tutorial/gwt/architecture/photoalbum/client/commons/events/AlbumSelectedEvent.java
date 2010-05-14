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
    handler.onAlbumSelected( this );
  }

}
