package com.entiros.springbootrestapiprojects.oauth.repository;

import com.entiros.springbootrestapiprojects.oauth.model.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AcccountRepository extends CrudRepository<Account, String> {
	
}
