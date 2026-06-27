package net.boukchouch.presentation;

import net.boukchouch.dao.IDao;
import net.boukchouch.metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presen2 {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(new File("config.txt"));

        String daoClassName = scanner.nextLine();
        Class cdao = Class.forName(daoClassName);
        IDao d = (IDao) cdao.getDeclaredConstructor().newInstance();

        String metierClassName = scanner.nextLine();
        Class cmetier = Class.forName(metierClassName);

        IMetier metier =
                (IMetier) cmetier.getDeclaredConstructor().newInstance();

        Method method = cmetier.getMethod("setDao", IDao.class);
        method.invoke(metier, d);

        System.out.println("Res = " + metier.calcul());
    }
}
