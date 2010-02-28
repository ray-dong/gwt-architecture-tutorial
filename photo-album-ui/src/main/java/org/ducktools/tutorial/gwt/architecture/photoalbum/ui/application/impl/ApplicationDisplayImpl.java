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
public class ApplicationDisplayImpl extends Composite implements
    ApplicationDisplay {

  public interface ApplicationDisplayImplUiBinder extends
      UiBinder<Widget, ApplicationDisplayImpl> {
  }

  @UiField
  HorizontalPanel applicationPanel;

  /**
   * 
   * @param uiBinder
   */
  @Inject
  public ApplicationDisplayImpl(ApplicationDisplayImplUiBinder uiBinder) {
    initWidget(uiBinder.createAndBindUi(this));
  }

  /**
   * @see ApplicationDisplay#bindTo(HasWidgets)
   */
  @Override
  public void bindTo(HasWidgets parent) {
    parent.add(this);
  }

  /**
   * @see ApplicationDisplay#add(Widget)
   */
  @Override
  public void add(Widget w) {
    applicationPanel.add(w);
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
    return applicationPanel.remove(w);
  }

  /**
   * @see ApplicationDisplay#addValueChangeHandler(ValueChangeHandler)
   */
  @Override
  public HandlerRegistration addValueChangeHandler(
      ValueChangeHandler<String> handler) {
    return History.addValueChangeHandler(handler);
  }

  /**
   * @see ApplicationDisplay#setHistoryToken(String)
   */
  @Override
  public void setHistoryToken(String token) {
    History.newItem(token, false);
  }

  /**
   * @see ApplicationDisplay#setTitle(String)
   */
  @Override
  public void setTitle(String title) {
    Window.setTitle(title);
  }

  /**
   * @see ApplicationDisplay#getTitle()
   */
  @Override
  public String getTitle() {
    return Window.getTitle();
  }

}
