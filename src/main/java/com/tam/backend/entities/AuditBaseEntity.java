package com.tam.backend.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AuditBaseEntity extends BaseEntity {
	@Column
	private Integer version;

	@Column
	private Date createdDate;

	@Column
	private Long createdBy;

	@Column
	private Date modifiedDate;

	@Column
	private Long modifiedBy;

	public Date getCreatedDate() {
		return createdDate;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public Long getModifiedBy() {
		return modifiedBy;
	}

	public Integer getVersion() {
		return version;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public void setModifiedBy(Long modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public AuditBaseEntity withCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
		return this;
	}

	public AuditBaseEntity withCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
		return this;
	}

	public AuditBaseEntity withModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
		return this;
	}

	public AuditBaseEntity withModifiedBy(Long modifiedBy) {
		this.modifiedBy = modifiedBy;
		return this;
	}

	public AuditBaseEntity withVersion(Integer version) {
		this.version = version;
		return this;
	}
}
