package com.example.workshopmongo.dto;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private String texto;
	private Date date;
	private AuthorDTO auDto;
	
	
	public CommentDTO () {
		
	}

	

	public CommentDTO(String texto, Date date, AuthorDTO auDto) {
		super();
		this.texto = texto;
		this.date = date;
		this.auDto = auDto;
	}



	public String getTexto() {
		return texto;
	}


	public void setTexto(String texto) {
		this.texto = texto;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public AuthorDTO getAuDto() {
		return auDto;
	}


	public void setAuDto(AuthorDTO auDto) {
		this.auDto = auDto;
	}
	
	
	
}
