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
package com.demo.mn.controller.service;

import io.micronaut.context.ApplicationContext;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import com.demo.mn.kafka.MensajeClient;

/**
 *
 * @author DGIE - J72 Aprovisionamiento de Tecnología y Datos Económicos
 */
@Singleton
public class KafkaService {

    @Inject
    ApplicationContext applicationContext;

    public boolean isContextNull() {
        return applicationContext == null;
    }

    public void sendMessage(String user, String mensaje) {
        MensajeClient client = applicationContext.getBean(MensajeClient.class);
        client.sendMessage(user, mensaje);
    }

}
