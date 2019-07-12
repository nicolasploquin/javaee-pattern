/*
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

import fr.eni.formation.geometrie.business.Carre;
import fr.eni.formation.geometrie.business.Service;

import javax.inject.Inject;
import javax.ws.rs.*;
import java.util.List;

/**
 * A simple REST service which is able to say hello to someone using HelloService Please take a look at the web.xml where JAX-RS
 * is enabled
 *
 * @author gbrey@redhat.com
 *
 */

@Path("/geometrie")
@Consumes({ "application/json" })
@Produces({ "application/json" })
public class GeometrieRest {

//    private static Service service;
//
//    public static void setService(Service service) {
//        GeometrieRest.service = service;
//    }

    @Inject
    Service service;

    @GET
    @Path("/carres")
    public List<Carre> getCarres() {
        return service.listeCarres();
    }

    @GET
    @Path("/carres/{id}")
    public Carre getCarre(@PathParam("id") long id) {
        return service.rechercheCarre(id);
    }

    @POST
    @Path("/carres")
    public Carre postCarres(Carre carre) {
        return service.creerCarre(carre);
    }



}
