package com.lg.sjfz_json.controller;


import com.lg.sjfz_json.entity.EbookEntry;
import com.lg.sjfz_json.entity.vo.Ebook;
import com.lg.sjfz_json.service.EbookEntryService;
import com.lg.sjfz_json.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lm
 * @since 2021-03-27
 */
@RestController
@RequestMapping("/sjfz_json/ebook-entry")
public class EbookEntryController {
    @Autowired
    private EbookEntryService ebookEntryService;

    @Autowired
    private RedisTemplate redisTemplate;

    //测试框架
        @GetMapping("all")
    public R all(){
            List<EbookEntry> list = ebookEntryService.list();

            return R.ok().data("list",list);
   }

   //数据封装
    @GetMapping("getEbook")
    public R getEbook(){

       /* ValueOperations<String,Object> valueOperations = redisTemplate.opsForValue();
        //获取redis缓存中数据
        List<Ebook> book = (List<Ebook>)valueOperations.get("ebook");

        List<Ebook>  ebook= ebookEntryService.getEbook();
            if (CollectionUtils.isEmpty(book)) {
                redisTemplate.opsForValue().set("ebook", ebook);
            }*/

        List<Ebook>  ebook= ebookEntryService.getEbook();
       // redisTemplate.opsForValue().set("ebook", ebook);
            return R.ok().data("ebook",ebook);
    }

    //mp新增数据
    @PostMapping("addebook")
    public R addebook(@RequestBody EbookEntry ebookEntry){
        boolean ebook = ebookEntryService.save(ebookEntry);//save mp新增方法
        if(ebook){
            return R.ok();
        }else {
            return R.error();
        }
    }

}

