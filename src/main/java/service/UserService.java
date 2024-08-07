package service;
//import dao.UserDAO;

import dao.userDAO;
import model.User;

import java.sql.SQLException;

public class UserService {
    public static Integer saveUser(User user){
        try{
            userDAO UserDAO = null;
            if(UserDAO.isExists(user.getEmail())){
                return 0;
            }else{
                return UserDAO.saveUser(user);
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return null;
    }

}
