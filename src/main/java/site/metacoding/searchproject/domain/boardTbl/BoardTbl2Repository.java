package site.metacoding.searchproject.domain.boardTbl;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BoardTbl2Repository extends JpaRepository<BoardTbl2, Integer>{
    
    @Query(value = "SELECT * FROM boardTbl2 WHERE title LIKE %:keyword%", nativeQuery = true)
    List<BoardTbl2> mSearch(@Param("keyword") String keyword);
}
