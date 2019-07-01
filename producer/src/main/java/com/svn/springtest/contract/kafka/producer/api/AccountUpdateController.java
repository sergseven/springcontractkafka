/*
 * Copyright 2019 Walgreens Co.
 */
package com.svn.springtest.contract.kafka.producer.api;

import java.time.Clock;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.svn.springtest.contract.kafka.producer.dto.AccountUpdatedDto;

@RestController
@RequestMapping("/account")
@Slf4j
public class AccountUpdateController {
  @Autowired
  private KafkaTemplate<String, AccountUpdatedDto> kafkaTemplate;
//
//  @Autowired
//  private KafkaTemplate<String, String> stringKafkaTemplate;

  @Autowired
  private Clock clock;

  @GetMapping("/update")
  public String updateAccount() {
    log.info("Received initial command for account update");

    kafkaTemplate.send(
        "springcontracttest",
        AccountUpdatedDto.builder()
            .accountNumber("acc123")
            .balance(55.8)
            .modificationTimestamp(clock.instant())
            .build());

//    stringKafkaTemplate.send("springcontracttest_string_value", "string_value");

    return "Message sent.";
  }
}
