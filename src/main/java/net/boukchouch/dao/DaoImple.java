package net.boukchouch.dao;

public class DaoImple implements IDao {
    @Override
    public double getData() {
        System.out.println("Version base de donnee");
        double t=34;
        return t;

    }
}