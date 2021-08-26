package cn.shaonianyou.tacocloud.model.dto;

import cn.shaonianyou.tacocloud.model.BaseModel;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * @author wei.zhang
 * @version 1.0
 * @description TacoDTO
 * @date 2021/8/26
 **/
@Data
public class TacoDTO extends BaseModel {

    /**
     * 名称
     */
    @NotBlank(message = "Name is required")
    @Size(min = 5, message = "Name must be at least 5 characters long")
    private String name;

    /**
     * 配料列表
     */
    @Size(min = 1, message = "You must choose at least 1 ingredient")
    private List<String> ingredients;

}
