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
package org.ducktools.tutorial.gwt.architecture.photoalbum.ui.list

import static org.testng.Assert.*
import static org.hamcrest.Matchers.*

import org.testng.annotations.*
import org.gmock.*
import org.ducktools.tutorial.gwt.architecture.photoalbum.ui.application.impl.*
import org.ducktools.tutorial.gwt.architecture.photoalbum.ui.application.*
import org.ducktools.tutorial.gwt.architecture.photoalbum.client.commons.eventbus.*
import org.ducktools.tutorial.gwt.architecture.photoalbum.client.commons.eventhandlers.*
import org.ducktools.tutorial.gwt.architecture.photoalbum.client.commons.events.*
import com.google.gwt.event.logical.shared.*
import com.google.gwt.event.shared.*

/**
 * Tests for the class {@link ApplicationPresenterImpl}.<br>
 * {@link ApplicationPresenterImpl} should be a good implementation of
 * {@link ApplicationPresenter}, that's to be verified.
 * 
 * @author Jan Ehrhardt
 */
@WithGMock
class ApplicationPresenterImplTest {
  
  /**
   * Test that the {@link ApplicationPresenter}'s getDisplay method returns the
   * {@link ApplicationDisplay} object, given to the constructor.
   */
  @Test
  void testGetDisplay() {
    
    EventBus eventBus = mock(EventBus) {
      addHandler(AlbumSelectedEvent.getType(), instanceOf(AlbumSelectedEventHandler)).returns(null)
    }
    
    ApplicationDisplay display = mock(ApplicationDisplay) {
      addValueChangeHandler(instanceOf(ValueChangeHandler)).returns(null)
    }
    
    play {
      
      ApplicationPresenter presenter = new ApplicationPresenterImpl(display, eventBus)
      assertNotNull presenter.display
      assertEquals display, presenter.display
      
    }
    
  }
  
  /**
   * 
   */
  @Test
  void testAlbumSelectedEventRecieved() {
    
    def albumSelected
    
    def albumId = "Test Album"
    
    // just an implementation for addHandler method required
    def eventBus = {type, handler -> 
      albumSelected = handler
      null
    }
    
    ApplicationDisplay display = mock(ApplicationDisplay) {
      addValueChangeHandler(instanceOf(ValueChangeHandler)).returns(null)
      setHistoryToken(albumId).times(1)
    }
    
    play {
      
      ApplicationPresenter presenter = new ApplicationPresenterImpl(display, eventBus as EventBus)
      albumSelected.onAlbumSelected(new AlbumSelectedEvent(albumId))
      
    }
    
  }
  
}
