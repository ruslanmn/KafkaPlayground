package org.example

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.kafka.annotation.EnableKafka

@SpringBootApplication
open class KafkaApplication

fun main(args: Array<String>) {
    runApplication<KafkaApplication>(*args)
}