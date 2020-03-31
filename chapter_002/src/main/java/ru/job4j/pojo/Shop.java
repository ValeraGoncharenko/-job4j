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
    public Product[] delete(Product[] products, int index){
        for (int i = 0; i < products.length; i++) {
            if(index == i) {
                products[i] = products[i + 1];
                products[products.length - 1] = null;
            }

            Product pr = products[i];
            if (pr != null) {
                System.out.println(pr.getName());
            }else {
               System.out.println("null");
            }
        }


        return products;
    }
    public static void main(String[] args) {
        Product products[] = new Product[3];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);

        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            //проверяем, что объект не равен null. тк у нас массив не заполнен ,целиком.
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }

        System.out.println();
        System.out.println("Удаляем значение из ячейки с индексом 1");
        //удаляем значение из ячейки с индексом 1
        products[1] = null;

        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            //проверяем, что объект не равен null. тк у нас массив не заполнен целиком.
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }

        System.out.println();
        System.out.println("Записываем  в ячейку с индексом 1 значение ячейки с индексом 2 и удаляем значение из ячейки с индексом 2");
        //записываем в ячейку с индексом 1 значение ячейки с индексом 2.
        products[1] = products[2];
        //удаляем значение из ячейки с индексом 2.
        products[2] = null;
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            //проверяем, что объект не равен null. так как  у нас массив не заполнен целиком.
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
        System.out.println("смещаем эл-ты");
        Shop shop = new Shop();
        System.out.println(shop.delete(products, 1));
    }
}
