package co.edu.ufps.cloud.ingsistemas.sjcr.repository;

import co.edu.ufps.cloud.ingsistemas.sjcr.entities.Category;
import co.edu.ufps.cloud.ingsistemas.sjcr.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    public List<Product> findByCategory(Category category);

}