package rw.ac.onbank.orm.services.entityServices;

import rw.ac.onbank.orm.appDos.deos.daos.BankDao;
import rw.ac.onbank.orm.entities.Bank;

import java.util.List;

public class BankServices {
    private BankDao bankDao;
    public boolean saveBank(Bank bank){
       return   bankDao.saveBank(bank);
    }
    public List<Bank> getAllBanks(){
        return bankDao.getAvailableBanks();
    }

}
