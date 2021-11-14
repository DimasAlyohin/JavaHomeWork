package com.pb.alekhin.hw7;

public class Skirt extends Clothes implements WomenClothes{

    public Skirt(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
        if (size.equals(Size.XXS)) {
            System.out.println("Девочка покупает юбку размера " + size + color + " цвета и платит за неё " + price + " грн.");
        } else if (!size.equals(Size.XXS)) {
            System.out.println("Девушка покупает юбку размера " + size + color + " цвета и платит за неё " + price + " грн.");
        }
    }
}