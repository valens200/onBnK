package rw.ac.onbank.orm.appDos.deos.daos;

import rw.ac.onbank.orm.entities.Card;

import java.util.List;

public interface CardDao {
    public List<Card> getAllCards();
    public Card getCardById(long id);
    public  boolean saveCard(Card card);
    public boolean deleteCardById(long id);


}
