/*******************************************************************************
 * Copyright 2014 See AUTHORS file.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package ca.raihan.event;

/**
 * A {@code PublicEvent} is an open event that can be raised by any caller
 * which is aware that the event is public. No checking is done when an attempt
 * is made to raise the event.
 * 
 * @author Pranjal Raihan
 * 
 * @param <T> Event context
 */
public class PublicEvent<T extends EventContext> extends AbstractEvent<T> {
    
    /**
     * Raises the event. Signals all listeners.
     * 
     * @param sender the sender of the event
     * 
     * @param context the context of the event
     */
    public void raise(Object sender, T context) {
        raiseImpl(sender, context);
    }
    
}
