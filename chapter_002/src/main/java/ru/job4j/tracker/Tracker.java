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
        for (int i = 0; i < this.position; i++) {
            if(this.items[i].getName().equals(key)){
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
        Item item = null;
        for (int i = 0; i < this.position; i++) {
            Item current = items[i];
            if (current.getId().equals(id)) {
                item = current;
                break;
            }
        }
        return item;
    }

    /**
     * Метод возвращает index по id.
     *
     * @return заявка.
     */
    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < position; index++) {
            if (this.items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    /**
     * Метод замены заявки.
     * Заменяет заявку по id.
     * @return заявка.
     */
    public boolean replace(String id, Item item) {
        boolean result = false;
        int index = indexOf(id);
        if(index != -1){
            item.setId(id);
            this.items[index] = item;
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
                System.arraycopy(this.items, index + 1, this.items, index, items.length - position);
                items[position - 1] = null;
                this.position--;
                result = true;
            }

        return result;
    }
}
