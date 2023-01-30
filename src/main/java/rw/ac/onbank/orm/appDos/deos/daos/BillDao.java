package rw.ac.onbank.orm.appDos.deos.daos;

import rw.ac.onbank.orm.entities.Bill;

import java.util.List;

public interface BillDao {
    public List<Bill> getAllBills();
    public Bill getBillById(long id);
    public  boolean saveBill(Bill bill);
    public boolean deleteBillById(long id);

}
