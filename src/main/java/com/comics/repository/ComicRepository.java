package com.comics.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comics.entity.ComicsEntity;

public interface ComicRepository extends JpaRepository<ComicsEntity,Integer>{

}
