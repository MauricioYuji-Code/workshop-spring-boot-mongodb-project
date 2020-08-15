package com.example.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
	
	//Query Mwthods
	
	@Query("{ title: { $regex: ?0, $options: 'i' } }") //?0 aproveitar o valor do parametro "text"
	List<Post> searchTitle(String text);
	
	List<Post> findByTitleContainingIgnoreCase(String text);
	
	

}
