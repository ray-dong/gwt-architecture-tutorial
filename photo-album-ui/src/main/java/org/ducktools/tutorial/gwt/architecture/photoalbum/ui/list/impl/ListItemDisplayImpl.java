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

  public interface ListItemDisplayImplUiBinder extends
      UiBinder<Widget, ListItemDisplayImpl> {
  }

  @Inject
  public ListItemDisplayImpl(ListItemDisplayImplUiBinder uiBinder) {
    initWidget(uiBinder.createAndBindUi(this));
  }

  @Override
  public void bindTo(HasWidgets parent) {
    parent.add(this);
  }

}
