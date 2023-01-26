package rw.ac.onbank.orm.appDos.deos.daoImplementors;

import rw.ac.onbank.orm.appDos.deos.daos.BankDao;
import rw.ac.onbank.orm.appDos.deos.DAO;
import rw.ac.onbank.orm.entities.Bank;

import java.util.List;

public class BankDaoImplementor extends DAO implements BankDao {
    @Override
    public List<Bank> getAvailableBanks() {
        return null;
    }

    @Override
    public Bank getBankById(long id) {
        return null;
    }

    @Override
    public Bank saveBank(Bank bank) {
        return null;
    }

    @Override
    public boolean deleteBankById(long id) {
        return false;
    }
}
