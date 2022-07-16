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
     * @return List<Record> 所有记录
     */
    List<Record> findAll();

    /**
     * 增加记录
     * @param record 记录
     * @param allrecord 总记录数
     * @param date 当前时间
     * @return String 增加成功
     */
    Integer addRecord(Integer record, Integer allrecord, Date date);

    /**
     * 查询最近一次记录
     * @return Record 最近一次记录
     */
    Record findLastRecord();

    /**
     * 根据查询最近一次记录，删除最近一次记录
     * @param id 最近一次记录的id
     * @return 删除的行数
     */
    Integer deleteLastRecord(Integer id);

    /**
     * 查询今天数据
     * @return List<Record> 今天的数据
     */
    List<Record> findToDayRecord();

    /**
     * 查询昨天数据
     * @return List<Record> 昨天的数据
     */
    List<Record> findYesterdayRecord();

    /**
     * 查询一周内的数据
     * @return List<Record> 一周的数据
     */
    List<Record> findWeekRecord();

    /**
     * 查询一月内的数据
     * @return List<Record> 一个月的数据
     */
    List<Record> findMonthRecord();

    /**
     * 查询一年的数据
     * @return List<Record> 一年的数据
     */
    List<Record> findYearRecord();

}
