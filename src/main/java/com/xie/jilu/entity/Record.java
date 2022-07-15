package com.xie.jilu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 桃缘十三
 * @date 2022/7/7 20:28
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Record implements Serializable {
    private Integer id;
    private Integer record;
    private Integer allrecord;
    private Date date;
}
