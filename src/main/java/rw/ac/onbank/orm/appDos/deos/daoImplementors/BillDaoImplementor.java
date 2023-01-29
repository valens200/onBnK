
package rw.ac.onbank.orm.appDos.deos.daoImplementors;

import org.hibernate.Session;
import org.hibernate.Transaction;
import rw.ac.onbank.orm.appDos.deos.daos.BillDao;
import rw.ac.onbank.orm.appDos.deos.DAO;
import rw.ac.onbank.orm.entities.Bill;
import rw.ac.onbank.orm.helpers.MessagesAndOptionsPrinter;

import java.util.List;

public class BillDaoImplementor extends DAO implements BillDao{


    @Override
    public List<Bill> getAllBills() {
        return null;
    }

    @Override
    public Bill getBillById(long id) {
        return null;
    }

    @Override
    public boolean saveBill(Bill bill) {
        return false;
    }

    @Override
    public boolean deleteBillById(long id) {
        return false;
    }
}