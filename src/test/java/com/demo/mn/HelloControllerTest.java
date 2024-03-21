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
package com.demo.mn;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.MediaType;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

/**
 *
 * @author DGIE - J72 Aprovisionamiento de Tecnología y Datos Económicos
 */
@MicronautTest
public class HelloControllerTest {

    @Inject
    @Client("/")
    HttpClient client;

    @Test
    public void testHello() {
        //HttpRequest<?> request = HttpRequest.GET("/hello").accept(MediaType.TEXT_PLAIN);  
        //String body = client.toBlocking().retrieve(request);

        //assertNotNull(body);
        //assertEquals("Hello World!", body);
    }
    
}
