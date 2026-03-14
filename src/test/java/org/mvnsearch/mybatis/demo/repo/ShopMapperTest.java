package org.mvnsearch.mybatis.demo.repo;

import com.github.database.rider.core.api.dataset.DataSet;
import org.junit.jupiter.api.Test;
import org.mvnsearch.mybatis.demo.ProjectBaseTest;
import org.mvnsearch.mybatis.demo.model.Shop;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

@DataSet("db/dataset/shop.xml")
public class ShopMapperTest extends ProjectBaseTest {
    @Autowired
    ShopMapper shopMapper;

    @Test
    public void testGetShop() {
        Shop shop = shopMapper.findById(1);
        assertThat(shop).isNotNull();
    }

    @Test
    public void testFindByName() {
        Shop shop = shopMapper.findByName("Shop A");
        assertThat(shop).isNotNull();
        System.out.println(shop.getId());
    }

}
