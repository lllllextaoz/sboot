package com.qicong.sboot.s19;

import org.apache.ibatis.annotations.Mapper;

/**
 * authdao
 *
 * @author gormanbeatrice
 * @create 2022 03 12 00:59
 */
@Mapper
public interface AuthDao {

    public String getPassword(String username);
}
