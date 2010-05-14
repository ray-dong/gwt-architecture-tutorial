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

import java.util.List;
import org.ducktools.tutorial.gwt.architecture.photoalbum.client.commons.eventhandlers.AlbumListLoadedEventHandler;
import com.google.gwt.event.shared.GwtEvent;

/**
 * @author Jan Ehrhardt
 */
public class AlbumListLoadedEvent extends GwtEvent<AlbumListLoadedEventHandler> {

  private static Type<AlbumListLoadedEventHandler> type;

  private final List<String> albumList;

  /**
   * @param albumList
   */
  public AlbumListLoadedEvent(List<String> albumList) {
    this.albumList = albumList;
  }

  /**
   * @return
   */
  public static Type<AlbumListLoadedEventHandler> getType() {
    return type;
  }

  /**
   * @see GwtEvent#getAssociatedType()
   */
  @Override
  public Type<AlbumListLoadedEventHandler> getAssociatedType() {
    return getType();
  }

  /**
   * @return
   */
  public List<String> getAlbumList() {
    return albumList;
  }

  /**
   * @see GwtEvent#dispatch(AlbumListLoadedEventHandler)
   */
  @Override
  protected void dispatch(AlbumListLoadedEventHandler handler) {
    handler.onAlbumListLoaded( this );
  }

}
