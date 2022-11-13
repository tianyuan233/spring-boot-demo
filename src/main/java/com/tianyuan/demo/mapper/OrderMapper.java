package com.tianyuan.demo.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tianyuan.demo.entity.Order;
import com.tianyuan.demo.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {

//    @Select("select * from t_order where uid = #{uid}")
//    List<Order> selectByUid(int uid);


    @Select("select * from t_order")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "total_price", property = "totalPrice"),
            @Result(column = "uid", property = "user", javaType = User.class,
                    one = @One(select = "com.tianyuan.demo.mapper.UserMapper.selectById")
            ),
    })
    List<Order> selectAllOrder();
}
