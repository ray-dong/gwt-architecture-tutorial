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
package org.ducktools.tutorial.gwt.architecture.photoalbum.client;

import org.ducktools.tutorial.gwt.architecture.photoalbum.ui.application.ApplicationPresenter;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * The {@link EntryPoint} class for the application. It will invoke GIN to
 * create the application's objects.
 * 
 * @author Jan Ehrhardt
 */
public class ApplicationEntryPoint implements EntryPoint {

  private static final Application application = GWT.create(Application.class);

  /**
   * @see com.google.gwt.core.client.EntryPoint#onModuleLoad()
   */
  @Override
  public void onModuleLoad() {
    
    ApplicationPresenter applicationPresenter = application.init();
    applicationPresenter.init();
    applicationPresenter.getDisplay().bindTo(RootPanel.get());
    
  }

}
