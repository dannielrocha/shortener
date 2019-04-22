package br.com.shortener.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.shortener.dao.UrlDAO;
import br.com.shortener.domain.Url;

@Service
public class UrlServiceImpl implements UrlService {
	
	private final UrlDAO dao;
	
	@Autowired
	public UrlServiceImpl(UrlDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public Url retrieve(Long id) {
		return dao.getOne(id);
	}

	@Override
	public Url save(Url url) {
		dao.save(url);		
		return url;
	}

	@Override
	public Optional<Url> getByUrl(String url) {
		return this.dao.getByUrl(url);
	}

	@Override
	public Optional<Url> getByShortened(String shortened) {
		return this.dao.getByShortened(shortened);
	}

	@Override
	public List<Url> getAll() {
		return this.dao.findAll();
	}
}
