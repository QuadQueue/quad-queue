package lk.quadrate.quadqueue.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@NoArgsConstructor
public class Bond implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bond;
    @OneToOne
    private Chain chain;
    @OneToOne
    private Subject subject;

    public Bond(Long id, String bond, Chain chain, Subject subject) {
        this.id = id;
        this.bond = bond;
        this.chain = chain;
        this.subject = subject;
    }

    public static BondBuilder builder(){
        return new BondBuilder();
    }

    public static class BondBuilder{
        private Long id;
        private String bond;
        private Chain chain;
        private Subject subject;

        BondBuilder(){}
        private BondBuilder id(){
            this.id=null;
            return this;
        }
        public BondBuilder chain(Chain chain){
            this.chain=chain;
            return this;
        }
        public BondBuilder toSubject(Subject subject){
            this.subject =subject;
            return  this;
        }
        public BondBuilder withBond(String bond){
            this.bond = bond;
            return this;
        }

        public Bond build(){
            return new Bond(this.id,this.bond,this.chain,this.subject);
        }
    }
}
