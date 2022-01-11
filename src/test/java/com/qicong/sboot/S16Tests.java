package com.qicong.sboot;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

/**
 * User: 祁大聪
 */
@SpringBootTest
public class S16Tests {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    void testConnection(){
        String sql = "select curdate() from product_test2";
        String result = jdbcTemplate.queryForObject(sql,String.class);
        System.out.println("result = " + result);
    }
    @Test
    void testConnection2(){
        String sql = "select curdate() from product_test2";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql, 1000);
        System.out.println(list);
    }

}
