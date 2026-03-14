package org.mvnsearch.mybatis.demo.web;

import org.mvnsearch.mybatis.demo.model.Shop;
import org.mvnsearch.mybatis.demo.repo.ShopMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shop")
public class ShopController {
    @Autowired
    private ShopMapper shopMapper;

    @GetMapping("/{id}")
    public Shop getShop(@PathVariable Integer id) {
        return shopMapper.findById(id);
    }

    @DeleteMapping("/{id}")
    public int deleteShop(@PathVariable Integer id) {
        return shopMapper.deleteById(id);
    }
}
