package team.gameshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import team.gameshop.model.Category;
import team.gameshop.service.CategoryService;

import java.util.List;

/**
 * @Description:     类别控制器
 * @Author:         Zhujinghui
 * @CreateDate:     2018/11/10 10:08
 */

@Controller
@RequestMapping("category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @RequestMapping("list")
    public String list(Model model){
        List<Category> categories = categoryService.list();
        model.addAttribute("categories",categories);
        return "admin/listCategory";
    }

    @RequestMapping("editCategory")
    public String jumpEdit(Model model, Integer id){
        Category category = categoryService.get(id);
        model.addAttribute("category",category);
        return "admin/editCategory";
    }

    @RequestMapping("updateCategory")
    public String update(Category category){
        categoryService.update(category);
        return "redirect:list";
    }

    @RequestMapping("deleteCategory")
    public String delete(Integer id){
        categoryService.delete(id);
        return "redirect:list";
    }

    @RequestMapping("addCategory")
    public String add(Category category){
        categoryService.add(category);
        return "redirect:list";
    }

}
