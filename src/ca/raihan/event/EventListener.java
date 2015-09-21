/*******************************************************************************
 * Copyright 2013 See AUTHORS file.
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
 * An {@code EventListener} hooks onto events and are notified when an event
 * it is subscribed to is raised. A lambda can be used in place of explicitly
 * implementing this interface.
 *
 * @author Pranjal Raihan
 * @param <T>
 */
public interface EventListener<T extends EventContext> {
    
    /**
     * The callback of the event listener.
     * 
     * @param sender the sender of the event, typically this is an
     * {@code Event} object itself, but the actual sender is based on the
     * implementation.
     * 
     * @param context the context information for the raised event.
     */
    void onEvent(Object sender, T context);
    
}
