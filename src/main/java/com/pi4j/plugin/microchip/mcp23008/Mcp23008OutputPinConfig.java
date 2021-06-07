/*
 *
 *  *
 *  * -
 *  *   * #%L
 *  *   * **********************************************************************
 *  *   * ORGANIZATION  :  Pi4J
 *  *   * PROJECT       :  Pi4J :: EXTENSION
 *  *   * FILENAME      :  Mcp23008OutputPinConfig.java
 *  *   *
 *  *   * This file is part of the Pi4J project. More information about
 *  *   * this project can be found here:  https://pi4j.com/
 *  *   * **********************************************************************
 *    * %%
 *  *   * Copyright (C) 2012 - 2021 Pi4J
 *     * %%
 *    * Licensed under the Apache License, Version 2.0 (the "License");
 *    * you may not use this file except in compliance with the License.
 *    * You may obtain a copy of the License at
 *    *
 *    *      http://www.apache.org/licenses/LICENSE-2.0
 *    *
 *    * Unless required by applicable law or agreed to in writing, software
 *    * distributed under the License is distributed on an "AS IS" BASIS,
 *    * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    * See the License for the specific language governing permissions and
 *    * limitations under the License.
 *    * #L%
 *  *
 *  *
 *
 *
 */

package com.pi4j.plugin.microchip.mcp23008;

import com.pi4j.config.*;
import com.pi4j.context.Context;
import com.pi4j.io.gpio.digital.DigitalState;
import com.pi4j.plugin.microchip.mcp23008.provider.gpio.digital.MicrochipMcp23008DigitalOutputProvider;
import com.pi4j.plugin.microchip.mcp23008.provider.gpio.digital.impl.MicrochipMcp23008DigitalOutputProviderImpl;

public interface Mcp23008OutputPinConfig extends Config {


     default DigitalState getInitialPinState(){
         return(this.initialState);
     }

     default void setInitialPinState(DigitalState state){
         ; //this.initialState = state;
     }

    DigitalState initialState = null;


/*
    static Mcp23008OutputPinConfig newBuilder(Context context) {
        return Mcp23008OutputPinConfig.newInstance(context);
    }
    */

}
