package rw.ac.onbank.orm.appDos.deos.daoImplementors;

import org.hibernate.Session;
import rw.ac.onbank.orm.appDos.deos.daos.DepositDao;
import rw.ac.onbank.orm.appDos.deos.DAO;
import rw.ac.onbank.orm.entities.Deposit;
import rw.ac.onbank.orm.helpers.MessagesAndOptionsPrinter;

import java.util.List;

public class DepositDaoImplementor extends DAO implements DepositDao {
    MessagesAndOptionsPrinter printer = new MessagesAndOptionsPrinter();
    Session session = getSession();
    @Override
    public List<Deposit> getAllDeposits() {
        return null;
    }

    @Override
    public Deposit getDepositById(long id) {
        return null;
    }

    @Override
    public boolean saveDeposit(Deposit deposit) {
        return false;
    }

    @Override
    public boolean deleteDepositeById(long id) {
        return false;
    }
}