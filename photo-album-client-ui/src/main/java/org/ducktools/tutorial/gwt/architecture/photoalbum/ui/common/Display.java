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
package org.ducktools.tutorial.gwt.architecture.photoalbum.ui.common;

import com.google.gwt.user.client.ui.HasWidgets;

/**
 * @author Jan Ehrhardt
 */
public interface Display<T> {

  /**
   * Binds a {@link Display} to a parent object.<br>
   * A typical parent would be {@link HasWidgets}.
   * @param parent
   */
  void bindTo(T parent);

}
