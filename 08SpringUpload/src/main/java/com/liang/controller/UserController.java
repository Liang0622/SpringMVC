package com.liang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UserController {

    /*//单文件上传
    @RequestMapping("/add")
    public String uploadFile(MultipartFile file, HttpSession session){
        String path= session.getServletContext().getRealPath("/files");
        String fileName=file.getOriginalFilename();
        try{
            file.transferTo(new File(path,fileName));
        }catch (IOException e){
            e.printStackTrace();
        }
        return "success";
    }*/

    //多文件同时上传
    @RequestMapping("/add")
    public String uploadFiles(@RequestParam MultipartFile[] files,HttpSession session){
        String path=session.getServletContext().getRealPath("/files");
        for (MultipartFile file:files){
            String fileName=file.getOriginalFilename();
            try {
                file.transferTo(new File(path,fileName));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "success";
    }
}
