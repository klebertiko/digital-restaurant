package com.drestaurant.customer.domain;

import java.util.UUID;

import org.axonframework.commandhandling.TargetAggregateIdentifier;

import com.drestaurant.common.domain.command.AuditableAbstractCommand;
import com.drestaurant.common.domain.model.AuditEntry;

/**
 * @author: idugalic
 * Date: 5/18/18
 * Time: 17:24 PM
 */
class MarkCustomerOrderAsCreatedCommand extends AuditableAbstractCommand{

	@TargetAggregateIdentifier
	private String targetAggregateIdentifier;

	public MarkCustomerOrderAsCreatedCommand(String targetAggregateIdentifier, AuditEntry auditEntry) {
		super(auditEntry);
		this.targetAggregateIdentifier = targetAggregateIdentifier;
	}

	public MarkCustomerOrderAsCreatedCommand(AuditEntry auditEntry) {
		this(UUID.randomUUID().toString(), auditEntry);
	}

	public String getTargetAggregateIdentifier() {
		return targetAggregateIdentifier;
	}

}