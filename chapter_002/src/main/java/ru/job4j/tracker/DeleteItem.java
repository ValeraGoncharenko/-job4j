package ru.job4j.tracker;

public class DeleteItem implements UserAction {
    @Override
    public String name() {
        return "=== Delete Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id item for delete");
        if (tracker.delete(id)) {
            System.out.println("Item delete");
        } else {
            System.out.println("Item not found");
        }
        return true;
    }
}
