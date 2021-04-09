package com.lg.sjfz_json.service.impl;

import com.lg.sjfz_json.entity.EbookEntry;
import com.lg.sjfz_json.entity.vo.Ebook;
import com.lg.sjfz_json.mapper.EbookEntryMapper;
import com.lg.sjfz_json.service.EbookEntryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lm
 * @since 2021-03-27
 */
@Service
public class EbookEntryServiceImpl extends ServiceImpl<EbookEntryMapper, EbookEntry> implements EbookEntryService {


    @Override
    public List<Ebook> getEbook() {
        return baseMapper.getEbook();
    }
}
