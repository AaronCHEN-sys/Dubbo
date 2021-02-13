package com.java.service;

import java.util.List;
import java.util.Map;

/**
 * Description:	   <br/>
 * Date:     2021/02/01 21:03 <br/>
 *
 * @author Aaron CHEN
 * @see
 */
public interface ShopConsumerService {

    /**
     * 查询商品详细信息
     *
     * @return
     */
    List<Map<String, Object>> findGoodsDetail();
}
