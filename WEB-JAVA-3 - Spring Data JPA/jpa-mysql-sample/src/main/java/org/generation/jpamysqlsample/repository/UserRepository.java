package org.generation.jpamysqlsample.repository;

import org.generation.jpamysqlsample.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository
    extends CrudRepository<User, String>
{

}
