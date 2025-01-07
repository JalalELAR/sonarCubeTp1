package flight.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import flight.models.Bookmark;

@Repository
public interface BookmarkRepository extends JpaRepository<Bookmark, Long>{
}
