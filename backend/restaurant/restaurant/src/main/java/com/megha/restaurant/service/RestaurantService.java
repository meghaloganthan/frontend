package com.megha.restaurant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.megha.restaurant.model.restaurant;
import com.megha.restaurant.repository.RestaurantRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

@Service
public class RestaurantService {
	
	@Autowired
	private RestaurantRepository res;
	@Autowired
	   EntityManager entityManager;
	public restaurant saveDetails(restaurant r) {
		return res.save(r);
	}
	public List <restaurant> getAllDetails() {
  		return res.findAll();
  	}
	public boolean deleteDetails(int customerId)
	{
		  try {
	            res.deleteById(customerId);
	        }
	        catch (Exception e) {
	              e.printStackTrace();
	              return false;
	        }
	        return true;
	    }

	public restaurant SaveAndFlush(restaurant r) {
		return res.saveAndFlush(r);
	}
	
	public List<restaurant> findProductWithSorting(String field) {
		return res.findAll(Sort.by(Sort.Direction.ASC,field));
		
	}
	


}


