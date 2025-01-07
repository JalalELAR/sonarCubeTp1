package flight.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import flight.models.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long>,FlightRepositoryCustom{
}
