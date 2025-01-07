package flight.service;

import java.util.List;

import flight.dto.SyntheseCompanyDto;
import flight.dto.SyntheseTripDto;
import flight.models.Bookmark;
import flight.models.Flight;
import flight.models.FlightCriteria;
import flight.models.SynthesisCriteria;

public interface FlightService {
	List<Flight> searchFlight(FlightCriteria flightCriteria);
    List<Flight> getAllFlights();
    Flight getFlight(Long idFlight);
	Long getNumberFlights(SynthesisCriteria synthesisCriteria);
	List<SyntheseCompanyDto> getSyntheseCompanyFlights(SynthesisCriteria synthesisCriteria);
	List<SyntheseTripDto> getSyntheseTripFlights(SynthesisCriteria synthesisCriteria);
    Bookmark addBookmark(Bookmark bookmark);
    List<Bookmark> getAllBookmarks();
    Bookmark getBookmark(Long idBookmark);
    void deleteBookmark(Long idBookmark);
    void deleteAllBookmark();
	List<Bookmark> getBookmarkList(String userName);
}
