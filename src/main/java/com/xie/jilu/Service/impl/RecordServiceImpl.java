package com.xie.jilu.Service.impl;

import com.xie.jilu.Service.RecordService;
import com.xie.jilu.Service.ex.RecordAddException;
import com.xie.jilu.Service.ex.RecordNotFoundException;
import com.xie.jilu.entity.Record;
import com.xie.jilu.mapper.RecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author 桃缘十三
 * @date 2022/7/7 21:21
 */
@Service
public class RecordServiceImpl implements RecordService {
    @Autowired
    private RecordMapper recordMapper;

    @Override
    public List<Record> findAll() {
        List<Record> list = recordMapper.findAll();
        if (list == null) {
            throw new RecordNotFoundException("查询失败");
        }
        return list;
    }

    @Override
    public void addRecord() {
        Integer record = 1;
        Integer allrecord = 0;
        Record result = recordMapper.findLastRecord();
        if (result != null) {
            allrecord = result.getAllrecord();
        }
        allrecord++;
        Integer result1 = recordMapper.addRecord(record, allrecord, new Date());
        if (result1 != 1) {
            throw new RecordNotFoundException("添加失败");
        }
    }

    @Override
    public Record findLastRecord() {
        Record record = recordMapper.findLastRecord();
        System.out.println(record.getDate());
        if (record == null) {
            throw new RecordNotFoundException("查询失败");
        }
        return record;
    }

    @Override
    public void deleteLastRecord() {
        Record record = recordMapper.findLastRecord();
        if (record == null) {
            throw new RecordNotFoundException("该用户没有任何记录");
        }
        Integer id = record.getId();
        Integer result = recordMapper.deleteLastRecord(id);
        if (result != 1) {
            throw new RecordAddException("删除失败");
        }


    }

    /**
     * 查询一周内的所有数据
     * @return List<Record> 一周的数据
     */
    @Override
    public List<Record> findWeekRecord() {
        Record record = recordMapper.findLastRecord();
        if (record == null) {
            throw new RecordNotFoundException("该用户没有任何记录");
        }

        List<Record> records = recordMapper.findAll();
        if (records == null) {
            throw new RecordNotFoundException("查询失败");
        }

        return records;
    }

    /**
     * 查询今日数据
     * @return List<Record> 今日的数据
     */
    @Override
    public List<Record> findTodayRecord() {
        List<Record> records = recordMapper.findToDayRecord();
        if (records.size() == 0) {
            throw new RecordNotFoundException("查询失败");
        } else {
            for (Record record : records){
                record.setAllrecord(null);
            }
        }
        return records;
    }

    /**
     * 查询昨日数据
     * @return List<Record> 昨日的数据
     */

    @Override
    public List<Record> findYesterdayRecord() {
        Record record = recordMapper.findLastRecord();
        if (record == null) {
            throw new RecordNotFoundException("查询失败");
        }
        List<Record> records = recordMapper.findYesterdayRecord();
        return records;
    }

    /**
     * 查询本月数据
     * @return List<Record> 本月的数据
     */
    @Override
    public List<Record> findMonthRecord() {
        Record record = recordMapper.findLastRecord();
        if (record == null) {
            throw new RecordNotFoundException("查询失败");
        }
        List<Record> records = recordMapper.findMonthRecord();
        return records;
    }

    /**
     * 查询年度数据
     * @return List<Record> 年度的数据
     */

    @Override
    public List<Record> findYearRecord() {
        Record record = recordMapper.findLastRecord();
        if (record == null) {
            throw new RecordNotFoundException("查询失败");
        }
        List<Record> records = recordMapper.findYearRecord();
        return records;
    }
}
