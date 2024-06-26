package com.mfc.payment.domain;

import com.mfc.payment.common.entity.BaseTimeEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Getter
public class Cash extends BaseTimeEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "uuid", nullable = false, unique = true)
	private String uuid;

	@Column(name = "cash_balance", nullable = false)
	private Double balance;

	@Builder
	public Cash(Long id, String uuid, Double balance) {
		this.id = id;
		this.uuid = uuid;
		this.balance = balance;
	}

	public void addBalance(Double amount) {
		this.balance += amount;
	}

	public void subtractBalance(Double amount) {
		this.balance -= amount;
	}
}
