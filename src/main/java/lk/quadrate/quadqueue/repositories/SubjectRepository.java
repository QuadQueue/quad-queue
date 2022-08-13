package lk.quadrate.quadqueue.repositories;

import lk.quadrate.quadqueue.domains.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends JpaRepository<Subject,Long> {
}
