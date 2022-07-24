package com.company;

public class Main {

    public static void main(String[] args) {

//        Player player = new Player();
//        player.name="Tim";
//        player.health=20;
//        player.weapon="sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Tim",50,"Sword");
        System.out.println("Initial health is player " + player.getHealth());

        Printer printer = new Printer(50,false);
        System.out.println("initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count = " + printer.getPagesPrinted());


    }
}
