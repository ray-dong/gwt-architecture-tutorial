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

import org.ducktools.tutorial.gwt.architecture.photoalbum.ui.application.ApplicationDisplay;
import org.ducktools.tutorial.gwt.architecture.photoalbum.ui.application.ApplicationPresenter;
import org.ducktools.tutorial.gwt.architecture.photoalbum.ui.application.impl.ApplicationDisplayImpl;
import org.ducktools.tutorial.gwt.architecture.photoalbum.ui.application.impl.ApplicationPresenterImpl;
import org.ducktools.tutorial.gwt.architecture.photoalbum.ui.list.ListDisplay;
import org.ducktools.tutorial.gwt.architecture.photoalbum.ui.list.ListItemDisplay;
import org.ducktools.tutorial.gwt.architecture.photoalbum.ui.list.ListPresenter;
import org.ducktools.tutorial.gwt.architecture.photoalbum.ui.list.impl.ListDisplayImpl;
import org.ducktools.tutorial.gwt.architecture.photoalbum.ui.list.impl.ListItemDisplayImpl;
import org.ducktools.tutorial.gwt.architecture.photoalbum.ui.list.impl.ListPresenterImpl;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.gwt.inject.client.GinModule;

/**
 * A {@link GinModule}, that provides configuration for the UI of the application.
 * @author Jan Ehrhardt
 */
public class UIModule extends AbstractGinModule {

  /**
   * @see com.google.gwt.inject.client.AbstractGinModule#configure()
   */
  @Override
  protected void configure() {

    bind( ApplicationPresenter.class ).to( ApplicationPresenterImpl.class );
    bind( ApplicationDisplay.class ).to( ApplicationDisplayImpl.class );

    bind( ListPresenter.class ).to( ListPresenterImpl.class );
    bind( ListDisplay.class ).to( ListDisplayImpl.class );
    bind( ListItemDisplay.class ).to( ListItemDisplayImpl.class );

  }

}
