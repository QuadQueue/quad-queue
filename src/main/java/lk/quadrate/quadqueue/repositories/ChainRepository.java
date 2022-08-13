package lk.quadrate.quadqueue.repositories;

import lk.quadrate.quadqueue.domains.Chain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChainRepository extends JpaRepository<Chain,Long> {
}
