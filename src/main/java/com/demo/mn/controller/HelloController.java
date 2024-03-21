/*
 * Copyright 2024 DGIE - J72 Aprovisionamiento de Tecnología y Datos Económicos.
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
 */
package com.demo.mn.controller;

import com.demo.mn.controller.service.KafkaService;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import io.micronaut.http.annotation.QueryValue;
import jakarta.inject.Inject;

/**
 *
 * @author DGIE - J72 Aprovisionamiento de Tecnología y Datos Económicos
 */
@Controller("/hello")
public class HelloController{

    @Inject
    KafkaService KafkaService;
    
    @Get
    @Produces(MediaType.TEXT_PLAIN)
    public String index(@QueryValue String user, @QueryValue String mensaje) {
        KafkaService.sendMessage(user, mensaje);
        
        return user == null ? "Hello World!" : ("Hello " + user + "!");
    }

}
