package live.shevtsovdev.app.data.repositories;

import live.shevtsovdev.app.data.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findAll();

}
