/*
 * Copyright 2019 Walgreens Co.
 */
package producer.dto;

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
