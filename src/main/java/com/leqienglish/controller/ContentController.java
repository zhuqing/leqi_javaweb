package com.leqienglish.controller;

import com.leqienglish.model.Content;
import com.leqienglish.model.Message;
import com.leqienglish.model.Page;
import com.leqienglish.service.ContentServiceI;
import com.leqienglish.util.json.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;

/**
 * Created by zhuqing on 2017/8/24.
 */
@Controller
@RequestMapping("/content")
public class ContentController {

    @Autowired
    private ContentServiceI contentServiceI;

    @RequestMapping(value="/getContentById/{id}",method= RequestMethod.GET)
    public Content getContentById(Long id){
        return contentServiceI.findContentById(id);
    }

    @RequestMapping(value = "/getContentByType/{type}/{page}/{pageSize}",method = RequestMethod.GET)
    public List<Content> getContentByType(Integer type,Integer page,Integer pageSize){
        Page p = new Page();
        p.setPageSize(pageSize);
        p.setPage(page);

        return contentServiceI.findContentByType(type,p);
    }


    @RequestMapping(value = "/upload/{id}",method = RequestMethod.POST)
    public Message upload(@RequestParam(value = "file", required = false) MultipartFile file, HttpServletRequest request,@PathVariable Long id) {

        System.out.println("开始:"+id);
        String path = "d:/";
        String fileName = file.getOriginalFilename();
        System.out.println(path);
        File targetFile = new File(path, fileName);
        if(!targetFile.exists()){
            targetFile.mkdirs();
        }

        //保存
        try {
            file.transferTo(targetFile);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Message msg = new Message();
        msg.setMsg("ok");

        return msg;
    }
}
