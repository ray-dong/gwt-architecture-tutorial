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
package org.ducktools.tutorial.gwt.architecture.photoalbum.client.commons.actions;

import java.util.List;
import net.customware.gwt.dispatch.shared.Result;
import org.ducktools.tutorial.gwt.architecture.photoalbum.client.commons.domain.Album;

/**
 * @author Jan Ehrhardt
 */
public class LoadAlbumListActionResult implements Result {

  private static final long serialVersionUID = 7549270720831479322L;

  private List<Album> albumList;

  /**
   * @return
   */
  public List<Album> getAlbumList() {
    return albumList;
  }

  /**
   * @param albumList
   */
  public void setAlbumList(List<Album> albumList) {
    this.albumList = albumList;
  }

}
