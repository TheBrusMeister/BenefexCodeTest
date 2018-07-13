package models;

public class Employee {
    private String username;
    private String password;

    public Employee(){
        username = "ProdDemo14";
        password = "1806*heatWave";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
