package lk.quadrate.quadqueue.domains;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Builder
public class Chain implements Serializable {

    private Long id;
    private String chainName;
    private LocalDateTime createdAt;
}
