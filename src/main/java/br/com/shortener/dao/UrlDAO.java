package br.com.shortener.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.shortener.domain.Url;

public interface UrlDAO extends JpaRepository<Url, Long>{

	@Query("SELECT url FROM Url url WHERE url.url = ?1")
	Optional<Url> getByUrl(String url);
	
	@Query("SELECT url FROM Url url WHERE url.shortened = ?1")
	Optional<Url> getByShortened(String shortened);
}
