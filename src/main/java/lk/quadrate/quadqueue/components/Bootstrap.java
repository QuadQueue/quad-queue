package lk.quadrate.quadqueue.components;

import lk.quadrate.quadqueue.domains.Bond;
import lk.quadrate.quadqueue.domains.Chain;
import lk.quadrate.quadqueue.domains.Subject;
import lk.quadrate.quadqueue.repositories.BondRepository;
import lk.quadrate.quadqueue.repositories.ChainRepository;
import lk.quadrate.quadqueue.repositories.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {
    @Autowired
    private BondRepository bondRepository;
    @Autowired
    private ChainRepository chainRepository;
    @Autowired
    private SubjectRepository subjectRepository;
    @Override
    public void run(String... args) throws Exception {

        Bond bond = Bond.builder()
                .chain(chainRepository.save(new Chain("Chain-1")))
                .toSubject(subjectRepository.save(new Subject("Subject-1")))
                .withBond("ch1-to-sub-1")
                .build();

        bondRepository.save(bond);

    }
}
