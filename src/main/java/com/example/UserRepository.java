package com.example;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    public User findByUsername(String username);

    public User findByMailAddress(String mailAddress);
    
    public User findByPhoneNumber(int phoneNumber);

}