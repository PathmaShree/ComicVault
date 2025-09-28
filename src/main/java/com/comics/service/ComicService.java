package com.comics.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.comics.entity.ComicsEntity;

@Service
public interface ComicService {
	ComicsEntity createComics(ComicsEntity entity);
	ComicsEntity getOneComic(int id);
	List<ComicsEntity> getComics();
	ComicsEntity updateComics(int id,ComicsEntity entity);
	ComicsEntity updateOnecomic(int id,ComicsEntity entity);
	void deleteComics(int id);

	
	

}
