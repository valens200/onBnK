package rw.ac.onbank.orm.appDos.deos.daos;

import rw.ac.onbank.orm.entities.Deposite;

import java.util.List;

public interface Deposite {
    public List<Deposite> getAllDeposites();
    public Deposite getDepositeById(long id);
    public  boolean saveDeposite(Deposite deposite);
    public boolean deleteDepositeById(long id);


}