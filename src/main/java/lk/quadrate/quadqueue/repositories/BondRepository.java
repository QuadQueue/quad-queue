package lk.quadrate.quadqueue.repositories;

import lk.quadrate.quadqueue.domains.Bond;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BondRepository extends JpaRepository<Bond,Long> {
}
