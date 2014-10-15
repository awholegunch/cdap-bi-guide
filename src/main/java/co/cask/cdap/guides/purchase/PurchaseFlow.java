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
package co.cask.cdap.guides.purchase;

import co.cask.cdap.api.flow.Flow;
import co.cask.cdap.api.flow.FlowSpecification;

/**
 * This is a simple Flow that consumes purchase events from a Stream and stores Purchase objects in a Dataset.
 * It has only one Flowlet, which consumes events from a Stream, converts them into Purchase objects, and
 * stores them in a Dataset.
 */
public class PurchaseFlow implements Flow {

  @Override
  public FlowSpecification configure() {
    return FlowSpecification.Builder.with()
      .setName("PurchaseFlow")
      .setDescription("Reads purchase events from a stream and stores the purchases in a Dataset")
      .withFlowlets()
        .add("sink", new PurchaseSinkFlowlet())
      .connect()
        .fromStream("purchases").to("sink")
      .build();
  }
}
