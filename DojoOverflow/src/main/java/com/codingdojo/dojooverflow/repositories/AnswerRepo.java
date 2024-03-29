package com.codingdojo.dojooverflow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.dojooverflow.models.Answer;

@Repository
public interface AnswerRepo extends CrudRepository <Answer, Long> {

}
