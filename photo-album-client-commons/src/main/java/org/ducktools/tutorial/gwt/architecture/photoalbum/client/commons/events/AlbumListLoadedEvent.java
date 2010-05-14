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
   * 
   * @param albumList
   */
  public AlbumListLoadedEvent(List<String> albumList) {
    this.albumList = albumList;
  }

  /**
   * 
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
   * 
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
    handler.onAlbumListLoaded(this);
  }

}
