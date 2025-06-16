package com.survivalcoding;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cleric a = new Cleric ("아서스", 40, 5);
        Cleric b = new Cleric ("아서스", 35);
        Cleric c = new Cleric ("아서스");
        a.print();
        b.print();
        c.print();

    }
}