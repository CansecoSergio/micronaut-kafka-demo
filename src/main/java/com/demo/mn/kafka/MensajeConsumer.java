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
package com.demo.mn.kafka;

import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.OffsetReset;
import io.micronaut.configuration.kafka.annotation.Topic;
import java.time.LocalDate;

/**
 *
 * @author DGIE - J72 Aprovisionamiento de Tecnología y Datos Económicos
 */
@KafkaListener(offsetReset = OffsetReset.LATEST) 
public class MensajeConsumer {
    
    @Topic("my-messages") 
    public void receive(@KafkaKey String user, String mensaje) throws Exception { 
        System.out.println("Notificacion de " + user + ": " + mensaje + ". \nRecibido a las a las  " + LocalDate.now());
    }
    
}
