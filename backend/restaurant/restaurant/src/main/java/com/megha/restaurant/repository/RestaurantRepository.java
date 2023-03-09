package com.megha.restaurant.repository;


import org.springframework.data.jpa.repository.JpaRepository;


import com.megha.restaurant.model.restaurant;

public interface RestaurantRepository extends JpaRepository<restaurant, Integer> {

//	// Native query
//	@Query(
//		value="select * from restaurant h where h.mobileno = ?1", nativeQuery = true	)
//	List<restaurant> findAllCustomerNative(String mobileno);
//}
  
	
  //JPQL Query 
//  @Query("select h from restaurant h")
//  List<restaurant> findAllrestaurantQuery();
//  
//  
////updating the place where id=?
//  @Modifying
//  @Query("update restaurant h set h.name=?1 where h.time=?2")
//  int updaterestaurantnamebytime(String name, int time); 
//  
//  //deleting
//  @Modifying
//  @Query("delete from restaurant h where h.name=:name ")
//  int deleterestaurantByname(@Param("name") String title);
//  
  
}
