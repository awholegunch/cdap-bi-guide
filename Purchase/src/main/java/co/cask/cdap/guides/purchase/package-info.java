/*
 * Copyright © 2014 Cask Data, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
/**
 *
 * Example application that reads purchase data from a Stream, and makes it available for ad-hoc querying.
 * <ul>
 *   <li>
 *     Send events of the form "customerName,quantity,productId" to the purchaseStream.
 *   </li>
 *   <li>
 *     The PurchaseFlow reads the purchaseStream and converts every input String into a Purchase object and stores
 *     the object in the purchases DataSet.
 *   </li>
 *   <li>
 *    You can use SQL to formulate ad-hoc queries over the purchases Dataset. This is done by
 *    a series of ``curl`` calls, as described in the RESTful API section of the Developer Guide,
 *    via the cdap CLI, or the web interface.
 *   </li>
 * </ul>
 */
package co.cask.cdap.guides.purchase;
