package com.comics.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "COMICS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ComicsEntity {

	@Id
	@Column (name = "COMIC_ID")
	private int comicId;
	
	@Column (name = "COMIC_NAME")
	private String comicName;
	
	@Column (name = "VOLUME")
	private String volume;
	
	@Column (name = "GENERE")
	private String genere;
	
	@Column (name = "AUTHOR")
	private String author;
	
	@Column (name = "RELEASE_DATE")
	private LocalDate releaseDate;
	
	@Column (name = "SEASON")
	private String season;
	
	@Column (name = "MERCH")
	private char merch;
}
