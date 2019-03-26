package com.springbootmybatis.demo.mapper;

import com.springbootmybatis.demo.dao.Persion;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author xiongjieteng
 * @date 2019-01-24 - 20:41
 */
@Mapper
public interface PersionMapper {
    Persion getPersionById(Integer id);
}
