package edu.mum.cs.cs452.safeairlines.repository;

import edu.mum.cs.cs452.safeairlines.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight,Long> {
}
