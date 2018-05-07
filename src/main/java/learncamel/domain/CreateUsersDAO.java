package learncamel.domain;

public class CreateUsersDAO {

    /**
     * UserName : string
     * ID : 0
     * Password : string
     */
    private String UserName;
    private int ID;
    private String Password;

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getUserName() {
        return UserName;
    }

    public int getID() {
        return ID;
    }

    public String getPassword() {
        return Password;
    }
}
