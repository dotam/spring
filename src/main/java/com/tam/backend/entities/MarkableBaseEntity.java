package com.tam.backend.entities;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class MarkableBaseEntity extends BaseEntity {
	@Column(name="isDeleted")
	private Boolean isDeleted;

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public BaseEntity withIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
		return this;
	}
}
