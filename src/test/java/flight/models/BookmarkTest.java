package flight.models;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;



class BookmarkTest {
	FlightCriteria fc=new FlightCriteria();
	Date d=new Date(12365478923L);
	LocalDate ld=d.toLocalDate();
	
	Bookmark bookmark=new Bookmark(125L,"rayanair",ld,12,fc);
	Bookmark bookmarkSA=new Bookmark();

	
	@Test
	void testGetIdBookmark() {
		assertEquals(125L, bookmark.getIdBookmark());
	}

	@Test
	void testSetIdBookmark() {
		bookmark.setIdBookmark(555L);
		assertEquals(555L, bookmark.getIdBookmark());
	}

	@Test
	void testGetTitle() {
		assertEquals("rayanair", bookmark.getTitle());
	}

	@Test
	void testSetTitle() {
		bookmark.setTitle("turkish");
		assertEquals("turkish", bookmark.getTitle());
	}

	@Test
	void testGetAddingDate() {
		assertEquals(ld, bookmark.getAddingDate());
	}

	@Test
	void testSetAddingDate() {
		ld.minusYears(1);
		bookmark.setAddingDate(ld);
		assertEquals(ld, bookmark.getAddingDate());
		
	}

	@Test
	void testGetNbFlights() {
		assertEquals(12, bookmark.getNbFlights());
	}

	@Test
	void testSetNbFlights() {
		bookmark.setNbFlights(222);
		assertEquals(222, bookmark.getNbFlights());
	}

	@Test
	void testGetFlightCriteria() {
		assertEquals(fc, bookmark.getFlightCriteria());
	}

		
	@Test
	void testBookmarkLongStringLocalDateIntFlightCriteria() {
		assertNotNull(bookmark);
	}

	@Test
	void testBookmark() {
		assertNotNull(bookmarkSA);
	}

}
