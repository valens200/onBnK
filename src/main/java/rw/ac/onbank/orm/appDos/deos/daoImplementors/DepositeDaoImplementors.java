package rw.ac.onbank.orm.appDos.deos.daoImplementors;

import rw.ac.onbank.orm.appDos.deos.daos.DepositeDao;
import rw.ac.onbank.orm.appDos.deos.DAO;
import rw.ac.onbank.orm.entities.Deposite;

import java.util.List;

public class depositeDaoImplementor extends DAO implements DepositeDao {

  
    MessagesAndOptionsPrinter printer = new MessagesAndOptionsPrinter();
    Session session = getSession();

    @Override
    public List<Deposite> getAllDeposites() {
        return null;
    }

    @Override
    public Deposite getDepositeById(long id) {
        return null;
    }

    @Override
    public Deposite saveDeposite(Deposite deposite) {

            try{
                Transaction transaction = session.beginTransaction();
                session.saveOrUpdate(deposite);
                transaction.commit();
            }catch(Exception e){
                printer.print("Error" + e.getMessage());    
            }finally{
                   session.close();
            }

    @Override
    public boolean deleteDepositeById(long id) {
        return false;
    }
}