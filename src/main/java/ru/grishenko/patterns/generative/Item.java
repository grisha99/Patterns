package ru.grishenko.patterns.generative;

import java.math.BigDecimal;
import java.util.Objects;

public class Item extends ItemCloneable {

    private Long id;
    private String name;
    private BigDecimal price;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    // закрытый конструктор
    private Item() {

    };

    // создание экземпляра объекта через билдер
    public static ItemBuilder getBuilder() {
        return new Item().new ItemBuilder();
    }

    // клонирование с использованием билдера
    @Override
    public ItemCloneable clone() {
        return getBuilder()
                .setId(this.id)
                .setName(this.name)
                .setPrice(this.price)
                .build();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(id, item.id) &&
                Objects.equals(name, item.name) &&
                Objects.equals(price, item.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public class ItemBuilder {

        private ItemBuilder() {

        };

        public ItemBuilder setId(Long id) {
            Item.this.id = id;
            return this;
        }

        public ItemBuilder setName(String name) {
            Item.this.name = name;
            return this;
        }

        public ItemBuilder setPrice(BigDecimal price) {
            Item.this.price = price;
            return this;
        }

        public Item build() {
            return Item.this;
        }
    }

}
