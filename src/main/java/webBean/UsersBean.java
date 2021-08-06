package webBean;

import entidad.Users;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import service.UserService;

@Named("usersBean")
@RequestScoped
public class UsersBean {

    @Inject
    private UserService userService;
    private Users userSeleccionado;
    private Users users;
    private Users finUsers;
    List<Users> listaUsers;

    @PostConstruct
    public void inicializar() {
        listaUsers = userService.listarUsers();
        userSeleccionado = new Users();
        users = new Users();
    }

    public Users getUserseleccionado() {
        return userSeleccionado;
    }

    public void setUserseleccionado(Users userSeleccionado) {
        this.userSeleccionado = userSeleccionado;
    }

    public List<Users> getListaUsers() {
        return listaUsers;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
    
    public void agregarUsuario(){
        this.userService.newUser(userSeleccionado);
        this.listaUsers.add(userSeleccionado);
        this.userSeleccionado = null;
    }
    public String encontrarUsers(Users users){
        this.userService.encontrarUsersById(users);
        return "edit.xhtml";

    }
    public void eliminarUsers( Users users){
        this.userService.eliminarUser(users);
        
    }
}

