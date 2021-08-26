package cn.shaonianyou.tacocloud.model.po;

import cn.shaonianyou.tacocloud.model.BaseModel;
import lombok.Data;

import java.util.Date;

/**
 * @author wei.zhang
 * @version 1.0
 * @description 订单PO
 * @date 2021/8/26
 **/
@Data
public class OrderPO extends BaseModel {

    /**
     * Id
     */
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 街道
     */
    private String street;

    /**
     * 城市
     */
    private String city;

    /**
     * 州
     */
    private String state;

    /**
     * 邮编
     */
    private String zip;

    /**
     * 信用卡号
     */
    private String ccNumber;

    /**
     * 信用卡过期时间
     */
    private String ccExpiration;

    /**
     * 信用卡CVV码
     */
    private String ccCVV;

    /**
     * 创建时间
     */
    private Date placedAt;

}
