package lk.quadrate.quadqueue.domains;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class Bond implements Serializable {

    private Long id;
    private String bond;
    private Chain chain;
    private Subject subject;
}
