package org.academiadecodigo.thunderstructs.model;

import java.util.LinkedList;
import java.util.List;

public class CompanyModel implements Model {

	private Integer days = 0;
	private static Integer counter = 0;
	private Integer id;
	private double rating;
	private String name;
	private List<ReviewModel> reviews;

	public CompanyModel() {
		reviews = new LinkedList<>();
		this.counter++;
		this.id = this.counter;
	}

	public double getRating () {
		return rating;
	}

	public void setRating ( double rating ) {
		this.rating = rating;
	}

	@Override
	public Integer getId () {
		return this.id;
	}

	@Override
	public void setId (Integer id) {
		this.id = id;
	}

	public Integer getDays () {
		return days;
	}

	public void setDays ( Integer days ) {
		this.days = days;
	}

	public void setName( String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public List<ReviewModel> getReviews() {
		return reviews;
	}

	public void setReviews(List<ReviewModel> reviews) {
		this.reviews = reviews;
	}

	public void addReview(ReviewModel review){
		reviews.add(review);
	}

}