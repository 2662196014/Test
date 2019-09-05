package com.service.impl;

import com.mappers.TbItemMapper;
import com.pojo.TbItem;
import com.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 96454
 * 根据商品的id查询商品信息service层接口实现类
 */
@Service
public class ItemServiceImpl implements ItemService {
    /**
     * 注入mapper层接口
     */
    @Autowired(required = false)
    private TbItemMapper itemMapper;

    /**
     * 根据商品id查询商品信息
     *
     * @param id
     */
    @Override
    public TbItem getItemByItemId(long id) {
        /**调用mapper层查询方法*/
        TbItem item = itemMapper.selectByPrimaryKey(id);
        System.out.println(item + "--------service");
        //判断商品信息
        if (null != item) {
            return item;
        }
        return null;
    }
}
