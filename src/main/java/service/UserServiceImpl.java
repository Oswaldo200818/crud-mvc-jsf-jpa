package service;

import dato.UserDao;
import entidad.Users;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@Stateless
public class UserServiceImpl implements UserService{

    EntityManager em;
    
    @Inject
    private UserDao usersDao;

    @Override
    public List<Users> listarUsers() {
        return usersDao.findUsers();
    }

    @Override
    public void newUser(Users users) {
        usersDao.newUser(users);
    }

    @Override
    public void actualizarUser(Users users) {
        usersDao.deleteUser(users);
    }
    
    @Override
    public void eliminarUser(Users users) {
        usersDao.deleteUser(users);
    }

    @Override
    public Users encontrarUsersById(Users users) {
        return usersDao.findUserById(users);
    }

    
    
    
}
