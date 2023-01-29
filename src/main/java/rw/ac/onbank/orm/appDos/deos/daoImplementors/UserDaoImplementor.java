package rw.ac.onbank.orm.appDos.deos.daoImplementors;

import lombok.extern.slf4j.Slf4j;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import rw.ac.onbank.orm.appDos.deos.daos.UserDao;
import rw.ac.onbank.orm.appDos.deos.DAO;
import rw.ac.onbank.orm.entities.User;

import java.util.List;

public class UserDaoImplementor  extends DAO implements UserDao {
    private Session session = getSession();
    private Transaction transaction = null;
    @Override
    public List<User> getAllUsers() {
        return null;
    }
    @Override
    public User getUserById(long id) {
        return null;
    }
    @Override
    public boolean saveUser(User user) {
        boolean isUserCreated = false;
        try{
            transaction = session.beginTransaction();
            session.saveOrUpdate(user);
            transaction.commit();
            session.close();
            isUserCreated = true;
        }catch (Exception exception){
            System.out.println("Error : " + exception.getMessage());
        }
        return isUserCreated;
    }

    @Override
    public boolean deleteUserById(long id) {

        return false;
    }
    @Override
    public User getUserByEmail(String email) {
        transaction = session.beginTransaction();
        Query query = session.createQuery(" from User where email:email ");
        query.setParameter("email", email);
        return (User) query.list();

    }
}
