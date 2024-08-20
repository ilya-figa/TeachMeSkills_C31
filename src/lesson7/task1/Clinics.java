package lesson7.task1;

import java.util.ArrayList;
import java.util.List;

public class Clinics {
    private List<Patient> patientList;
    private Therapist therapist;

    public Clinics(Therapist therapist) {
        this.therapist = therapist;
        this.patientList = new ArrayList<>();
    }

    public void addPatient(Patient patient){
        patientList.add(patient);
    }

    public List<Patient> getPatientList(){
        return patientList;
    }

    public Therapist getTherapist() {
        return therapist;
    }
}
