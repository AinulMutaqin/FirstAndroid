package ppsi.fasilkom.com.kandros.model;

/**
 * Created by Ainul on 5/7/2016.
 */
public class Users {
    public int idUser;
    public String username;
    public String password;
    public String userType;

    public Users() {
    }

    public Users(int idUser, String username, String password, String userType) {
        this.idUser = idUser;
        this.username = username;
        this.password = password;
        this.userType = userType;
    }

    public int getIdUser() { return idUser; }

    public void setIdUser(int idUser) { this.idUser = idUser; }

    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }

    public String getUserType() { return userType; }

    public void setUserType(String userType) { this.userType = userType; }
}
