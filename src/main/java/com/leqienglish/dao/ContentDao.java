package com.leqienglish.dao;

import com.leqigame.entity.Content;

import java.util.List;
import java.util.Map;

/**
 * Created by zhuqing on 2017/8/24.
 */
public interface ContentDao {

    public List<Content> findContentByUserId(Long userId);

    public Long saveContent(Content content);
    /**
     *根据ID查找Content
     * @param id
     * @return
     */
    public Content findContentById(Long id);

    /**
     *  根据类型分页查找Content
     * @param parameter
     * @return
     */
    public List<Content> findAllContentByType(Map<String,?> parameter);


}
