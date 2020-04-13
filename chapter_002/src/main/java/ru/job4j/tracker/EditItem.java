package ru.job4j.tracker;

public class EditItem implements UserAction {
    @Override
    public String name() {
        return "=== Edit Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id item for edit");
        String name = input.askStr("Enter name new item: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Item create");
        } else {
            System.out.println("Item not found");
        }
        return true;
    }
}
