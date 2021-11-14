package com.pb.alekhin.hw7;

public class Tie extends Clothes implements ManClothes{

    public Tie(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        if (size.equals(Size.XXS)) {
            System.out.println("Мальчик покупает галстук размера " + size + color + " цвета и платит за неё " + price + " грн.");
        } else if (!size.equals(Size.XXS)) {
            System.out.println("Парень покупает галстук размера " + size + color + " цвета и платит за неё " + price + " грн.");
        }
    }
}