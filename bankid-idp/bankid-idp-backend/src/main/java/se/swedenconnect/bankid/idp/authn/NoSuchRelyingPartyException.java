/*
 * Copyright 2023 Sweden Connect
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
package se.swedenconnect.bankid.idp.authn;

import se.swedenconnect.bankid.idp.ApplicationVersion;

/**
 * Runtime exception for cases where the flow is invoked for a non-registered RP.
 *
 * @author Martin Lindström
 * @author Felix Hellman
 */
public class NoSuchRelyingPartyException extends RuntimeException {

  private static final long serialVersionUID = ApplicationVersion.SERIAL_VERSION_UID;

  /**
   * Constructor.
   *
   * @param entityId the entityID for the SP that does not exist
   */
  public NoSuchRelyingPartyException(final String entityId) {
    super("Not registered SP - " + entityId);
  }
}
