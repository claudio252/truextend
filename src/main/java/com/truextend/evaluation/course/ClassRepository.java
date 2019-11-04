package com.truextend.evaluation.course;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClassRepository extends MongoRepository<com.truextend.evaluation.course.Class, String> {
}
