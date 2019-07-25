package com.mjnari.location.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.mjnari.location.models.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {
	
	@Query(value="SELECT type,COUNT(*) FROM location GROUP BY type", nativeQuery=true)
	public List<Object[]> findTypeAndTypeCount();

}
