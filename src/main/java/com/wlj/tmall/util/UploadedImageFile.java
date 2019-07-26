package com.wlj.tmall.util;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author wlj
 * @create 2019-07-25 9:59
 */
public class UploadedImageFile {

    MultipartFile image;

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }
}
