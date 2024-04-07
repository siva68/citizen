package com.codedecode;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CitizenRepo  extends JpaRepository <Citizen, Long>
{
	//public Citizen getCetizen(long id);
	public Citizen getById(int id);
}
