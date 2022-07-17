package com.xie.jilu.controller;

import com.xie.jilu.Service.RecordService;
import com.xie.jilu.Service.ex.RecordNotFoundException;
import com.xie.jilu.entity.Record;
import com.xie.jilu.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 桃缘十三
 * @date 2022/7/7 21:52
 */
@RestController
@RequestMapping("/record")
public class RecordController {
    @Autowired
    private RecordService recordService;

    /**
     * 查询所有记录
     * @return JsonResult<List<Record>> 所有记录
     */
    @RequestMapping("/findAll")
    public JsonResult<List<Record>> findAll() {
        List<Record> list = recordService.findAll();
        return new JsonResult<>(200,list);
    }

    /**
     * 增加记录
     * @return JsonResult<List<Record>> 返回结果
     */
    @RequestMapping("/addRecord")
    public JsonResult<String> addRecord() {
        recordService.addRecord();
        return new JsonResult<>(200,"添加成功!");
    }

    /**
     * 查询最后一条记录
     * @return JsonResult<Record> 最后一条记录
     */
    @RequestMapping("/findLastRecord")
    public JsonResult<Record> findLastRecord() {
        Record record = recordService.findLastRecord();
        return new JsonResult<>(200,record);
    }

    /**
     * 删除最后一条记录
     * @return JsonResult<String> 返回结果
     */
    @RequestMapping("/deleteLastRecord")
    public JsonResult<String> deleteLastRecord() {
        recordService.deleteLastRecord();
        return new JsonResult<>(200,"删除成功!");
    }

    /**
     * 查询所有记录
     * @return JsonResult<List<Record>> 所有记录
     */
    @RequestMapping("/allRecord")
    public JsonResult<Integer> allRecord() {
        Integer record = recordService.findLastRecord().getAllrecord();
        return new JsonResult<>(200,record);
    }

    /**
     * 查询今日所有数据
     * @return
     */
    @RequestMapping("/todayRecord")
    public JsonResult<List<Record>> todayRecord() {
        List<Record> list = recordService.findTodayRecord();
        return new JsonResult<>(200,list);
    }

    /**
     * 查询昨日所有数据
     */
    @RequestMapping("/yesterdayRecord")
    public JsonResult<List<Record>> yesterdayRecord() {
        List<Record> list = recordService.findYesterdayRecord();
        return new JsonResult<>(200,list);
    }

    /**
     * 查询本周所有数据
     */
    @RequestMapping("/weekRecord")
    public JsonResult<List<Record>> weekRecord() {
        List<Record> list = recordService.findWeekRecord();
        return new JsonResult<>(200,list);
    }

    /**
     * 查询本月所有数据
     */
    @RequestMapping("/monthRecord")
    public JsonResult<List<Record>> monthRecord() {
        List<Record> list = recordService.findMonthRecord();
        return new JsonResult<>(200,list);
    }

    /**
     * 查询本年所有数据
     */
    @RequestMapping("/yearRecord")
    public JsonResult<List<Record>> yearRecord() {
        List<Record> list = recordService.findYearRecord();
        return new JsonResult<>(200,list);
    }


}
