package edu.neu.mgen;

public class Illness {

    private String name;
    private TreatmentPlan treatmentPlan;

    public Illness(){

    }

    public Illness(String name, TreatmentPlan treatmentPlan) {
        this.name = name;
        this.treatmentPlan = treatmentPlan;
    }

    public String getName() {
        return name;
    }

    public TreatmentPlan getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTreatmentPlan(TreatmentPlan treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    


}
