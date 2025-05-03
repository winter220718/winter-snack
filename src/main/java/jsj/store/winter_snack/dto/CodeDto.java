package jsj.store.winter_snack.dto;

import lombok.Builder;
import lombok.Data;

@Data
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
