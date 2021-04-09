package com.lg.sjfz_json.utils;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component  //不要忘记否则日期自动填充封装无效
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("createdate",new Date(),metaObject);  //自动填充当前时间 new Date()

    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("createdate",new Date(),metaObject);
    }
}
