package com.mfc.payment.dto.request;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PaymentRequest {
	private String paymentId;
	private String paymentStatus;
	private Double amount;
	private LocalDateTime paymentDate;
}
