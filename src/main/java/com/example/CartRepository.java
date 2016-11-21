package com.example;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
/**
 * 
 * @author bharat
 * 
 * @ReposiotryRestResource annotation makes this as rest resource on top of the given entity.
 * This interface extends the CrudRepository which is generic interface with a entity and its Id element as input parameters.
 * CurdRepository will takecare of all the crud operations on the particular Entity.
 *
 */
@RepositoryRestResource
public interface CartRepository extends CrudRepository<Cart, Long>{


}
