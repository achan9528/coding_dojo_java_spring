package com.codingdojo.countries.services;

import com.codingdojo.countries.repositories.*;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CountryService {
	private final CountryRepository cr;
	private final LanguageRepository lr;
	private final CityRepository ctr;
	public CountryService(CountryRepository cr,
			LanguageRepository lr, CityRepository ctr) {
		this.cr = cr;
		this.lr = lr;
		this.ctr = ctr;
	}
	
	public List<Object[]> join1(){
		return cr.join1();
	}
	
	public List<Object[]> join2(){
		return cr.join2();
	}
	
	public List<Object[]> join3(){
		return cr.join3();
	}
}