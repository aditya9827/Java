package javabrains.springboot.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public List<Product> getAllProduct() {
		return this.productRepository.findAll();
	}

	public void addProduct(Product product) {
		productRepository.save(product);
	}

	public Product getProduct(Long id) {
		return productRepository.getOne(id);
	}

}
