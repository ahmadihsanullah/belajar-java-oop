package programmer.zaman.now.application;

import programmer.zaman.now.data.Category;

public class CategoryApp {
    public static void main(String[] args) {
        var category = new Category();

        category.setName("Fashion");
        System.out.println(category.getName());

        category.setName(null);
        System.out.println(category.getName());


    }
}
