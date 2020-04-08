package com.fullstackdeveloper.springboot.data.query;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevTeamController {

	
	@Autowired
	private DevTeamRepository repository;
	
	@GetMapping("/getDevTeam")
	public List<DevTeam> getDevTeam(){
		
		
		return repository.getEntireTeam();
		
	}
	
	@GetMapping("/getTechMembers")
	public List<DevTeam> getTechMembers(@RequestParam
			(name="technology")String technology){
		
		
		return repository.findTechMembers(technology);
		
	}
	
	@GetMapping("/getTechMembersNamed")
	public List<DevTeam> getTechMembersNamed(@RequestParam(name="technology")String technology){
		
		
		return repository.findTechMembersNamedParam(technology);
		
	}
}
