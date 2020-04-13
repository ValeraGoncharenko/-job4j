package ru.job4j.tracker;

public class ShowItems implements UserAction {

    @Override
    public String name() {
        return "=== Show all Items ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] items = tracker.findAll();
        for (Item item : items) {
            System.out.println(item.getName() + ", id : " + item.getId());
        }
        return true;
    }
}
