package com.leqienglish.service.impl;

import com.leqienglish.dao.ContentDao;
import com.leqienglish.model.Content;
import com.leqienglish.model.Page;
import com.leqienglish.service.ContentServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhuqing on 2017/8/24.
 */
@Service
public class ContentService implements ContentServiceI {
    @Autowired
    private ContentDao contentDao;
    public Content findContentById(Long id) {
        return contentDao.findContentById(id);
    }

    public List<Content> findContentByType(Integer type, Page page) {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("type",type);
        map.put("startIndex",page.getStartIndex());
        map.put("size",page.getPageSize());
        return null;
    }
}
