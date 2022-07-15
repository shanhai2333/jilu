package com.xie.jilu.controller;

import com.xie.jilu.Service.RecordService;
import com.xie.jilu.entity.Record;
import com.xie.jilu.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
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

    @RequestMapping("/findAll")
    public JsonResult<List<Record>> findAll() {
        List<Record> list = recordService.findAll();
        return new JsonResult<List<Record>>(200,list);
    }

    @RequestMapping("/addRecord")
    public JsonResult<String> addRecord() {
        recordService.addRecord();
        return new JsonResult<String>(200,"添加成功!");
    }

    @RequestMapping("/findLastRecord")
    public JsonResult<Record> findLastRecord() {
        Record record = recordService.findLastRecord();
        return new JsonResult<Record>(200,record);
    }

    @RequestMapping("/deleteLastRecord")
    public JsonResult<String> deleteLastRecord() {
        recordService.deleteLastRecord();
        return new JsonResult<String>(200,"删除成功!");
    }

    @RequestMapping("/allRecord")
    public JsonResult<Integer> AllRecord() {
        Integer record = recordService.findLastRecord().getAllrecord();
        return new JsonResult<Integer>(200,record);
    }
}
