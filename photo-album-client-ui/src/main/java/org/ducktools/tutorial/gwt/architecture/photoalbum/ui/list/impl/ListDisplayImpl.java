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

import java.util.Iterator;
import org.ducktools.tutorial.gwt.architecture.photoalbum.ui.list.ListDisplay;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

/**
 * @author Jan Ehrhardt
 */
public class ListDisplayImpl extends Composite implements ListDisplay {

  public interface ListDisplayImplUiBinder extends UiBinder<Widget, ListDisplayImpl> {

  }

  @UiField
  VerticalPanel listPanel;

  @Inject
  public ListDisplayImpl(ListDisplayImplUiBinder uiBinder) {
    initWidget( uiBinder.createAndBindUi( this ) );
  }

  @Override
  public void bindTo(HasWidgets parent) {
    parent.add( this );
  }

  @Override
  public void add(Widget w) {
    listPanel.add( w );
  }

  @Override
  public void clear() {
    listPanel.clear();
  }

  @Override
  public Iterator<Widget> iterator() {
    return listPanel.iterator();
  }

  @Override
  public boolean remove(Widget w) {
    return listPanel.remove( w );
  }

}
