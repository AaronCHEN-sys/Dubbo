package com.java.controller;

import com.java.service.ShopConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Description:	   <br/>
 * Date:     2021/02/01 21:04 <br/>
 *
 * @author Aaron CHEN
 * @see
 */
@Controller
public class ShopConsumerController {

    @Autowired
    private ShopConsumerService shopConsumerService;

    /**
     * 查询商品详细信息
     *
     * @return
     */
    @RequestMapping("/getGoodsDetail.do")
    @ResponseBody
    public List<Map<String, Object>> getGoodsDetail() {
        return shopConsumerService.findGoodsDetail();
    }
}
