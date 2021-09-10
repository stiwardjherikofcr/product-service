package co.edu.ufps.cloud.ingsistemas.sjcr.service;

import co.edu.ufps.cloud.ingsistemas.sjcr.entities.Category;
import co.edu.ufps.cloud.ingsistemas.sjcr.entities.Product;

import java.util.List;

public interface ProductService {
    public List<Product> listAllProduct();
    public Product getProduct(Long id);
    public Product createProduct(Product product);
    public Product updateProduct(Product product);
    public  Product deleteProduct(Long id);
    public List<Product> findByCategory(Category category);
    public Product updateStock(Long id, Double quantity);
}
