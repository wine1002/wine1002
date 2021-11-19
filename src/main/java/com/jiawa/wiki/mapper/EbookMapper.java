package com.jiawa.wiki.mapper;

import com.jiawa.wiki.domain.Ebook;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EbookMapper {
    public List<Ebook> list();
}
