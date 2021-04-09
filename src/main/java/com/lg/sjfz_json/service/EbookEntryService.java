package com.lg.sjfz_json.service;

import com.lg.sjfz_json.entity.EbookEntry;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lg.sjfz_json.entity.vo.Ebook;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lm
 * @since 2021-03-27
 */
public interface EbookEntryService extends IService<EbookEntry> {

    List<Ebook> getEbook();
}
