package ru.job4j.tracker;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

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
        Item[] ex = tracker.findAll();
        Item[] res = new Item[]{item, next};
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

        Item[] ex = tracker.findByName("test1");
        Item[] res = new Item[]{item};
        assertThat(ex, is(res));
    }
}