package br.com.shortener.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "url")
public class Url implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	@Column(name = "url", nullable = false)
	private String url;
	
	@Column(name = "shortened", nullable = false)
	private String shortened;
	
	@Column(name = "usage", nullable = true)
	private Long urlUsage;

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_url")
	@Id
	@SequenceGenerator(name = "seq_url", initialValue = 12345678, allocationSize = 1)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	
	public Long getUrlUsage() {
		return urlUsage;
	}

	public void setUrlUsage(Long urlUsage) {
		this.urlUsage = urlUsage;
	}
}
