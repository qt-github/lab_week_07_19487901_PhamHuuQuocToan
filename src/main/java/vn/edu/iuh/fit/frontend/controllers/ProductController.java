package vn.edu.iuh.fit.frontend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.iuh.fit.backend.models.Product;

@Controller
@RestController
@RequestMapping (path = "/product")
public class ProductController {

    @RequestMapping(value = "/save", produces = "application/json",method = RequestMethod.POST)
    public String saveProduct(Model model, @ModelAttribute("product") Product product){
        model.addAttribute("product", product);
        return "admin/products-page";
    }
}
