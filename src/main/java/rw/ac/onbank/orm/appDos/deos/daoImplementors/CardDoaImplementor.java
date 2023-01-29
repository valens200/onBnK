
package rw.ac.onbank.orm.appDos.deos.daoImplementors;

import rw.ac.onbank.orm.appDos.deos.daos.CardDao;
import rw.ac.onbank.orm.appDos.deos.DAO;
import rw.ac.onbank.orm.entities.Card;

import java.util.List;

public class CardDaoImplementor extends DAO implements CardDao{

    MessagesAndOptionsPrinter printer = new MessagesAndOptionsPrinter();
    Session session = getSession();
    @Override
    public List<Card> getAllCards() {
        return null;
    }

    @Override
    public Bank getCardById(long id) {
        return null;
    }

    @Override
    public Card saveCard(Card Card) {
      
            try{
                Transaction transaction = session.beginTransaction();
                session.saveOrUpdate(card);
                transaction.commit();
            }catch(Exception e){
                printer.print("Error" + e.getMessage());
                
            }finally{
                   session.close();
            }
    }


    @Override
    public boolean deleteCardById(long id) {
        return false;
    }

}