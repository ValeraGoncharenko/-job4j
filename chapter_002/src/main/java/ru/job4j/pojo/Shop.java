package ru.job4j.pojo;

public class Shop {
    /**
     * метод смещает элементы на одну позицию влево,
     * заменяет последнюю ячейку с индексом index на нулевую ссылку.
     * чтобы в массиве не было дыры.
     * @param products - входящий массив.
     * @param index    - индекс ячейки массива
     * @return массив
     */
    public Product[] delete(Product[] products, int index) {
        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
        }
        products[products.length - 1] = null;
        return products;
    }
    public static void main(String[] args) {

        Product[] products = new Product[3];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);

        System.out.println("смещаем эл-ты");
        Shop shop = new Shop();
        shop.delete(products, 1);

        for (Product product: products) {
            if (product != null) {
                System.out.println(product.getName() + ", count: " + product.getCount());
            } else {
                System.out.println("null");
            }
        }


    }
}

