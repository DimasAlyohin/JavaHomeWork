package com.pb.alekhin.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes{

    public Tshirt(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        if (size.equals(Size.XXS)) {
            System.out.println("Мальчик покупает футболку размера " + size + color + " цвета и платит за неё " + price + " грн.");
    } else if (!size.equals(Size.XXS)) {
            System.out.println("Парень покупает футболку размера " + size + color + " цвета и платит за неё " + price + " грн.");
        }
    }

    @Override
    public void dressWomen() {
        if (size.equals(Size.XXS)) {
        System.out.println("Девочка покупает футболку размера " + size + color + " цвета и платит за неё " + price + " грн.");
        } else if (!size.equals(Size.XXS)) {
            System.out.println("Девушка покупает футболку размера " + size + color + " цвета и платит за неё " + price + " грн.");
        }
    }
}