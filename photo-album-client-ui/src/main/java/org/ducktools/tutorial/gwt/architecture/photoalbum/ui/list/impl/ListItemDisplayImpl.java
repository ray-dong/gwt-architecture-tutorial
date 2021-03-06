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
package org.ducktools.tutorial.gwt.architecture.photoalbum.ui.list.impl;

import org.ducktools.tutorial.gwt.architecture.photoalbum.ui.list.ListItemDisplay;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

/**
 * @author Jan Ehrhardt
 */
public class ListItemDisplayImpl extends Composite implements ListItemDisplay {

  public interface ListItemDisplayImplUiBinder extends UiBinder<Widget, ListItemDisplayImpl> {
  }

  @Inject
  public ListItemDisplayImpl(ListItemDisplayImplUiBinder uiBinder) {
    initWidget( uiBinder.createAndBindUi( this ) );
  }

  @Override
  public void bindTo(HasWidgets parent) {
    parent.add( this );
  }

}
