package com.hewking.accessdata;

import com.hewking.accessdata.entity.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomRepository extends CrudRepository<CustomRepository,Long> {

    Customer findByID(long id);

    List<Customer> findByLastName(String lastName);

}
