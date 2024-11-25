package ShopList_Backend;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ShopListRepository shopListRepository;

    private ProductController(ShopListRepository shopListRepository){
        this.shopListRepository = shopListRepository;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return this.shopListRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<?> createProduct(@RequestBody Product product) {
        Optional<Product> optionalProduct = shopListRepository.findByName(product.getName());
        if (optionalProduct.isPresent()) return new ResponseEntity<>("El producto ya existe", HttpStatus.BAD_REQUEST);

        Product savedProduct = shopListRepository.save(product);
        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable Long id){
        this.shopListRepository.deleteById(id);

    }

}
