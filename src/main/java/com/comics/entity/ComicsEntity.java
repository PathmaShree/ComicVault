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
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ComicsEntity {

	@Id
	@Column (name = "COMIC_ID")
	private int comicId;
	
	@Column (name = "COMIC_NAME")
	private String comicName;
	
	public ComicsEntity(int comicId, String comicName, String volume, String genere, String author,
			LocalDate releaseDate, String season, char merch) {
		super();
		this.comicId = comicId;
		this.comicName = comicName;
		this.volume = volume;
		this.genere = genere;
		this.author = author;
		this.releaseDate = releaseDate;
		this.season = season;
		this.merch = merch;
	}

	public int getComicId() {
		return comicId;
	}

	public void setComicId(int comicId) {
		this.comicId = comicId;
	}

	public String getComicName() {
		return comicName;
	}

	public void setComicName(String comicName) {
		this.comicName = comicName;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public char getMerch() {
		return merch;
	}

	public void setMerch(char merch) {
		this.merch = merch;
	}

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
