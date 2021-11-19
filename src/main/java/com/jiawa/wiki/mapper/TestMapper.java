package com.jiawa.wiki.mapper;

import com.jiawa.wiki.domain.Test;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.io.ResolverUtil;

import java.util.List;
@Mapper
@Repository
public interface TestMapper {
    public List<Test> list();
}
