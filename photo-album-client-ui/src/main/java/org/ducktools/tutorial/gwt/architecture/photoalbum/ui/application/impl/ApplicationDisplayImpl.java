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
package org.ducktools.tutorial.gwt.architecture.photoalbum.ui.application.impl;

import java.util.Iterator;
import org.ducktools.tutorial.gwt.architecture.photoalbum.ui.application.ApplicationDisplay;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

/**
 * @author Jan Ehrhardt
 */
public class ApplicationDisplayImpl extends Composite implements ApplicationDisplay {

  public interface ApplicationDisplayImplUiBinder extends UiBinder<Widget, ApplicationDisplayImpl> {
  }

  @UiField
  HorizontalPanel applicationPanel;

  /**
   * @param uiBinder
   */
  @Inject
  public ApplicationDisplayImpl(ApplicationDisplayImplUiBinder uiBinder) {
    initWidget( uiBinder.createAndBindUi( this ) );
  }

  /**
   * @see ApplicationDisplay#bindTo(HasWidgets)
   */
  @Override
  public void bindTo(HasWidgets parent) {
    parent.add( this );
  }

  /**
   * @see ApplicationDisplay#add(Widget)
   */
  @Override
  public void add(Widget w) {
    applicationPanel.add( w );
  }

  /**
   * @see ApplicationDisplay#clear()
   */
  @Override
  public void clear() {
    applicationPanel.clear();
  }

  /**
   * @see ApplicationDisplay#iterator()
   */
  @Override
  public Iterator<Widget> iterator() {
    return applicationPanel.iterator();
  }

  /**
   * @see ApplicationDisplay#remove(Widget)
   */
  @Override
  public boolean remove(Widget w) {
    return applicationPanel.remove( w );
  }

  /**
   * @see ApplicationDisplay#addValueChangeHandler(ValueChangeHandler)
   */
  @Override
  public HandlerRegistration addValueChangeHandler(ValueChangeHandler<String> handler) {
    return History.addValueChangeHandler( handler );
  }

  /**
   * @see ApplicationDisplay#setHistoryToken(String)
   */
  @Override
  public void setHistoryToken(String token) {
    History.newItem( token, false );
  }

  /**
   * @see ApplicationDisplay#setTitle(String)
   */
  @Override
  public void setTitle(String title) {
    Window.setTitle( title );
  }

  /**
   * @see ApplicationDisplay#getTitle()
   */
  @Override
  public String getTitle() {
    return Window.getTitle();
  }

}
