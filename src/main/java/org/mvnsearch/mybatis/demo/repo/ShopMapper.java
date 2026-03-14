package org.mvnsearch.mybatis.demo.repo;

import org.apache.ibatis.annotations.Mapper;
import org.jspecify.annotations.Nullable;
import org.mvnsearch.mybatis.demo.model.Shop;

/**
 * shop mapper
 *
 * @author linux_china
 */
@Mapper
public interface ShopMapper {

    @Nullable
    Shop findById(Integer id);

    @Nullable
    Shop findByName(String name);
}
