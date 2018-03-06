package com.liang.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.File;
import java.net.URLDecoder;

@Component
@Scope("prototype")
@RequestMapping("/downloadFile")
public class DownloadController {

    @RequestMapping(value = "/download")
    public ResponseEntity<byte[]> download2(
            @RequestParam("path") String srcPath,
            @RequestParam("fileName") String fileName
            ) throws Exception {
        srcPath="F:\\项目\\FrameWorkspaces\\IDEA\\SpringMVC\\10SpringDownload\\target\\10SpringDownload"+srcPath;
        fileName = URLDecoder.decode(fileName, "UTF-8");
        System.out.println("**********************************开始下载文件********************************");
        System.out.println("**********************************下载请求path：" + srcPath + "********************************");
        System.out.println("**********************************下载请求fileName：" + fileName + "********************************");
        File file = new File(srcPath + File.separator + fileName);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        // 当文件名中有中文时，会出现乱码，通过new String(fileName.getBytes("utf-8"),"ISO8859-1")转换
        headers.setContentDispositionFormData("attchement",
                new String(fileName.getBytes("UTF-8"), "ISO-8859-1"));
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),
                headers, HttpStatus.CREATED);
    }
}
