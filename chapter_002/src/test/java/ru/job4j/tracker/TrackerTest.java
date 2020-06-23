package ru.job4j.tracker;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.IsNull.nullValue;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    /**
     * Тест для метода findAll() .
     * Возврат копии массивов без null.
     */
    @Test
    public void findAll() {
        Tracker tracker = new Tracker();
        // Создаем заявку в трекер.
        Item item = new Item("test1");
        Item next = new Item("test2");
        // Добавляем заявку в трекер.
        tracker.add(item);
        tracker.add(next);
        // Удаляем null
      List<Item> ex = tracker.findAll();
      List<Item> res = Arrays.asList(new Item[]{item, next});
        //Проверяем наличие null после копирования
        assertThat(ex, is(res));
    }

    /**
     * Тест для метода findByName() .
     * Возврат копии массивов при совпадении по имени.
     */
    @Test
    public void findByName() {
        Tracker tracker = new Tracker();
        // Создаем заявку в трекер.
        Item item = new Item("test1");
        Item next = new Item("test2");
        // Добавляем заявку в трекер.
        tracker.add(item);
        tracker.add(next);

        List<Item> ex = tracker.findByName("test1");
       List<Item> res = Arrays.asList(new Item[]{item});
        assertThat(ex, is(res));
    }

    /**
     * Тест для метода replace() .
     * Возврат копии массивов при совпадении по имени.
     */
    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        Item bugWithDesc = new Item("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }

    @Test
    public void whenDelete() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        tracker.delete(id);
        assertThat(tracker.findById(id), is(nullValue()));
    }
}