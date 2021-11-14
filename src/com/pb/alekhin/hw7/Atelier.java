package com.pb.alekhin.hw7;

public class Atelier {
    public static void main(String[] args) {
        Clothes[] clothes = new Clothes[4];
        clothes[0] = new Tshirt(Size.S, 200, "красного");
        clothes[1] = new Pants(Size.XXS, 150, "розового");
        clothes[2] = new Skirt(Size.M, 250, "серого");
        clothes[3] = new Tie(Size.L, 100, "черного");


        dressMan(clothes);
        System.out.println("  ");
        dressWomen(clothes);
    }

    public static void dressMan(Clothes[] clothes){
        for (Clothes cloth: clothes) {
            if (cloth instanceof ManClothes) {
                ManClothes mCl = (ManClothes) cloth;
                mCl.dressMan();
            }
        }
    }
    public static void dressWomen(Clothes[] clothes){
        for (Clothes cloth: clothes) {
            if (cloth instanceof WomenClothes) {
                WomenClothes mCl = (WomenClothes) cloth;
                mCl.dressWomen();
            }
        }
    }
}