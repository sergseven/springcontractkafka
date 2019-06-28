package com.svn.springtest.contract.kafka.consumer.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;

@Configuration
@EnableKafka
@Slf4j
public class KafkaConsumerConfig {

  @KafkaListener(topics = "springcontracttest")
  public void listen(@Payload String message) {
    log.info("Received Messasge in group - group-id: {}", message);
  }

}
