package com.example.lib2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Shop {
        ArrayList<Product> products = new ArrayList<>();

        ArrayDeque<Product> list = new ArrayDeque();


        void addProduct (Product product){
            this.products.add(product);
        }


        void printProduct () {
            for (int i = 0; i < products.size(); i++) {
                Product item = products.get(i);
                System.out.println(item.getName() + " " + item.getPrice() + " " + item.getId());
                System.out.println();
            }
        }
    void changeProduct(Product product){

        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getId()==product.getId()){
                products.remove(i);
                products.add(i,product);

            }
        }
    }


        void deleteProduct ( int id){
            for (int a = 0; a < products.size(); a++) {
                if (products.get(a).getId() == id) {
                    products.remove(a);
                }
            }
        }

        void sortProduct (){
            Collections.sort(products, new Comparator<Product>() {
                @Override
                public int compare(Product product, Product t1) {
                    return Integer.valueOf(product.getPrice()).compareTo(Integer.valueOf(t1.getPrice()));
                }
            });
            for(Product product:products){
                System.out.println(" " + product.getName()+" "+product.getPrice());
            }

        }

}



