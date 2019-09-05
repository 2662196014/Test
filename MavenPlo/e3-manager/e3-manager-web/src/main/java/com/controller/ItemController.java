package com.controller;

import com.pojo.TbItem;
import com.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 96454
 * 根据商品id查询商品信息
 */
    @Controller
public class ItemController {
    /**注入service层*/
   @Autowired(required = false)
   private ItemService itemservice;

    /**调用service层查询方法*/
    @RequestMapping("/item/{id}")
    @ResponseBody
    public TbItem getItemById(@PathVariable long id){
        System.out.println("1111111111---controller");
        TbItem item = itemservice.getItemByItemId(id);
        System.out.println(id+"----------controller");
        return item;
    }


}
