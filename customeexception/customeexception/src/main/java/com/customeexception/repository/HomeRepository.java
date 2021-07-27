package com.customeexception.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customeexception.entity.Registration;

/**
 * This is jpa repository
 * @author Purv Patel
 *
 */
@Repository("homeRepository")
public interface HomeRepository extends JpaRepository<Registration, Long> {

}
