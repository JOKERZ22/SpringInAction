package cn.shaonianyou.tacocloud.model.dto;

import cn.shaonianyou.tacocloud.model.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author wei.zhang
 * @version 1.0
 * @description 配料DTO
 * @date 2021/8/26
 **/
@Data
@AllArgsConstructor
public class IngredientDTO extends BaseModel {

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
