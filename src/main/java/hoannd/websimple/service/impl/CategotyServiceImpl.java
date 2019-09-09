package hoannd.websimple.service.impl;

import hoannd.websimple.entity.CategoryEntity;
import hoannd.websimple.repository.CategoryRepository;
import hoannd.websimple.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategotyServiceImpl implements CategoryService {


    private CategoryRepository categoryRepository;

    @Autowired
    public CategotyServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<CategoryEntity> loadAllCategoty() {
        return categoryRepository.findAll();
    }
}
