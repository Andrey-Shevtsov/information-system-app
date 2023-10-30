package live.shevtsovdev.app.service;

import live.shevtsovdev.app.data.models.Product;
import live.shevtsovdev.app.data.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> getAll() {
        return productRepository.findAll();
    }

}
