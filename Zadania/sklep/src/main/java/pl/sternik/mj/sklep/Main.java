package pl.sternik.mj.sklep;

import pl.sternik.mj.sklep.order.Order;

public class Main {


    public static void main(String[] args) {
        Article product = new Article("Mleko", 3.5f, "Mleko UHT");
        System.out.println(product.toString());
        System.out.println(Article.getCounter());
        product.setProductName("Mleczko");
        System.out.println(product.toString());

        Article product1 = new Article();
        System.out.println(product1.toString());
        System.out.println(Article.getCounter());
        Order order = new Order();
    }

}
