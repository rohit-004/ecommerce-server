package com.rohitk.service;

import java.util.List;

import com.rohitk.exception.ProductException;
import com.rohitk.model.Review;
import com.rohitk.model.User;
import com.rohitk.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req, User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
}
