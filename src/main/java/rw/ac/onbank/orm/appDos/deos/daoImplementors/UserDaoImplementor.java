package rw.ac.onbank.orm.appDos.deos.daoImplementors;

import lombok.extern.slf4j.Slf4j;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.jboss.logging.annotations.Param;
import rw.ac.onbank.orm.appDos.deos.daos.UserDao;
import rw.ac.onbank.orm.appDos.deos.DAO;
import rw.ac.onbank.orm.entities.User;
import rw.ac.onbank.orm.helpers.MessagesAndOptionsPrinter;

import java.io.NotActiveException;
import java.util.List;


public class UserDaoImplementor  extends DAO implements UserDao {
    MessagesAndOptionsPrinter printer = new MessagesAndOptionsPrinter();

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
        Session session = getSession();
        try{
            transaction = session.beginTransaction();
            session.saveOrUpdate(user);
            transaction.commit();
            isUserCreated = true;
        }catch (Exception exception){
            System.out.println("Errorrr : " + exception.getMessage());
        }
        return isUserCreated;
    }

    @Override
    public boolean deleteUserById(long id) {

        return false;
    }
    @Override
    public User getUserByEmail( String email)throws  Exception {
        Session session = getSession();
        User user = null;
        try{
            transaction = session.beginTransaction();
            Query query = session.createQuery(" from  User u  where u.email ='" + email + "'");
            user = (User) query.uniqueResult();
            session.close();
        }catch (Exception exception){
            printer.print("Error : " + exception.getMessage());
            session.close();
            return null;
        }
       return user;
    }
}
