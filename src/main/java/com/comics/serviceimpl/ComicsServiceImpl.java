package com.comics.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.comics.entity.ComicsEntity;
import com.comics.repository.ComicRepository;
import com.comics.service.ComicService;

@Component
public class ComicsServiceImpl implements ComicService {
 @Autowired
 ComicRepository r;
	@Override
	public ComicsEntity createComics(ComicsEntity entity) {
		// TODO Auto-generated method stub
		ComicsEntity save = r.save(entity);
		return save;
	}

	@Override
	public ComicsEntity getOneComic(int id) {
		// TODO Auto-generated method stub
		 Optional<ComicsEntity> byId = r.findById(id);
		 //ComicsEntity comicsEntity = byId.get();
		if( byId.isPresent()) return  byId.get() ;
		else throw new RuntimeException("Comic not found with id: " + id);
	}

	@Override
	public List<ComicsEntity> getComics() {
		// TODO Auto-generated method stub
		List<ComicsEntity> getAll = r.findAll();
		if(getAll.isEmpty()) throw new RuntimeException("No comics found");
		return getAll;
	}

	@Override
	public ComicsEntity updateComics(int id, ComicsEntity entity) {
		// TODO Auto-generated method stub
		Optional<ComicsEntity> byId = r.findById(id);
		if(byId.isEmpty()) throw new RuntimeException("Comic not found with id : "+id);
		
		ComicsEntity comicsEntity =null;
		if(byId.isPresent()) {
			 comicsEntity = byId.get();
			comicsEntity.setComicId(entity.getComicId());
			comicsEntity.setComicName(entity.getComicName());
			comicsEntity.setVolume(entity.getVolume());
			comicsEntity.setGenere(entity.getGenere());
			comicsEntity.setAuthor(entity.getAuthor());
			comicsEntity.setReleaseDate(entity.getReleaseDate());
			comicsEntity.setSeason(entity.getSeason());
			comicsEntity.setMerch(entity.getMerch());
			
		}
		return r.save(comicsEntity);
	
	}

	@Override
	public void deleteComics(int id) {
		// TODO Auto-generated method stub
		if(!r.existsById(id)) throw new RuntimeException("Comic not found with id : "+id);
		r.deleteById(id);
		
	}

	@Override
	public ComicsEntity updateOnecomic(int id, ComicsEntity entity) {
		// TODO Auto-generated method stub
		Optional<ComicsEntity> byId = r.findById(id);
		if(byId.isEmpty()) throw new RuntimeException("Comic not found with id : "+id);
		ComicsEntity comicsEntity = null;
		if(byId.isPresent()) {
	    comicsEntity = byId.get();
	    comicsEntity.setVolume(entity.getVolume());
	    comicsEntity.setMerch(entity.getMerch());
		
	}
		return r.save(comicsEntity);
	}
}

	