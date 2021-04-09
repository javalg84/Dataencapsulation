package com.lg.sjfz_json.entity.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

/*
* 数据封装
* */

@Data
public class Ebook {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    private String title;

    private String summary;

    private String uploaduser;

    private Date createdate;
}
