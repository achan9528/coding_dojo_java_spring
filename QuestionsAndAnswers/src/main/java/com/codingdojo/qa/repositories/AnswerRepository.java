package com.codingdojo.qa.repositories;

import java.util.List;
import com.codingdojo.qa.models.Answer;
import org.springframework.data.repository.CrudRepository;

public interface AnswerRepository extends CrudRepository<Answer,Long>{
	List<Answer> findAll();
}
