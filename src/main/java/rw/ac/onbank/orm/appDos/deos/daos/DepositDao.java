package rw.ac.onbank.orm.appDos.deos.daos;

import rw.ac.onbank.orm.entities.Deposit;

import java.util.List;

public interface DepositDao {
    public List<Deposit> getAllDeposits();
    public Deposit getDepositById(long id);
    public  boolean saveDeposit(Deposit deposit);
    public boolean deleteDepositeById(long id);


}