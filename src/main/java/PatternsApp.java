import ru.grishenko.patterns.generative.Item;

import java.math.BigDecimal;

public class PatternsApp {

    public static void main(String[] args) {
        Item item1 = Item.getBuilder()
                .setId(1L)
                .setName("Item1")
                .setPrice(new BigDecimal("100.1"))
                .build();
        Item item2 = (Item)item1.clone();

        // проверка клонирования
        System.out.println(item1);
        System.out.println(item2);
        System.out.println("equals: " + item1.equals(item2));
        System.out.println("==: " + (item1 == item2));

    }
}
