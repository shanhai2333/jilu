package com.xie.jilu.Service;

import com.xie.jilu.entity.Record;

import java.util.List;

/**
 * @author 桃缘十三
 * @date 2022/7/7 21:19
 */
public interface RecordService {
    /**
     * 查询所有记录
     * @return List<Record>
     */
    List<Record> findAll();

    /**
     * 增加记录
     */
    void addRecord();

    /**
     * 查询最近一次记录
     * @return Record 最近一次记录
     */
    Record findLastRecord();

    /**
     * 根据查询最近一次记录，删除最近一次记录
     */
    void deleteLastRecord();

    /**
     * 查询一周内的记录
     * @return List<Record> 一周内的记录
     */
    List<Record> findWeekRecord();

}
