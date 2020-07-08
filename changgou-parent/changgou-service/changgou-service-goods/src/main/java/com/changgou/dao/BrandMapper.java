package com.changgou.dao;

import com.changgou.goods.pojo.Brand;
import tk.mybatis.mapper.common.Mapper;

/*
* DAO使用通用Mapper,Dao接口需要继承tk.mybatis.mapper.common.Mapper
*
* 增加数据： Mapper.insert(T)
*          Mapper.insertSelective()
*
* 修改数据： Mapper.update(T)
*          Mapper.updateByPrimaryKey(T)
*
* 查询数据： Mapper.selectByPrimaryKey(ID)
*          Mapper.select(T)
* */
public interface BrandMapper extends Mapper<Brand> {

}
