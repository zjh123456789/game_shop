package team.gameshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import team.gameshop.mapper.ItemMapper;
import team.gameshop.model.Item;
import team.gameshop.service.ItemService;

import java.util.List;

/**
 * @Description:    商品控制器
 * @Author:         Zhujinghui
 * @CreateDate:     2018/11/12 16:25
 */
@Controller
@RequestMapping("item")
public class ItemController {

    @Autowired
    ItemService itemService;

    @RequestMapping("list")
    public String list(Model model){
        List<Item> items = itemService.list();
        model.addAttribute("items",items);
        return "admin/listItem";
    }

    @RequestMapping("addItem")
    public String add(Item item){
        itemService.add(item);
        return "redirect:list";
    }
}
