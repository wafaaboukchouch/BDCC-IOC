package net.boukchouch.ext;

import net.boukchouch.dao.IDao;

public class DaoImpleV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version capteur....");
        double t = 12;
        return t;
    }
}
