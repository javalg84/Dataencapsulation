package com.lg.sjfz_json.mapper;

import com.lg.sjfz_json.entity.EbookEntry;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lg.sjfz_json.entity.vo.Ebook;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lm
 * @since 2021-03-27
 */
public interface EbookEntryMapper extends BaseMapper<EbookEntry> {

    List<Ebook> getEbook();
}
