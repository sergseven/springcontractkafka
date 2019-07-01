package com.svn.springtest.contract.kafka.consumer.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;

@Configuration
@EnableKafka
@Slf4j
public class KafkaConsumerConfig {

  @KafkaListener(topics = "springcontracttest")
  public void listen(
      @Header(value = KafkaHeaders.RECEIVED_MESSAGE_KEY, required = false) String messageKey,
      @Payload String message) {
    log.info("Received Messasge in group - group-id[{}]: {}", messageKey, message);
  }

}
