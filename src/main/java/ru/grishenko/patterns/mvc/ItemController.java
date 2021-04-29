package ru.grishenko.patterns.mvc;

public class ItemController {

    private ItemView view;

    private ItemServiceMvc itemServiceMvc;

    public ItemController(ItemView view) {
        this.view = view;
        itemServiceMvc = new ItemServiceMvc(new ItemDao());

    }

    public void updateView() {
        view.printItemList(itemServiceMvc.getItems());
    }
}
