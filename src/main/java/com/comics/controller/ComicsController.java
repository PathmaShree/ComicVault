package com.comics.controller;
import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.comics.entity.ComicsEntity;

import com.comics.serviceimpl.ComicsServiceImpl;

@RestController
public class ComicsController {

	@Autowired
	ComicsServiceImpl c;
	
	@PostMapping(value = "/create")
	public ResponseEntity<?> createeComics(@RequestBody ComicsEntity entity) {
		ComicsEntity create = c.createComics(entity);
		return new ResponseEntity<ComicsEntity>(create,HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/getAll")
	public ResponseEntity<?> getAllComics(){
		try {
		  List<ComicsEntity> getAll = c.getComics();
		  return new ResponseEntity<List<ComicsEntity>>(getAll,HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping(value="/getOne/{id}")
	public ResponseEntity<?> getOneComic(@PathVariable int id){
		try {
		  ComicsEntity getOne = c.getOneComic(id);
		  return new ResponseEntity<ComicsEntity>(getOne,HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
		}
		
	}
	@DeleteMapping(value="/deleteOne/{id}")
	public ResponseEntity<?> deleteOneTicket(@PathVariable int id){
		try {
		  c.deleteComics(id);
		  return new ResponseEntity<ComicsEntity>(HttpStatus.NO_CONTENT);
		}
		catch(Exception e) {
		  return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
		}
		
	}
	@PutMapping(value="/updateAll/{id}")
	public ResponseEntity<?> updateAllComics(@PathVariable int id,@RequestBody ComicsEntity entity){
		try {
		  ComicsEntity updateComics = c.updateComics(id,entity);
		  return new ResponseEntity<ComicsEntity>(updateComics,HttpStatus.OK);
		}
		catch(Exception e) {
		  return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	}
	@PatchMapping(value="/updateOne/{id}")
	public ResponseEntity<?> updateOnlyOneComic(@PathVariable int id,@RequestBody ComicsEntity entity){
		try {
		  ComicsEntity updateOnlyOneComic = c.updateOnecomic(id, entity);
		  return new ResponseEntity<ComicsEntity>(updateOnlyOneComic,HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
		}
		
	}
	
	
}
