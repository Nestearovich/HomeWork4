package com.example.lib2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class MyClass {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Product product1 = new Product("Book", 1200, 14);
        Product product2 = new Product("Notebook", 1300, 112);
        Product product3 = new Product("Pencil", 200, 223);
        Product product4 = new Product("Album", 1450, 117);
        Product product5 = new Product("Markers", 1100, 211);
        Product product6 = new Product("Note", 980, 177);



        shop.addProduct(product1);
        shop.addProduct(product2);
        shop.addProduct(product3);
        shop.addProduct(product4);
        shop.addProduct(product5);
        shop.addProduct(product6);

        shop.deleteProduct(211);

        shop.changeProduct(product1);

        shop.printProduct();
        shop.sortProduct();
        ArrayDeque<Product> list = new ArrayDeque();
        list.addFirst(product6);
        list.push(product5);
        list.addLast(product1);



    }
}
