package rw.ac.onbank.orm.appDos.deos.daoImplementors;

import rw.ac.onbank.orm.appDos.deos.daos.BeneficiallyDao;
import rw.ac.onbank.orm.appDos.deos.DAO;
import rw.ac.onbank.orm.entities.Beneficially;

import java.util.List;

public class BeneficiallyDaoImplementor extends DAO implements BeneficiallyDao {

  
    MessagesAndOptionsPrinter printer = new MessagesAndOptionsPrinter();
    Session session = getSession();

    @Override
    public List<Beneficially> getAllBeneficiallies() {
        return null;
    }

    @Override
    public Beneficially getBeneficiallyById(long id) {
        return null;
    }

    @Override
    public Beneficially saveBeneficially(Beneficially beneficially) {

            try{
                Transaction transaction = session.beginTransaction();
                session.saveOrUpdate(beneficially);
                transaction.commit();
            }catch(Exception e){
                printer.print("Error" + e.getMessage());
                
            }finally{
                   session.close();
            }

    @Override
    public boolean deleteBeneficiallyById(long id) {
        return false;
    }
}