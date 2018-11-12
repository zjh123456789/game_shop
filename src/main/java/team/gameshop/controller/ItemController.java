package team.gameshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import team.gameshop.model.Category;
import team.gameshop.model.Item;
import team.gameshop.service.CategoryService;
import team.gameshop.service.ItemService;

import java.util.Date;
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
    @Autowired
    CategoryService categoryService;

    @RequestMapping("list")
    public String list(Model model){
        List<Item> items = itemService.list();
        List<Category> categories = categoryService.list();
        model.addAttribute("items",items);
        model.addAttribute("categories",categories);
        return "admin/listItem";
    }

    @RequestMapping("addItem")
    public String add(Item item){
        item.setCreateTime(new Date());
        item.setCreateUser("admin");
        item.setUpdateTime(new Date());
        item.setUpdateUser("admin");
        itemService.add(item);
        return "redirect:list";
    }

    @RequestMapping("deleteItem")
    public String delete(Integer id){
        itemService.delete(id);
        return "redirect:list";
    }

    @RequestMapping("editItem")
    public String jumpEdit(Model model, Integer id){
        Item item = itemService.get(id);
        model.addAttribute("item",item);
        return "admin/editItem";
    }

    @RequestMapping("updateItem")
    public String update(Item item){
        item.setUpdateTime(new Date());
        item.setUpdateUser("admin");
        itemService.update(item);
        return "redirect:list";
    }
}
