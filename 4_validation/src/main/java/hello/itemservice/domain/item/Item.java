package hello.itemservice.domain.item;

import lombok.Data;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.ScriptAssert;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
//@ScriptAssert(lang = "javascript", script = "_this.price * _this.quantity >= 10000")
public class Item {

    // groups 기능을 사용하기 위한 검증 코드
//    @NotNull(groups = UpdateCheck.class) // 수정시에만 적용
//    private Long id;
//
//    @NotBlank(groups = {SaveCheck.class, UpdateCheck.class}, message = "공백은 입력할 수 없습니다.")
//    private String itemName;
//
//    @NotNull(groups = {SaveCheck.class, UpdateCheck.class})
//    @Range(min = 1000, max = 1000000, groups = {SaveCheck.class, UpdateCheck.class})
//    private Integer price;
//
//    @NotNull(groups = {SaveCheck.class, UpdateCheck.class})
//    @Max(value = 9999, groups = SaveCheck.class) // 등록시에만 적용
//    private Integer quantity;
//
    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // 전송 전용 Form 사용
    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;
}
