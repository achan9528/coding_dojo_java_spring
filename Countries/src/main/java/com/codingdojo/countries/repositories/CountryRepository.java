package com.codingdojo.countries.repositories;

import java.util.List;
import com.codingdojo.countries.models.Country;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface CountryRepository extends CrudRepository<Country, Long>{
	@Query("SELECT c.name, l.language, l.percentage FROM Country c JOIN c.languages l WHERE l.language='Slovene' ORDER BY l.percentage DESC")
	List<Object[]> join1();
	
	@Query("SELECT c.name, COUNT(ct) FROM Country c JOIN c.cities ct GROUP BY c.id ORDER BY COUNT(ct) DESC")
	List<Object[]> join2();
	
	@Query("SELECT c.name, ct.name, ct.population FROM Country c JOIN c.cities ct WHERE c.name='MEXICO' AND ct.population>500000 ORDER BY ct.population DESC")
	List<Object[]> join3();
	
}
