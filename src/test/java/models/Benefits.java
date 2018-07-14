package models;

import java.util.ArrayList;
import java.util.List;

public class Benefits {

    private List<Benefit> benefits;

    public Benefits(){
        benefits = defaultBenefits();
    }

    private List<Benefit> defaultBenefits(){
        List<Benefit> benefitList = new ArrayList<>();
        benefitList.add(new Benefit());
        return benefitList;
    }

    public List<Benefit> getBenefits() {
        return benefits;
    }

    public void setBenefits(List<Benefit> benefits) {
        this.benefits = benefits;
    }
}
