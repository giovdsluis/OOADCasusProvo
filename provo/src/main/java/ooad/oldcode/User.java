package ooad.oldcode;

import java.util.ArrayList;

public class User {
    private String username;
    private String password;
    private boolean docent = false;


    public User(String username, String password, boolean docent) {
        this.username = username;
        this.password = password;
        this.docent = docent;
    }

    public boolean verifyUsername(ArrayList<User> allUsers, String name) {
        for (int i = 0; i < allUsers.size(); i++) {
            if (name.equals(allUsers.get(i).getUsername()) &&  name != "" && name != null) {
                return false;
            }
        }
        return true;
    }

    public boolean loginCheck(ArrayList<User> allUsers, String username, String password) {
        for (int i = 0; i < allUsers.size(); i++) {
            if (username.equals(allUsers.get(i).getUsername()) && password.equals(allUsers.get(i).getPassword())) {
                return true;
            }
        }
        return false;
    }

    public User loginUser(ArrayList<User> allUsers, String username, String password) {
        User user = new User("", "", false);
        for (int i = 0; i < allUsers.size(); i++) {
            if (username.equals(allUsers.get(i).getUsername()) && password.equals(allUsers.get(i).getPassword())) {
                return allUsers.get(i);
            }
        }
        return user;
    }

    public String getUsername() {
        return username;
    }

    private String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getDocent() {
        return docent;
    }
}
