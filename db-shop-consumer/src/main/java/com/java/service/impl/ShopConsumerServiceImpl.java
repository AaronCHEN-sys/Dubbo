package com.java.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.java.commons.api.GoodsService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Description:	   <br/>
 * Date:     2021/02/01 20:59 <br/>
 *
 * @author Aaron CHEN
 * @see
 */
@Component
public class ShopConsumerServiceImpl implements com.java.service.ShopConsumerService {

    @Reference(version = "1.0.0")
    private GoodsService goodsService;

    @Override
    public List<Map<String, Object>> findGoodsDetail() {
        return goodsService.findGoodsDetail();
    }
}
