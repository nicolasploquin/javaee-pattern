/**
 * JBoss, Home of Professional Open Source
 * Copyright 2015, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package fr.eni.formation.geometrie.api;

import fr.eni.formation.geometrie.business.GeometrieService;
import fr.eni.formation.geometrie.business.Service;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.LinkedList;
import java.util.List;

/**
 * JAXActivator is an arbitrary name, what is important is that javax.ws.rs.core.Application is extended
 * and the @ApplicationPath annotation is used with a "rest" path.  Without this the rest routes linked to
 * from index.html would not be found.
 */
@ApplicationPath("api")
public class JAXActivator extends Application {

//    private List<Service> services = new LinkedList<>();
//
//    static {
//
//        Service service = GeometrieService.getInstance();
//
//        GeometrieRest.setService(service);
//
//        // GeometrieRest api = new GeometrieRest(service);
//
//
//    }
//
//    public static void registerService(Service service){
//
//    }

}
