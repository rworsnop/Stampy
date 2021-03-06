/*
 * Copyright (C) 2013 Burton Alexander
 * 
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 51
 * Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
 * 
 */
package asia.stampy.common.message.interceptor;

import asia.stampy.common.StampyLibrary;

/**
 * The Class InterceptException, thrown by the implementation of an interceptor
 * when the sending of a message is to be aborted.
 */
@StampyLibrary(libraryName="stampy-client-server")
public class InterceptException extends Exception {

  private static final long serialVersionUID = 3708895403125259300L;

  /**
   * Instantiates a new intercept exception.
   * 
   * @param message
   *          the message
   */
  public InterceptException(String message) {
    super(message);
  }

  /**
   * Instantiates a new intercept exception.
   * 
   * @param message
   *          the message
   * @param cause
   *          the cause
   */
  public InterceptException(String message, Throwable cause) {
    super(message, cause);
  }

}
