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
package se.swedenconnect.bankid.idp.authn.events;

import jakarta.servlet.http.HttpServletRequest;
import se.swedenconnect.bankid.idp.rp.RelyingPartyData;

/**
 * An event for the cancellation of an order.
 *
 * @author Martin Lindström
 * @author Felix Hellman
 */
public class OrderCancellationEvent extends AbstractBankIdEvent {

  /**
   * Constructor.
   *
   * @param request the servlet request
   * @param data the RP data
   */
  public OrderCancellationEvent(final HttpServletRequest request, final RelyingPartyData data) {
    super(request, data);
  }

}
