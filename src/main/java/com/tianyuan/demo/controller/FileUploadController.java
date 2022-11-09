package com.tianyuan.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@RestController
public class FileUploadController {
    @PostMapping("/upload")
    public String upload(String name, MultipartFile file, HttpServletRequest request) throws IOException {

        String path = request.getServletContext().getRealPath("/upload/");
        System.out.println(path);
        saveFile(file,path);
        return "上传成功";
    }

    public void saveFile(MultipartFile file,String path) throws IOException {
        File dir = new File(path);
        if (dir.exists() ||dir.mkdir()) {
            File savedFile = new File(path+file.getOriginalFilename());
            System.out.println(savedFile);
            file.transferTo(savedFile);
        }
    }
}
