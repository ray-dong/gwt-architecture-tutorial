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
package org.ducktools.tutorial.gwt.architecture.photoalbum.client.commons.dispatcher;

import java.util.ArrayList;
import java.util.List;
import net.customware.gwt.dispatch.client.DispatchAsync;
import net.customware.gwt.dispatch.shared.Action;
import net.customware.gwt.dispatch.shared.Result;
import org.ducktools.tutorial.gwt.architecture.photoalbum.client.commons.actions.LoadAlbumListActionResult;
import org.ducktools.tutorial.gwt.architecture.photoalbum.client.commons.domain.Album;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.inject.Singleton;

/**
 * @author Jan Ehrhardt
 */
@Singleton
public class AlbumListDispatchAsync implements DispatchAsync {

  private final List<Album> currentAlbumList;

  public AlbumListDispatchAsync() {

    JsArrayString initialAlbums = initFromPage();

    currentAlbumList = new ArrayList<Album>( initialAlbums.length() );

    for (int i = 0; i < initialAlbums.length(); i++) {

      Album album = new Album();
      album.setName( initialAlbums.get( i ) );
      currentAlbumList.add( album );

    }

  }

  @SuppressWarnings("unchecked")
  @Override
  public <A extends Action<R>, R extends Result> void execute(A action, AsyncCallback<R> callback) {

    LoadAlbumListActionResult result = new LoadAlbumListActionResult();
    result.setAlbumList( currentAlbumList );
    callback.onSuccess( (R) result );

  }

  private native JsArrayString initFromPage()
  /*-{
    return $wnd.albums;
  }-*/;

}
