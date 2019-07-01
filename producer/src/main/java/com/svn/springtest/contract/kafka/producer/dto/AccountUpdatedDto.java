/*
 * Copyright 2019 Walgreens Co.
 */
package com.svn.springtest.contract.kafka.producer.dto;

import java.time.Instant;
import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class AccountUpdatedDto {
  String accountNumber;

  double balance;

  Instant modificationTimestamp;
}
