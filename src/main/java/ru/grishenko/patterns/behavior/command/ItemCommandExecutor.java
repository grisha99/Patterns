package ru.grishenko.patterns.behavior.command;

import ru.grishenko.patterns.generative.Item;

public class ItemCommandExecutor {

    private ItemCommand copyCommand;
    private ItemCommand createCommand;

    public ItemCommandExecutor(ItemCommand copyCommand, ItemCommand createCommand) {
        this.copyCommand = copyCommand;
        this.createCommand = createCommand;
    }

    public Item itemCopy() {
        return copyCommand.execute();
    }

    public Item itemCreate() {
        return createCommand.execute();
    }
}
