package ru.job4j.tracker;

import java.util.List;

public class FindItemByName implements UserAction {

    @Override
    public String name() {
        return "=== Find Item by Name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name item for find");
        List<Item> items = tracker.findByName(name);
        for (Item item : items) {
            System.out.println(item.getName() + ", id : " + item.getId());
        }
        return true;
    }
}
