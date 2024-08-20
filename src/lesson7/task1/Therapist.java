package lesson7.task1;

public class Therapist implements IDoctor{
    private Surgeon surgeon;
    private Dentist dentist;
    public Therapist(Surgeon surgeon, Dentist dentist) {
        this.surgeon = surgeon;
        this.dentist = dentist;
    }

    public void appointDoctor(Patient patient){
        switch (patient.getTreatmentPlan()){
            case 1 -> patient.setDoctor(surgeon);
            case 2 -> patient.setDoctor(dentist);
            default -> patient.setDoctor(this);
        }
    }

    @Override
    public String treat() {
        return "the therapist treats";
    }
}
