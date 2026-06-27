package net.boukchouch.presentation;

import net.boukchouch.metier.MetierImpl;
import net.boukchouch.ext.DaoImpleV2;

public class Presen1 {
    public static void main(String[] args){
        DaoImpleV2 d = new DaoImpleV2();
        MetierImpl metier = new MetierImpl();
        metier.setDao(d);
        System.out.println("res= "+metier.calcul());


    }
}
