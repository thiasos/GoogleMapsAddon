/*-
 * #%L
 * Google Maps Addon
 * %%
 * Copyright (C) 2020 - 2021 Flowing Code
 * %%
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
 * #L%
 */
package com.flowingcode.vaadin.addons.googlemaps;

import com.flowingcode.vaadin.addons.DemoLayout;
import com.flowingcode.vaadin.addons.GithubLink;
import com.flowingcode.vaadin.addons.demo.TabbedDemo;
import com.vaadin.flow.router.Route;

@SuppressWarnings("serial")
@Route(value = "googlemaps", layout = DemoLayout.class)
@GithubLink("https://github.com/FlowingCode/GoogleMapsAddon")
public class GooglemapsDemoView extends TabbedDemo {

  public GooglemapsDemoView() {
    addDemo(new GoogleMapsDemo());
    addDemo(new AddMarkersDemo());
    addDemo(new AddPolygonsDemo());
    addDemo(new GeolocationDemo());
    addDemo(new DraggableMarkerDemo());
    addDemo(new DisableUIControlsDemo());
    setSizeFull();
  }
}
