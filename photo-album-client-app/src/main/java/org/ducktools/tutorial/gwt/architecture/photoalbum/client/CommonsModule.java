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
package org.ducktools.tutorial.gwt.architecture.photoalbum.client;

import net.customware.gwt.dispatch.client.DispatchAsync;
import org.ducktools.tutorial.gwt.architecture.photoalbum.client.commons.dispatcher.AlbumListDispatchAsync;
import org.ducktools.tutorial.gwt.architecture.photoalbum.client.commons.eventbus.EventBus;
import org.ducktools.tutorial.gwt.architecture.photoalbum.client.commons.eventbus.impl.EventBusImpl;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.name.Names;

/**
 * @author Jan Ehrhardt
 */
public class CommonsModule extends AbstractGinModule {

  /**
   * @see com.google.gwt.inject.client.AbstractGinModule#configure()
   */
  @Override
  protected void configure() {
    bind( EventBus.class ).to( EventBusImpl.class );
    bind( DispatchAsync.class ).annotatedWith( Names.named( "album-list" ) ).to( AlbumListDispatchAsync.class );
  }

}
