package org.example.ZooEcosystemSimulation;

public class Registration {
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email) {
        if (email.endsWith("@yahoo.com")) {
            this.email = email;
        } else {
            System.out.println("Invalid email. Only Yahoo emails are allowed.");
        }
    }

    public void setUserName(String userName) {
        if (userName.length() > 6) {
            this.userName = userName;
        } else {
            System.out.println("Invalid username. Username must be longer than 6 characters.");
        }
    }

    public void setPassword(String password) {
        if (password!=null && password.length() > 6 && !password.contains(userName)) {
            this.password = password;
        } else {
            System.out.println("Invalid password. Password must be longer than 6 characters and cannot contain username.");
        }
    }

    public void displayRegistration() {
        System.out.println("Email: " + email);
        System.out.println("Username: " + userName);
        System.out.println("Password: " + password);
    }
}

