package team.gameshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import team.gameshop.mapper.ItemPictureMapper;
import team.gameshop.model.Item;
import team.gameshop.model.ItemPicture;
import team.gameshop.service.ItemPictureService;
import team.gameshop.service.ItemService;

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
    public String listByItem(Model model,Integer id){
        Item item = itemService.get(id);
        List<ItemPicture> itemPictures = itemPictureService.listByItem(item);
        model.addAttribute("itemPictures",itemPictures);
        model.addAttribute("item",item);
        return "admin/listItemPicture";
    }
}
