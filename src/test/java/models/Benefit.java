package models;

public class Benefit {

    //can enum this for the different benefits.
    private String type;
    private int currentContribution;

    public Benefit(){
        type = "Childcare Voucher";
        currentContribution = 50;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCurrentContribution() {
        return currentContribution;
    }

    public void setCurrentContribution(int currentContribution) {
        this.currentContribution = currentContribution;
    }
}
