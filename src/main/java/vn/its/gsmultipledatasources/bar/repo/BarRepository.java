package vn.its.gsmultipledatasources.bar.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.its.gsmultipledatasources.bar.domain.Bar;

@Repository
public interface BarRepository extends JpaRepository<Bar, Long> {

}
