package ee.karl.karlpood.controller;

import ee.karl.karlpood.model.Product;
import ee.karl.karlpood.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SomeController {
    List<String> products = new ArrayList<>(Arrays.asList("Snufkin", "Moomintroll", "Sniff"));

    @Autowired
    ProductRepository productRepository;

    @GetMapping("Products")
    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    @GetMapping("Products/{id}")
    public Product getProducts(@PathVariable Long id){
        return productRepository.findById(id).get();
    }

    @DeleteMapping("Products/{id}")
    public void deleteProduct(@PathVariable Product id){
        productRepository.delete(id);
    }

    @DeleteMapping("Products")
    public void deleteProducts(){
        productRepository.deleteAll();
    }

    @PostMapping("Products")
    public void addProduct(@RequestBody Product product){
        productRepository.save(product);
    }

    @PutMapping("Products/{id}")
    public void editProduct(@PathVariable int id, @RequestBody Product product){
        productRepository.save(product);
    }
}
