package cn.shaonianyou.tacocloud.model.vo;

import cn.shaonianyou.tacocloud.model.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wei.zhang
 * @version 1.0
 * @description 配料VO
 * @date 2021/8/26
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IngredientVO extends BaseModel {

    /**
     * Id
     */
    private String id;

    /**
     * 配料名称
     */
    private String name;

    /**
     * 配料类型
     */
    private String type;

}
