package com.leqienglish.util;

import com.leqigame.entity.Entity;

/**
 * Created by zhuqing on 2017/10/15.
 */
public class EntityUtil {

    public static void setDate(Entity entity){
         entity.setCreateDate(System.currentTimeMillis());
         entity.setStatus(0);
        reSetUpdateDate(entity);
    }

    public static void reSetUpdateDate(Entity entity){
        entity.setUpdateDate(System.currentTimeMillis());
    }
}
