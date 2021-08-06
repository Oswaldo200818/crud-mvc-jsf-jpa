package dato;

import entidad.Users;
import java.util.List;

public interface UserDao {
    
    public List<Users> findUsers();
    
    public void newUser(Users users);
   
    public void deleteUser(Users users);
    
    public Users findUserById(Users users);
}
