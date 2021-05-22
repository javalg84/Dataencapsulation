package com.lg.sjfz_json.controller.xz;

import com.lg.sjfz_json.entity.EbookCategory;
import com.lg.sjfz_json.service.EbookCategoryService;
import com.lg.sjfz_json.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sjfz_json/ebook-category")
public class EbookController {
    @Autowired
    private EbookCategoryService ebookCategoryService;
    @GetMapping("alle")
    public R alle(){
        List<EbookCategory> list = ebookCategoryService.list();
        return  R.ok().data("eli",list);
    }
}
