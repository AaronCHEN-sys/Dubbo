package com.java.mapper;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Description:	   <br/>
 * Date:     2021/02/01 20:49 <br/>
 *
 * @author Aaron CHEN
 * @see
 */
@Repository
public interface GoodsMapper {

    /**
     * 查询商品详细信息
     *
     * @return
     */
    List<Map<String, Object>> selectGoodsDetail();
}
