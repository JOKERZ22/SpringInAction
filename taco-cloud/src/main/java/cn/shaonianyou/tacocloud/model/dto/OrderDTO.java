package cn.shaonianyou.tacocloud.model.dto;

import cn.shaonianyou.tacocloud.model.BaseModel;
import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * @author wei.zhang
 * @version 1.0
 * @description 订单DTO
 * @date 2021/8/26
 **/
@Data
public class OrderDTO extends BaseModel {

    /**
     * 姓名
     */
    @NotBlank(message = "Name is required")
    private String name;

    /**
     * 街道
     */
    @NotBlank(message = "Street is required")
    private String street;

    /**
     * 城市
     */
    @NotBlank(message = "City is required")
    private String city;

    /**
     * 州
     */
    @NotBlank(message = "State is required")
    private String state;

    /**
     * 邮编
     */
    @NotBlank(message = "Zip code is required")
    private String zip;

    /**
     * 信用卡号
     */
    @CreditCardNumber(message = "Not a valid credit card number")
    private String ccNumber;

    /**
     * 信用卡过期时间
     */
    @Pattern(regexp = "^(0[1-9]|1[0-2])([\\/])([1-9][0-9])$", message = "Must be formatted MM/YY")
    private String ccExpiration;

    /**
     * 信用卡CVV码
     */
    @Digits(integer = 3, fraction = 0, message = "Invalid CVV")
    private String ccCVV;

}
