package models;

import net.serenitybdd.core.Serenity;

public class Employee {
    private String username;
    private String password;
    private Benefits benefits;

    public Employee(){
        username = "ProdDemo14";
        password = "1806*heatWave";
        benefits = new Benefits();
        putEmployeeInSession();
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

    public Benefits getBenefits() {
        return benefits;
    }

    public void setBenefits(Benefits benefits) {
        this.benefits = benefits;
    }

    private void putEmployeeInSession(){
        Serenity.getCurrentSession().put("current.employee", this);
    }

    public static Employee getSessionEmployee(){
        return (Employee) Serenity.getCurrentSession().get("current.employee");
    }
}
