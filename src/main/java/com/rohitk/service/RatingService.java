package com.rohitk.service;

import java.util.List;

import com.rohitk.exception.ProductException;
import com.rohitk.model.Rating;
import com.rohitk.model.User;
import com.rohitk.request.RatingRequest;

public interface RatingService {

	public Rating createRating(RatingRequest req, User user)throws ProductException;
	
	public List<Rating>getProductsRating(Long productId);
	
}
