package com.svn.springtest.contract.kafka.producer;

import java.time.Clock;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
@Slf4j
public class ProducerApplication {

  public static void main(String[] args) {
    SpringApplication.run(ProducerApplication.class, args);
  }

  @Bean
  public Clock clock(){
    return Clock.systemUTC();
  }

//  @Autowired
//  private KafkaTemplate<String, String> template;
//
//  @Bean
//  public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//    return args -> {
//      log.info("App started.");
//
//      template.send("initialspringcontracttest", "foo_key2", "foo2");
////      template.send("springcontracttest", "foo_key2", "foo2");
//
//      log.info("Message(s) sent.");
//    };
//  }

}
