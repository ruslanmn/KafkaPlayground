package org.example.kafka

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class KafkaController {

    @KafkaListener(topics = ["print"])
    fun test(message: String) {
        println(message)
    }
}