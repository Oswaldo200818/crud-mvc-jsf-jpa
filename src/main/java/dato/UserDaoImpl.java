package dato;

import entidad.Users;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class UserDaoImpl implements UserDao {

    @PersistenceContext(unitName = "usuarioPU")
    EntityManager em;

    @Override
    public List<Users> findUsers() {
        return em.createNamedQuery("Users.findAll").getResultList();
    }

    @Override
    public void newUser(Users users) {
        em.persist(users);
    }

    @Override
    public void deleteUser(Users users) {
        em.remove(em.merge(users));
    }

    @Override
    public Users findUserById(Users users) {
        return em.find(Users.class, users.getIdUsers());
    }

    

    

    

}
