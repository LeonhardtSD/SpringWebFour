package com.gaozhaoxi.config;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author Leon
 */
@Controller
public class UploadController {
    @ResponseBody //他修饰的方法的返回值不再是转跳路径了，而是直接写入response体中，返回用户界面显示
    @RequestMapping(value="upload",method = RequestMethod.POST,produces = "text/plain;charset=UTF-8")
    public String upload(MultipartFile file){

        try {
            FileUtils.writeByteArrayToFile(new File("D:/home/gzxi1/"+file.getOriginalFilename()),file.getBytes());
            return "上传成功";
        } catch (IOException e) {
            e.printStackTrace();
            return "上传失败";
        }


    }
}
