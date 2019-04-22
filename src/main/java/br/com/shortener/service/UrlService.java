package br.com.shortener.service;

import java.util.List;
import java.util.Optional;

import br.com.shortener.domain.Url;

public interface UrlService {

	public Url retrieve(Long id);
	public Url save(Url url);
	public Optional<Url> getByUrl(String url);
	public Optional<Url> getByShortened(String shortened);
	public List<Url> getAll();
}
