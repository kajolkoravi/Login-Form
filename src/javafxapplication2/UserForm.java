package javafxapplication2;

import javafx.beans.property.SimpleStringProperty;

public class UserForm {

    private final SimpleStringProperty username;
    private final SimpleStringProperty password;

    public String getUsername() {
        return username.get();
    }

    public String getPassword() {
        return password.get();
    }

    public void setUsername(String username) {
        this.username.set(username);
    }

    public void setPassword(String password) {
        this.password.set(password);
    }

    public UserForm(String username, String password) {
        this.username = new SimpleStringProperty(username);
        this.password = new SimpleStringProperty(password);
    }

}
