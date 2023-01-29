package rw.ac.onbank.orm.appDos.deos.daos;

import rw.ac.onbank.orm.entities.User;

import java.util.List;

public interface UserDao {
    public List<User> getAllUsers();
    public User getUserById(long id);
    public  boolean saveUser(User user);
    public boolean deleteUserById(long id);
    public User getUserByEmail(String email) throws  Exception;


}
