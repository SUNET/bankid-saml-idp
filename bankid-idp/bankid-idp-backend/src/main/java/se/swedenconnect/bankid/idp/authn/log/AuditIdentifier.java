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
package se.swedenconnect.bankid.idp.authn.log;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@Data
@ToString
public class AuditIdentifier {

  public enum Type {
    SUCCESS,
    FAILURE,
    START,
    COLLECT
  }

  /** The session ID. */
  private final String sessionId;
  
  /** The relying party ID. */
  private final String relayingParty;
  
  /** The entityID:s. */
  private final List<String> entityIds;
  
  /** The audit event type. */
  private final Type eventType;
  
}
