package team.gameShop.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import team.gameshop.model.Category;
import team.gameshop.model.Item;
import team.gameshop.service.CategoryService;
import team.gameshop.service.ItemService;

import java.util.List;

/**
 * Created by admin on 2018/11/12
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestInterface {

    @Autowired
    private CategoryService categoryService;
    @Autowired
    ItemService itemService;

    @Test
    public void listCategory(){
        List<Category> categories = categoryService.list();
        printInfo(categories);
    }

    @Test
    public void deleteCategory(){
        categoryService.delete(1);
    }


    public void printInfo(List<Category> categories){
        for (Category category : categories){
            System.out.println(category.getId() + " " + category.getCategoryName() + " " + category.getDeleteFlag());
        }
    }

    @Test
    public void listItem(){
        List<Item> items = itemService.list();
        for (Item item : items){
            System.out.println(item.getItemDescription());
        }
    }

}
