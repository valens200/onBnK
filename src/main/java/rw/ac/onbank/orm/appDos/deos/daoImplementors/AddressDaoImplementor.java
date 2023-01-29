package rw.ac.onbank.orm.appDos.deos.daoImplementors;

import rw.ac.onbank.orm.appDos.deos.daos.BankDao;
import rw.ac.onbank.orm.appDos.deos.DAO;
import rw.ac.onbank.orm.entities.Address;

import java.util.List;

public class AddressDaoImplementor extends DAO implements AddressDao{

    MessagesAndOptionsPrinter printer = new MessagesAndOptionsPrinter();
    Session session = getSession();

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
    public Address saveAddress(Address address)
    {
       
            try{
                Transaction transaction = session.beginTransaction();
                session.saveOrUpdate(address);
                transaction.commit();
            }catch(Exception e){
                printer.print("Error" + e.getMessage());
                
            }finally{
                   session.close();
            }
    }
  
    @Override
    public boolean deleAddressById(long id)
    {
        return false;
    }

}