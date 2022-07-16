package com.xie.jilu.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author ShanHai
 * @date 2022/7/16 12:49
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RecordMapperTests {
    @Autowired
    private RecordMapper recordMapper;

    // 查询所有记录
    @Test
    public void findAll() {
        System.out.println(recordMapper.findAll());
    }
}
