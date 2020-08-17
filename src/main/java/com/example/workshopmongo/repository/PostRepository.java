package com.example.workshopmongo.repository;

import java.util.Date;
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
	
	@Query("{ $and: [ { date: {$gte: ?1} }, { date: { $lte: ?2} } , { $or: [ { 'title': { $regex: ?0, $options: 'i' } }, { 'body': { $regex: ?0, $options: 'i' } }, { 'comments.text': { $regex: ?0, $options: 'i' } } ] } ] }")
	//gte -> Maior ou igual lt -> Menor ou igual
	List<Post> fullSearch(String text, Date minDate, Date maxDate);// primeiro parametro 0?, segundo 1? e terceiro 3?
	
	

}
