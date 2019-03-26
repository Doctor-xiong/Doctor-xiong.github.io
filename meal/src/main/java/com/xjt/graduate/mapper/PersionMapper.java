package com.xjt.graduate.mapper;

import com.xjt.graduate.po.Persion;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author xiongjieteng
 * @date 2019-01-24 - 20:41
 */
@Mapper
public interface PersionMapper {
    Persion getPersionById(Integer id);
}
