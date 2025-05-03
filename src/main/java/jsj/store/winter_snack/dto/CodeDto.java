package jsj.store.winter_snack.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Data
//@Entity
//@NoArgsConstructor
//@Table(name = "code")
public class CodeDto {

    private String codeId;
    private String codeDc;
    private String codeValue;
    private String codeNm;
    private Integer sortOrd;
    private String useYn;

    @Builder
    public CodeDto(String codeId, String codeDc, String codeValue, String codeNm, Integer sortOrd, String useYn) {
        this.codeId = codeId;
        this.codeDc = codeDc;
        this.codeValue = codeValue;
        this.codeNm = codeNm;
        this.sortOrd = sortOrd;
        this.useYn = useYn;
    }

}
