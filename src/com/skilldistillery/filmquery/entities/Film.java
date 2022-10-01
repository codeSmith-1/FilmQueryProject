package com.skilldistillery.filmquery.entities;

import java.util.List;
import java.util.Objects;

public class Film {
	int id;
	String title;
	String description;
	String releaseYear;
	int languageId;
	int rentalDuration;
	double rentalRate;
	int length;
	double replacementCost;
	String rating;
	String specialFeatures;
	List<Actor> actorsInFilm;
	String name;

	public Film() {
	}

public Film(int id, String title, String description, String releaseYear, int languageId, int rentalDuration,
			double rentalRate, int length, double replacementCost, String rating, String specialFeatures,
			List<Actor> actorsInFilm, String name) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.releaseYear = releaseYear;
		this.languageId = languageId;
		this.rentalDuration = rentalDuration;
		this.rentalRate = rentalRate;
		this.length = length;
		this.replacementCost = replacementCost;
		this.rating = rating;
		this.specialFeatures = specialFeatures;
		this.actorsInFilm = actorsInFilm;
		this.name = name;
	}

//	public Film(int id, String title, String description, String releaseYear, int languageId, int rentalDuration,
//			double rentalRate, int length, double replacementCost, String rating, String specialFeatures,
//			List<Actor> actorsInFilm) {
//		super();
//		this.id = id;
//		this.title = title;
//		this.description = description;
//		this.releaseYear = releaseYear;
//		this.languageId = languageId;
//		this.rentalDuration = rentalDuration;
//		this.rentalRate = rentalRate;
//		this.length = length;
//		this.replacementCost = replacementCost;
//		this.rating = rating;
//		this.specialFeatures = specialFeatures;
//		this.actorsInFilm = actorsInFilm;
//	}



	@Override
	public String toString() {
		return "Film Title: " + title + "\nDescription: " + description + "\nRelease Year: " + releaseYear
				+ "\nLanguage: " + name + "\nRating: " + rating + "\nStarring: " + actorsInFilm;
	}

	public List<Actor> getActorsInFilm() {
		return actorsInFilm;
	}

	public void setActorsInFilm(List<Actor> actorsInFilm) {
		this.actorsInFilm = actorsInFilm;
	}

	@Override
	public int hashCode() {
		return Objects.hash(actorsInFilm, description, id, languageId, length, name, rating, releaseYear,
				rentalDuration, rentalRate, replacementCost, specialFeatures, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Film other = (Film) obj;
		return Objects.equals(actorsInFilm, other.actorsInFilm) && Objects.equals(description, other.description)
				&& id == other.id && languageId == other.languageId && length == other.length
				&& Objects.equals(name, other.name) && Objects.equals(rating, other.rating)
				&& Objects.equals(releaseYear, other.releaseYear) && rentalDuration == other.rentalDuration
				&& Double.doubleToLongBits(rentalRate) == Double.doubleToLongBits(other.rentalRate)
				&& Double.doubleToLongBits(replacementCost) == Double.doubleToLongBits(other.replacementCost)
				&& Objects.equals(specialFeatures, other.specialFeatures) && Objects.equals(title, other.title);
	}

	protected String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	protected String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	protected String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}

	public int getLanguageId() {
		return languageId;
	}

	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}

	public int getRentalDuration() {
		return rentalDuration;
	}

	public void setRentalDuration(int rentalDuration) {
		this.rentalDuration = rentalDuration;
	}

	public double getRentalRate() {
		return rentalRate;
	}

	public void setRentalRate(double rentalRate) {
		this.rentalRate = rentalRate;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public double getReplacementCost() {
		return replacementCost;
	}

	public void setReplacementCost(double replacementCost) {
		this.replacementCost = replacementCost;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getSpecialFeatures() {
		return specialFeatures;
	}

	public void setSpecialFeatures(String specialFeatures) {
		this.specialFeatures = specialFeatures;
	}

}