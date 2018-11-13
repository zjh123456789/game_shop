package team.gameshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.awt.image.BufferedImageDevice;
import team.gameshop.mapper.ItemPictureMapper;
import team.gameshop.model.Item;
import team.gameshop.model.ItemPicture;
import team.gameshop.service.ItemPictureService;
import team.gameshop.service.ItemService;
import team.gameshop.util.ImageUtil;
import team.gameshop.util.UploadedImageFile;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Date;
import java.util.List;

/**
 * @Description:    商品图片控制器
 * @Author:         Zhujinghui
 * @CreateDate:     2018/11/12 16:25
 */
@Controller
@RequestMapping("itemPicture")
public class ItemPictureController {

    @Autowired
    ItemPictureService itemPictureService;
    @Autowired
    ItemService itemService;

    @RequestMapping("list")
    public String listByItem(Model model,Integer itemId){
        Item item = itemService.get(itemId);
        List<ItemPicture> itemPictures = itemPictureService.list(itemId);
        model.addAttribute("item",item);
        model.addAttribute("itemPictures",itemPictures);
        return "admin/listItemPicture";
    }

    @RequestMapping("addItemPicture")
    public String add(ItemPicture itemPicture, UploadedImageFile uploadedImageFile, HttpSession session){
        itemPictureService.add(itemPicture);
        String fileName = itemPicture.getId()+ ".jpg";
        String imageFolder;
        String imageFolderSmall= null;
        String imageFolderMiddle= null;

        imageFolder= session.getServletContext().getRealPath("images/item");
        imageFolderSmall= session.getServletContext().getRealPath("images/item_small");
        imageFolderMiddle= session.getServletContext().getRealPath("images/item_middle");

        File f = new File(imageFolder, fileName);
        f.getParentFile().mkdirs();
        try {
            uploadedImageFile.getImage().transferTo(f);
            BufferedImage img = ImageUtil.change2jpg(f);
            ImageIO.write(img, "jpg", f);

            File fileSmall = new File(imageFolderSmall, fileName);
            File fileMiddle = new File(imageFolderMiddle, fileName);
            ImageUtil.resizeImage(f, 56, 56, fileSmall);
            ImageUtil.resizeImage(f, 217, 190, fileMiddle);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:list?itemId="+itemPicture.getItemId();
    }

    @RequestMapping("deleteItemPicture")
    public String delete(Integer id,HttpSession session){
        ItemPicture itemPicture = itemPictureService.get(id);

        String fileName = itemPicture.getId()+ ".jpg";
        String imageFolder;
        String imageFolderSmall = null;
        String imageFolderMiddle = null;

        imageFolder= session.getServletContext().getRealPath("images/item");
        imageFolderSmall= session.getServletContext().getRealPath("images/item_small");
        imageFolderMiddle= session.getServletContext().getRealPath("images/item_middle");

        File imageFile = new File(imageFolder,fileName);
        File fileSmall = new File(imageFolderSmall,fileName);
        File fileMiddle = new File(imageFolderMiddle,fileName);

        imageFile.delete();
        fileSmall.delete();
        fileMiddle.delete();

        itemPictureService.delete(id);

        return "redirect:list?itemId="+itemPicture.getItemId();

    }

}
