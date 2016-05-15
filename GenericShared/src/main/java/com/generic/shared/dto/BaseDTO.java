package com.generic.shared.dto;

import java.sql.Timestamp;

public class BaseDTO {

	private Timestamp creationDate;
	private Timestamp lastUpdateDate;
	private Long creatorId;
	private Long lastUpdatorId;
	private boolean active;
	
	public Timestamp getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}
	public Timestamp getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(Timestamp lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	public Long getCreatorId() {
		return creatorId;
	}
	public void setCreatorId(Long creatorId) {
		this.creatorId = creatorId;
	}
	public Long getLastUpdatorId() {
		return lastUpdatorId;
	}
	public void setLastUpdatorId(Long lastUpdatorId) {
		this.lastUpdatorId = lastUpdatorId;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
}
