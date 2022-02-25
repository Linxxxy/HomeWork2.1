package com.company;

public class Main {

    public static void main(String[] args) {
            Shop godSneakers= new Shop("Street12", "God`s Shop");
            Product sneakers= new Product(66-006, 5500, "Nike",godSneakers);
            System.out.println(sneakers.getInfo());
            System.out.println(sneakers);
        }
    }

