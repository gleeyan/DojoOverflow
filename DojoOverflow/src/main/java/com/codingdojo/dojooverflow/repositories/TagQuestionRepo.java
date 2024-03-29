package com.codingdojo.dojooverflow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.dojooverflow.models.TagQuestion;

@Repository
public interface TagQuestionRepo extends CrudRepository <TagQuestion, Long> { 

}
