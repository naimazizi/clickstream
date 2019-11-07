package acn.clickstream.dsc.repository;

import acn.clickstream.dsc.jpa_model.BounceVisit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BounceVisitRepo extends JpaRepository<BounceVisit, Long> {
    List<BounceVisit> findByTimestampBetween(long dateFrom, long dateTo);
}