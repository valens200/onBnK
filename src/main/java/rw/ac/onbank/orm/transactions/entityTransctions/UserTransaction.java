package rw.ac.onbank.orm.transactions.entityTransctions;

import rw.ac.onbank.orm.appDos.deos.daos.UserDao;
import rw.ac.onbank.orm.entities.User;
import java.util.List;
public class UserTransaction {
    private UserDao userDao;
    public List<User> getAllUsers(){
        return  userDao.getAllUsers();
    }
}
