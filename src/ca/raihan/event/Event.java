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
 * Events interface, for event-driven models.
 * 
 * @author Pranjal Raihan
 * 
 * @param <T> extends {@code EventContext}. The implementation dependent
 * context for the event.
 */
public interface Event<T extends EventContext> {
    
    /**
     * Adds a new listener to the event, 
     * {@link EventListener#onEvent(Object, EventContext) 
     * onEvent(sender, context)} will be called when the event is raised.
     * 
     * @param listener the listener to add.
     * 
     * @throws NullPointerException if {@code listener} is {@code null}.
     */
    void addListener(EventListener<T> listener);
    
    /**
     * Removes a specified listener from the event. Returns {@code true} if the 
     * listener was removed, otherwise returns {@code false}.
     * 
     * @param listener the listener to remove. a {@code null} value will always 
     * return {@code false}.
     * 
     * @return {@code true} if the listener was removed, otherwise 
     * {@code false}.
     */
    boolean removeListener(EventListener<T> listener);
    
}
