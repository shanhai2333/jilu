package com.xie.jilu.mapper;

import com.xie.jilu.entity.Record;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;

/**
 * @author 桃缘十三
 * @date 2022/7/7 20:30
 */
@Mapper
public interface RecordMapper {
    /**
     * 查询所有记录
     * @return
     */
    List<Record> findAll();

    /**
     * 增加记录
     *
     * @return
     */
    Integer addRecord(Integer record, Integer allrecord, Date date);

    /**
     * 查询最近一次记录
     * @return
     */
    Record findLastRecord();

    /**
     * 根据查询最近一次记录，删除最近一次记录
     * @param id 最近一次记录的id
     * @return
     */
    Integer deleteLastRecord(Integer id);

}
