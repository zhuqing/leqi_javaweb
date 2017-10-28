package com.leqienglish.util;

import com.leqigame.entity.Message;

/**
 * Created by zhuqing on 2017/9/23.
 */
public class MessageUtil {
    public static <T> Message createMessage(String status , String msgStr , T data){
        Message<T> message = new Message<T>();
        message.setMsg(msgStr);
        message.setStatus(status);
        message.setData(data);
        return message;
    }

    public static <T> Message createSuccessMessage(T data){
        return createMessage("1","ok",data);
    }
}
