package com.fullstackdeveloper.springboot.data.query;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface DevTeamRepository extends CrudRepository<DevTeam, Integer> {
	
	@Query("select d from DevTeam d")
	List<DevTeam> getEntireTeam();
	
	
	@Query("select d from DevTeam d where d.technology = ?1")
	List<DevTeam> findTechMembers(String technology);
	
	
	@Query("select d from DevTeam d where d.technology = :technology")
	List<DevTeam> findTechMembersNamedParam(@Param("technology")String technology);

}
