package rw.ac.onbank.orm.appDos.deos.daoImplementors;

import rw.ac.onbank.orm.appDos.deos.daos.UserDao;
import rw.ac.onbank.orm.appDos.deos.DAO;
import rw.ac.onbank.orm.entities.User;

import java.util.List;

public class UserDaoImplementor  extends DAO implements UserDao {

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User getUserById(long id) {
        return null;
    }

    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public boolean deleteUserById(long id) {
        return false;
    }
}
