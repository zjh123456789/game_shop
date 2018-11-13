package team.gameshop.util;

import org.springframework.web.multipart.MultipartFile;

/**
 * @Description:    图片上传工具类
 * @Author:         Zhujinghui
 * @CreateDate:     2018/11/13 10:24
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
