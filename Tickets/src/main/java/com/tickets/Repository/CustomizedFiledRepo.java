package com.tickets.Repository;

import com.tickets.Entity.CustomizedFiled;
import com.tickets.Entity.Project;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomizedFiledRepo extends MongoRepository<CustomizedFiled,String>{
}
