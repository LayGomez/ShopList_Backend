package ShopList_Backend;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface ShopListRepository extends JpaRepository<Product, Long> {

    Optional<Product> findByName(String name);


    Optional<Product> updateProduct(String name, Boolean updatedIsBought);
}
