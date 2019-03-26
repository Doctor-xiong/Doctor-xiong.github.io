package com.springbootmybatis.demo.provider;

import com.springbootmybatis.demo.dao.Persion;
import com.springbootmybatis.demo.mapper.PersionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiongjieteng
 * @date 2019-01-24 - 20:42
 */
@RestController
public class PersionProvider {

    @Autowired
    private PersionMapper persionMapper;

    @RequestMapping("/getPersionById/{id}")
    public Persion getPersionById(@PathVariable("id") Integer id){
        return persionMapper.getPersionById(id);
    }

}
