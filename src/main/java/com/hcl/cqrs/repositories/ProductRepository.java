package com.hcl.cqrs.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.hcl.cqrs.entities.CreateproductReq;

/**
 * Uses 'Spring Data JPA' and 'Spring Data Rest' to create a Repository.
 * The Repository can be used in the EventProcessor to create, read, update and delete the Products in the database.
 * This interface definition hides the Save and Delete operations from the automatically produced REST endpoint.
 * Rest endpoint uses the pluralised name of the Entity by default (/products).
 */

//@RepositoryRestResource(path = "products")
public interface ProductRepository extends CrudRepository<CreateproductReq, String> {

//    @Override
//    @RestResource(exported = false)//true means the capability will be offered via REST
//    <S extends CreateproductReq> S save(CreateproductReq createproductReq);

/*    @Override
    @RestResource(exported = false)//false restricts the capability from the REST API
    void delete(String id);*/
    
    @Override
    @RestResource(exported = false)
    void delete(CreateproductReq entity);

}
