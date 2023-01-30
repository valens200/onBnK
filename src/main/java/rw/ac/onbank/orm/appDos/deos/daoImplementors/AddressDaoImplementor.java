package rw.ac.onbank.orm.appDos.deos.daoImplementors;

import org.hibernate.Session;
import org.hibernate.Transaction;
import rw.ac.onbank.orm.appDos.deos.daos.AddressDao;
import rw.ac.onbank.orm.appDos.deos.daos.BankDao;
import rw.ac.onbank.orm.appDos.deos.DAO;
import rw.ac.onbank.orm.entities.Address;
import rw.ac.onbank.orm.helpers.MessagesAndOptionsPrinter;

import java.util.List;

public class AddressDaoImplementor extends DAO implements AddressDao {

    MessagesAndOptionsPrinter printer = new MessagesAndOptionsPrinter();
    Session session = getSession();
    boolean isSaved = false;

    @Override

    public List<Address> getAllAdresses(){
    return null;
    }

    @Override
    public Address getAdressById(long id)
    {
        return null;
    }

    @Override
    public boolean saveAddress(Address address)
    {
            try{
                Transaction transaction = session.beginTransaction();
                session.saveOrUpdate(address);
                transaction.commit();
                isSaved = true;
            }catch(Exception e){
                printer.print("Error" + e.getMessage());
                
            }finally{
                   session.close();
            }
            return  isSaved;
    }
  
    @Override
    public boolean deleAddressById(long id)
    {
        return false;
    }

}