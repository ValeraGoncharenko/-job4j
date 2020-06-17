package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SortByNameItemTest {

    @Test
    public void compare() {
        List<Item> exp = new ArrayList<>();

        Item expD = new Item("D");
        Item expC = new Item("C");
        Item expB = new Item("B");
        Item expA = new Item("A");
        exp.add(expD);
        exp.add(expC);
        exp.add(expB);
        exp.add(expA);

        List<Item> res = new ArrayList<>();
        Item resA = new Item("A");
        Item resB = new Item("B");
        Item resC = new Item("C");
        Item resD = new Item("D");
        res.add(resA);
        res.add(resB);
        res.add(resC);
        res.add(resD);

        Collections.sort(exp, new SortByNameItem());

        assertThat(res, is(exp));
    }

    @Test
    public void compareReverse() {
        List<Item> exp = new ArrayList<>();
        Item itemA = new Item("A");
        Item itemB = new Item("B");
        Item itemC = new Item("C");
        Item itemD = new Item("D");

        exp.add(itemA);
        exp.add(itemB);
        exp.add(itemC);
        exp.add(itemD);

        List<Item> res = new ArrayList<>();

        Item expD = new Item("D");
        Item expC = new Item("C");
        Item expB = new Item("B");
        Item expA = new Item("A");
        res.add(expD);
        res.add(expC);
        res.add(expB);
        res.add(expA);

        Collections.sort(exp, new ReverseByNameItem());

    }

}