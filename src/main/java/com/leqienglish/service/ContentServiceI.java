package com.leqienglish.service;

import com.leqienglish.model.Page;
import com.leqigame.entity.Content;

import java.util.List;

/**
 * Created by zhuqing on 2017/8/24.
 */
public interface ContentServiceI {
    public Content findContentById(Long id);

    public List<Content> findContentByUser(Long userId);

    public Long saveContent(Content content);

    public List<Content> findContentByType(Integer type, Page page);

    /**
     * 通过用户Id获取文章
     * @param userId
     * @return
     */
    public List<Content> getContentByUserId(Long userId);
}
