package org.example

import org.example.kafka.KafkaController
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.kafka.test.context.EmbeddedKafka

@SpringBootTest(classes = [KafkaController::class])
@EmbeddedKafka(partitions = 1, brokerProperties = ["listeners=PLAINTEXT://localhost:9092", "port=9092"])
class KafkaTest {

    @Autowired lateinit var kafkaTemplate: KafkaTemplate<String, String>

    @Test
    fun test() {
        kafkaTemplate.send("print", "oh shit im sorry").get()
        Thread.sleep(5000)
        Assertions.assertNotNull(kafkaTemplate)
    }
}