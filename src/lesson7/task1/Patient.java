package lesson7.task1;

public class Patient{
    private int treatmentPlan;
    private IDoctor doctor;

    public Patient(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public int getTreatmentPlan() {
        return treatmentPlan;
    }

    public IDoctor getDoctor() {
        return doctor;
    }

    public void setDoctor(IDoctor doctor) {
        this.doctor = doctor;
    }
}
