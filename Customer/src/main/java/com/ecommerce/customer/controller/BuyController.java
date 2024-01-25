package com.ecommerce.customer.controller;

import com.ecommerce.library.dto.ProductDto;
import com.ecommerce.library.model.Category;
import com.ecommerce.library.service.CategoryService;
import com.ecommerce.library.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BuyController {
    private final ProductService productService;

    private final CategoryService categoryService;

    @GetMapping("/sell")
    public String menu(Model model) {
        model.addAttribute("page", "Products");
        model.addAttribute("title", "Sale");
        List<Category> categories = categoryService.findAllByActivatedTrue();
        List<ProductDto> products = productService.products();
        model.addAttribute("products", products);
        model.addAttribute("categories", categories);
        return "indexSell";
    }

}
