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
     * @return
     */
    List<Record> findAll();

    /**
     * 增加记录
     *
     * @return
     */
    void addRecord();

    /**
     * 查询最近一次记录
     *
     * @return
     */
    Record findLastRecord();

    /**
     * 根据查询最近一次记录，删除最近一次记录
     * @param id 最近一次记录的id
     * @return
     */
    void deleteLastRecord();

}
