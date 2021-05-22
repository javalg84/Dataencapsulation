package com.lg.sjfz_json.dal;

import com.lg.sjfz_json.entity.EbookCategory;
import com.lg.sjfz_json.service.EbookCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;
import java.util.List;

@Configuration      //1.主要用于标记配置类，兼备Component的效果。
@EnableScheduling   // 2.开启定时任务
public class Cs {
    @Autowired
    private  EbookCategoryService ebookCategoryService;

    @Scheduled(cron = "0/5 * * * * ?")
    private  void alle(){
        List<EbookCategory> list = ebookCategoryService.list();
        for (EbookCategory ebookCategory : list) {
            System.out.println(ebookCategory+"*************"+new Date());
        }
    }
}
