package rw.ac.onbank.orm.appDos.deos.daos;

import rw.ac.onbank.orm.entities.Bank;

import java.util.List;

public interface BankDao {
    public List<Bank> getAvailableBanks();
    public Bank getBankById(long id);
    public  Bank saveBank(Bank bank);
    public boolean deleteBankById(long id);


}
