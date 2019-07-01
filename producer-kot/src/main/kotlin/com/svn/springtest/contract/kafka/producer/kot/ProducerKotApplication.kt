package com.svn.springtest.contract.kafka.producer.kot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ProducerKotApplication

fun main(args: Array<String>) {
    runApplication<ProducerKotApplication>(*args )
}
