package br.com.shortener.dto;

import br.com.shortener.domain.Url;

public class UrlDTO {

	private String url;
	
	private String shortened;
	
	public void fill(Url url) {
		url.setUrl(this.url);
		url.setShortened(shortened);
	}
	
	public static UrlDTO from(Url url) {
		UrlDTO urlDTO = new UrlDTO();
		
		urlDTO.setUrl(url.getUrl());
		urlDTO.setShortened(url.getShortened());
		
		return urlDTO;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getShortened() {
		return shortened;
	}

	public void setShortened(String shortened) {
		this.shortened = shortened;
	}
}
