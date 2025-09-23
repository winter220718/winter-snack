package jsj.store.winter_snack.dto;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
//@NoArgsConstructor
@Table(name = "ws_code")
public class CodeDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "code_seq")
    private Long codeSeq;
    private String codeId;
    private String codeDc;
    private String codeValue;
    private String codeNm;
    private Integer sortOrd;
    private String useYn;

    @Builder
    public CodeDto(Long codeSeq, String codeId, String codeDc, String codeValue, String codeNm, Integer sortOrd, String useYn) {
        this.codeSeq = codeSeq;
        this.codeId = codeId;
        this.codeDc = codeDc;
        this.codeValue = codeValue;
        this.codeNm = codeNm;
        this.sortOrd = sortOrd;
        this.useYn = useYn;
    }

    public CodeDto() {

    }
}
