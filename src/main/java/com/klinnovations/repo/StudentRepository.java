/**
 * 
 */
package com.klinnovations.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klinnovations.entity.StudentEntity;

/**
 * @author user
 *
 */
public interface StudentRepository extends JpaRepository<StudentEntity, Integer>{

}
