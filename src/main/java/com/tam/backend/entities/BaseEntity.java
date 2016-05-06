package com.tam.backend.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BaseEntity withId(Long id) {
		this.id = id;
		return this;
	}
	

	@Override
    public boolean equals(Object other) {
        return (other instanceof BaseEntity) && (id != null)
            ? id.equals(((BaseEntity) other).id)
            : (other == this);
    }

    @Override
    public int hashCode() {
        return (id != null)
            ? (this.getClass().hashCode() + id.hashCode())
            : super.hashCode();
    }

    @Override
    public String toString() {
    	return String.format("%s[id=%d]", getClass().getSimpleName(), getId());
    }
}
