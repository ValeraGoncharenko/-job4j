package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод добавления заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(generateId());
        items[position++] = item;
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
     * Метод  возвращает копию массива this.items.
     * return возвращает копию массива this.items без null элементов.
     */
    public Item[] findAll(){
        return  Arrays.copyOf(this.items, this.position);
    }

    /**
     * Метод проверяет в цикле все элементы массива this.items,
     * сравнивая name (используя метод getName класса Item) с аргументом метода String key.
     * Элементы, у которых совпадает name, копирует в результирующий массив и возвращает его;
     * @return result.
     */

    public Item[] findByName(String key){
        int size = 0;
        Item[] result = new Item[position];
        for (int i = 0; i < this.items.length; i++) {
            if(this.items[i] != null && this.items[i].getName().equals(key)){
                result[size] = this.items[i];
                size++;
            }
        }
        return Arrays.copyOf(result, size);
    }

    /**
     * Метод получение заявки по id.
     *
     * @return заявка.
     */
    public Item findById(String id) {
        Item result = null;
        for (Item item : this.items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }
}
