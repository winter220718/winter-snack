package jsj.store.winter_snack.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "ws_item")
public class ItemDto {

    @Id
    private Long item_code;
    private String item_nm;
    private String item_price;
    private String item_cl;
    private String item_des;
    private String file_no;
    private String use_yn;

    private String codeValue;


}
