
package rw.ac.onbank.orm.appDos.deos.daoImplementors;

import org.hibernate.Session;
import org.hibernate.Transaction;
import rw.ac.onbank.orm.appDos.deos.daos.CardDao;
import rw.ac.onbank.orm.appDos.deos.DAO;
import rw.ac.onbank.orm.entities.Bank;
import rw.ac.onbank.orm.entities.Card;
import rw.ac.onbank.orm.helpers.MessagesAndOptionsPrinter;

import java.util.List;

public class CardDoaImplementor extends DAO implements CardDao{
    MessagesAndOptionsPrinter printer = new MessagesAndOptionsPrinter();
    Session session = getSession();
    @Override
    public List<Card> getAllCards() {
        return null;
    }
    @Override
    public Card getCardById(long id) {
        return null;
    }
    @Override
    public boolean saveCard(Card card) {
        boolean isSaved = false;
            try{
                Transaction transaction = session.beginTransaction();
                session.saveOrUpdate(card);
                transaction.commit();
                isSaved = true;
            }catch(Exception e){
                printer.print("Error" + e.getMessage());
            }finally{
                   session.close();
            }
            return isSaved;
    }
    @Override
    public boolean deleteCardById(long id) {
        return false;
    }

}