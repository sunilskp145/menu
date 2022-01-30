package com.sunil.menu.item;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {

    @Id
    private Long id;
    private String name;
    private int price;
    private String description;
    private String image;

    public Item() {
        super();
    }

    public Item(
            Long id,
            String name,
            int price,
            String description,
            String image
    ) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public Item updateWith(Item item) {
        return new Item(
            this.id,
            item.name,
            item.price,
            item.description,
            item.image
        );
    }
}