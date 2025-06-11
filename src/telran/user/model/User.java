package telran.user.model;

public class User {
    private String email;
    private String password;

    public User(String email, String password) {
        setEmail(email);
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (validateEmail(email)) {
            this.email = email;
        } else {
            System.out.println(email + " is not valid");
        }
    }

    // peter@gmail.com
    /* TODO:
        1. @ exists and only one !
        2. dot after @ !
        3. after last dot minimum 2 symbols !
        4. alphabetic, digits, _ , - , ., @
     */
    private boolean validateEmail(String email) {
        int indexAt = email.indexOf('@');
        if (indexAt == -1) {
            return false;
        }
        if (email.indexOf('@') != email.lastIndexOf('@')) {
            return false;
        }
        if (email.indexOf('.') == -1) {
            return false;
        }

        if (email.lastIndexOf('.') >= email.length() - 2) {
            return false;
        }
        if (email.indexOf('@') > email.indexOf('.')) {
            return false;
        }

        for (int i = 0; i < email.length(); i++) {
            char ch = email.charAt(i);
            if (!Character.isLetterOrDigit(ch) && ch != '@' && ch != '.' && ch != '_' && ch != '-') {
                return false;
            }
        }

        return true;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
