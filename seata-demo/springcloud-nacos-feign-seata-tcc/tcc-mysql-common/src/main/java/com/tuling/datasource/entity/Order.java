package com.tuling.datasource.entity;

import lombok.Data;

/**
 * @author Fox
 */
@Data
public class Order {
    private Long id;
    
    private String userId;
    /** 商品编号 */
    private String commodityCode;
    
    private Integer count;
    
    private Integer money;
    
    private Integer status;
}
