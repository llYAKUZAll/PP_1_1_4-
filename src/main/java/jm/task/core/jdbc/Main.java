package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;


public class Main {
    public static void main(String[] args) {

        Util.getConnection();
        UserDao userDao = new UserDaoJDBCImpl();

        userDao.createUsersTable();

        userDao.saveUser("Bob", "Ritter", (byte) 30);
        userDao.saveUser("Niko", "Belich", (byte) 34);
        userDao.saveUser("Alex", "Kibuc", (byte) 31);
        userDao.saveUser("John", "Doe", (byte) 18);

        userDao.removeUserById(1);
        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }

}

