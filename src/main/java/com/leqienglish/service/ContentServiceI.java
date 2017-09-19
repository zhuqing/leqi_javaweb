package com.leqienglish.service;

import com.leqienglish.model.Content;
import com.leqienglish.model.Page;

import java.util.List;

/**
 * Created by zhuqing on 2017/8/24.
 */
public interface ContentServiceI {
    public Content findContentById(Long id);

    public List<Content> findContentByType(Integer type, Page page);
}
