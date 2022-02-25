package com.company;

public class Product extends Shop{
    private int code;
    private int price;
    private String name;

    public Product(int code, int price, String name, Shop shop) {
        super(name);
        this.code = code;
        this.price = price;
        this.name = name;
    }

    public Product(String address, String name) {
        super(address, name);
    }
    public int getPrice() {
        return price;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
    public String getInfo(){
        return "Code:"+ code+
                "\nName:"+ name+
                "\nPrice"+price;
        //  "\nShop:"+ shop +
        //  "\nShops address:"+ address;


    }
}
