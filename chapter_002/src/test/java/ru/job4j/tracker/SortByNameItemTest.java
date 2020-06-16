package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortByNameItemTest {

    @Test
    public void compare() {

        Item item1 = new Item("D Item");
        Item item2 = new Item("C Item");
        Item item3 = new Item("B Item");
        Item item4 = new Item("A Item");

        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        System.out.println(items);
        Collections.sort(items, new SortByNameItem());
        System.out.println(items);

        Collections.sort(items, new SortByNameItem().reversed());
        System.out.println(items);

    }


}