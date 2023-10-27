package live.shevtsovdev.app.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/product")
public class ProductController {

    private final ProductRepository productRepository;

    @GetMapping("/getAll")
    public List<Product> getAll() {
        return productRepository.getAll();
    }

}
