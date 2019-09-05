package com.service;


import com.pojo.TbItem;

/**
 * @param
 * @author 96454
 * 根据商品id查询商品信息 service层接口
 *
 */
public interface ItemService {
    /**
     * 根据商品id查询商品信息
     * @param id
     * @return TbItem
     */
    TbItem getItemByItemId(long id);

}
