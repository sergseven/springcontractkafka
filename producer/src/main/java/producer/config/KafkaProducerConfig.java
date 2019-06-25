package producer.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;

@Configuration
@EnableKafka
@Slf4j
public class KafkaProducerConfig {

  @KafkaListener(topics = "springcontracttest")
  public void listen(@Payload String message) {
    log.info("Received Messasge in group - group-id: %s", message);
  }

}
