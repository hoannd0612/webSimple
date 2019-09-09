package hoannd.websimple.controller;

import hoannd.websimple.entity.CategoryEntity;
import hoannd.websimple.exception.ExceptionMessage;
import hoannd.websimple.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {


    private CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping(value = "/category")
    public ResponseEntity loadAllCategory() {
        try {
            List<CategoryEntity> categoryList = categoryService.loadAllCategoty();
            if (categoryList == null) {
                return new ResponseEntity("no category found", HttpStatus.OK);
            } else {
                return new ResponseEntity(categoryList, HttpStatus.OK);
            }

        } catch (Exception e) {
            return new ResponseEntity(new ExceptionMessage(e.getMessage()), HttpStatus.CONFLICT);
        }
    }
}
