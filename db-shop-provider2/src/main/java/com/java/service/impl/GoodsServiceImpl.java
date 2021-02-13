package com.java.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.java.commons.api.GoodsService;
import com.java.mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * Description:	   <br/>
 * Date:     2021/01/26 22:26 <br/>
 *
 * @author Aaron CHEN
 * @see
 */
@Service(version = "1.0.0")
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public List<Map<String, Object>> findGoodsDetail() {
        return goodsMapper.selectGoodsDetail();
    }
}
