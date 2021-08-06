package service;

import entidad.Users;
import java.util.List;
import javax.ejb.Local;

@Local
public interface UserService {

    public List<Users> listarUsers();

    public void newUser(Users users);

    public void eliminarUser(Users users);
    
    public void actualizarUser(Users users);
    
    public Users encontrarUsersById(Users users);
}
