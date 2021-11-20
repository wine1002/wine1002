package com.jiawa.wiki.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jiawa.wiki.domain.Ebook;
import com.jiawa.wiki.domain.EbookExample;
import com.jiawa.wiki.mapper.EbookMapper;
import com.jiawa.wiki.req.EbookReq;
import com.jiawa.wiki.resp.EbookResp;
import com.jiawa.wiki.resp.PageResp;
import com.jiawa.wiki.util.CopyUtil;
import com.mysql.cj.util.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class EbookService {
    @Resource
    private EbookMapper ebookMapper;
    public PageResp<EbookResp> list(EbookReq req){
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        if(!ObjectUtils.isEmpty(req.getName())) {
            criteria.andNameLike("%" + req.getName() + "%");
        }
        PageHelper.startPage(req.getPage(),req.getSize());
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);
//知道分页的总行数和总页数
        PageInfo<Ebook> pageInfo = new PageInfo<>(ebookList);
        pageInfo.getTotal();
        pageInfo.getPages();

//        List<EbookResp> respList = new ArrayList<>();
//        for (Ebook ebook:ebookList){
////           EbookResp ebookResp = new EbookResp();
////           BeanUtils.copyProperties(ebook,ebookResp);
//            //对象复制
//            EbookResp ebookResp=CopyUtil.copy(ebook,EbookResp.class);
//            respList.add(ebookResp);
//        }

        //列表复制
        List<EbookResp> list =CopyUtil.copyList(ebookList,EbookResp.class);
        PageResp<EbookResp> pageResp = new PageResp();
        pageResp.setTotal(pageInfo.getTotal());
        pageResp.setList(list);
        return pageResp;
    }
}
