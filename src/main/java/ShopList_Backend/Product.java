package ShopList_Backend;

import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false)
    public String name;
    public Boolean isBought;

    public Product(Long id, String name, Boolean isBought) {
        this.id = id;
        this.name = name;
        this.isBought = isBought;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Boolean getBought() {
        return isBought;
    }

    public Product() {
    }
}
