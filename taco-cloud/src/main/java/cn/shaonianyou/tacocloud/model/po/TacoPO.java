package cn.shaonianyou.tacocloud.model.po;

import cn.shaonianyou.tacocloud.model.BaseModel;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author wei.zhang
 * @version 1.0
 * @description TacoPO
 * @date 2021/8/26
 **/
@Data
public class TacoPO extends BaseModel {

    /**
     * Id
     */
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 配料列表
     */
    private List<String> ingredients;

    /**
     * 创建时间
     */
    private Date createAt;

}
