package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Tracker {
    /**
     * List для хранения заявок.
     */
    List<Item> items = new ArrayList<>();

    /**
     * Метод добавления заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(generateId());
        items.add(item);
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    /**
     * Метод  возвращает List this.items.
     */
    public List<Item> findAll() {
        return items;
    }



    /**
     * Метод проверяет в цикле все элементы List this.items,
     * сравнивая name (используя метод getName класса Item) с аргументом метода String key.
     * Элементы, у которых совпадает name, копирует в результирующий массив и возвращает его;
     * @return result.
     */
    public List<Item> findByName(String key) {
        List<Item> value = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equals(key)) {
                value.add(item);
            }

        }
        return value;
    }

    /**
     * Метод получение заявки по id.
     *
     * @return заявка.
     */
    public Item findById(String id) {
        Item value = null;
        for (Item item : items) {
            if (item.getId().equals(id)) {
                value = item;
                break;
            }
        }
        return value;

    }

    /**
     * Метод возвращает index по id.
     *
     * @return заявка.
     */
    private int indexOf(String id) {
        int value = -1;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId().equals(id)) {
                value = i;
                break;
            }
        }
        return value;
    }

    /**
     * Метод замены заявки.
     * Заменяет заявку по id.
     * @return заявка.
     */
    public boolean replace(String id, Item item) {
        boolean result = false;
        int index = indexOf(id);
        if (index != -1) {
            item.setId(id);
            this.items.set(index, item);
            result = true;
        }
        return result;
    }

    /**
     * Метод удаления заявки.
     * Удаляет заявку по id.
     * @return boolean.
     */
    public boolean delete(String id) {
        boolean result = false;
        int index = indexOf(id);
        if (index != -1) {
            this.items.remove(index);
            result = true;
        }

        return result;
    }
}
