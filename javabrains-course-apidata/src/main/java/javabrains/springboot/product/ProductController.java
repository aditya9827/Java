package javabrains.springboot.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@Autowired
	private ProductService productServcie;

	@RequestMapping(method = RequestMethod.GET, value = "/products")
	public List<Product> getAllTopics() {
		return productServcie.getAllProduct();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/product")
	public void addProduct(@RequestBody Product product) {
		productServcie.addProduct(product);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/products/{productId}")
	public Product findProduct(@PathVariable long productId) {
		return productServcie.getProduct(productId);
	}

}
