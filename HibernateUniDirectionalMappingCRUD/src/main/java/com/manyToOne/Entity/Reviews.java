package com.manyToOne.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Reviews {

	@Id
	private int rid;
	
	private String comment;
	private int rating;
	
	@ManyToOne        // Not Use Cascade Type for ManyToOne
	private Product product;

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Reviews [rid=" + rid + ", comment=" + comment + ", rating=" + rating + ", product=" + product + "]";
	}
	
	
	
}
