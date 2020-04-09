package ru.job4j.tracker;

import ru.job4j.pojo.Product;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            }
            else if (select == 1) {
                System.out.println("=== Show all Items ====");
                Item[] items = tracker.findAll();
                for (Item item : items) {
                        System.out.println(item.getName() + ", id : " + item.getId());
                }
            }
            else if (select == 2) {
                System.out.println("=== Edit Item ====");
                System.out.println("Enter id item for edit");
                String id = scanner.nextLine();
                System.out.println("Enter name new item: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                if (tracker.replace(id, item)) {
                    System.out.println("Item create");
                } else {
                    System.out.println("Item not found");
                }
            }
            else if (select == 3) {
                System.out.println("=== Delete Item ====");
                System.out.println("Enter id item for delete");
                String id = scanner.nextLine();
                if (tracker.delete(id)) {
                    System.out.println("Item delete");
                } else {
                    System.out.println("Item not found");
                }
            }
            else if (select == 4) {
                System.out.println("=== Find Item by Id ====");
                System.out.println("Enter id item for find");
                String id = scanner.nextLine();
                Item result = tracker.findById(id);
                if(result != null){
                    System.out.println(result);
                } else {
                    System.out.println("Item not found");
                }
            }
            else if (select == 5) {
                System.out.println("=== Find Item by Name ====");
                System.out.println("Enter name item for find");
                String name = scanner.nextLine();
                Item[] items = tracker.findByName(name);
                for (Item item : items) {
                        System.out.println(item.getName() + ", id : " + item.getId());
                }
            }
            else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println(" 5. Find items by name");
        System.out.println("6. Exit Program");

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
