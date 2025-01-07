package flight.repository;

import java.util.List;

import flight.dto.SyntheseCompanyDto;
import flight.dto.SyntheseTripDto;
import flight.models.Bookmark;
import flight.models.Flight;
import flight.models.FlightCriteria;
import flight.models.SynthesisCriteria;

public interface FlightRepositoryCustom {
	List<Flight> searchFlight(FlightCriteria flightCriteria);
	Long getNumberFlights(SynthesisCriteria synthesisCriteria);
	List<SyntheseCompanyDto> getSyntheseCompanyFlights(SynthesisCriteria synthesisCriteria);
	List<SyntheseTripDto> getSyntheseTripFlights(SynthesisCriteria synthesisCriteria);
	List<Bookmark> getBookmarkList(String userName);
}
