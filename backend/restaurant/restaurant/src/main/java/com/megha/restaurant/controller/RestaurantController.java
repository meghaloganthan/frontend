package com.megha.restaurant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.megha.restaurant.model.restaurant;
import com.megha.restaurant.service.RestaurantService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class RestaurantController {
	
	@Autowired
	private RestaurantService rservice;
	
	
	
	@PostMapping("/")
	public int getDetails(@RequestBody restaurant r) {
		restaurant r1 = rservice.saveDetails(r);
		int i = r1.getOrderno();
		return i;
	}
	@GetMapping("/")
	public List<restaurant> getDetails(){
		return rservice.getAllDetails();
	}
//	@GetMapping("/getcustomer/{pageNo}/{pageSize}")
//	public List <restaurant> getDetails(@PathVariable int pageNo,@PathVariable int pageSize){
//		return rservice.getAllDetails(pageNo,pageSize);
//	}
//	@GetMapping("/customer/{field}")
//	
//	public List <restaurant> getProductsWithSort(@PathVariable String field){
//	List <restaurant> allProducts = rservice.findProductWithSorting(field);
//	return allProducts;
//	}
//	@GetMapping("/getRestaurant/{field}")
//	public List <restaurant> findAllRestaurant(@PathVariable("field") String field){
//		return rservice.findAllCustomerWithMobile(field);
//	}
//	
	
	@PutMapping("/putcustomer")
	public String updateDetails(@RequestBody restaurant r) {
		rservice.SaveAndFlush(r);
		return "Value Updated";
	}
	
	//JPQL to return all the table data
		
	
	  
	@DeleteMapping("/delete/{orderno}")
	public String deletetime(@PathVariable int orderno)
	{
	if(rservice.deleteDetails(orderno))
		return "Deleted sucessfully";
	return "orderno not found";

	}
}