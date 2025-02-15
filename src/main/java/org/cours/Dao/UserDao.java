package org.cours.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<DaoUser, Long>{

	DaoUser findByUsername(String username);

}
