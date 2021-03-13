package com.geektech;

public class Main {

    public static void main(String[] args) {
        Boss thanos = new Boss();
        Weapon ak47 = new Weapon("Ak47","огнестерльное ");
        thanos.setDamage(100);
        thanos.setHealth(1200);
        thanos.setWeapon(new Weapon("АК-47","Огнестрельное"));
        System.out.println("Здоровье: "+thanos.getHealth() +" Урон: "+ thanos.getDamage()+ " Тип оружия: " + thanos.getWeapon().getType() +" Название оружия: "+ thanos.getWeapon().getName());


    }
}
