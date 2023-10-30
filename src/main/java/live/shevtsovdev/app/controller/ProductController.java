package live.shevtsovdev.app.controller;

import live.shevtsovdev.app.data.models.Product;
import live.shevtsovdev.app.data.repositories.ProductRepository;
import live.shevtsovdev.app.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/product")
public class ProductController {

    private final ProductService productService;

    @GetMapping("/getAll")
    public List<Product> getAll() {
        return productService.getAll();
    }

}
