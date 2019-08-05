package com.adi.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {

    /*@Query(value = "SELECT * FROM user u WHERE u.name = searchName",nativeQuery = true )
    List <User> searchByName(@Param("searchName") String searchName);

    @Query(value = "SELECT u.name FROM user u",nativeQuery = true)
    List <User> displayName();*/

    String getUidByNameByEmail(@Param("searchName") String name,@Param("searchEmail") String email);

}
