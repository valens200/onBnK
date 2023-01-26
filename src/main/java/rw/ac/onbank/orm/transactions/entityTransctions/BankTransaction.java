package rw.ac.onbank.orm.transactions.entityTransctions;

import rw.ac.onbank.orm.appDos.deos.daos.BankDao;
import rw.ac.onbank.orm.entities.Bank;

import java.util.List;

public class BankTransaction {
    private BankDao bankDao;
    public Bank saveBank(Bank bank){
       return   bankDao.saveBank(bank);
    }
    public List<Bank> getAllBanks(){
        return bankDao.getAvailableBanks();
    }

}
