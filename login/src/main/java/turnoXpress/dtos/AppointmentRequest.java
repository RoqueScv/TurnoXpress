package turnoXpress.dtos;

import turnoXpress.entities.Medic;
import turnoXpress.entities.Patient;

import java.time.LocalDate;

public class AppointmentRequest {
    private Patient patient;
    private Medic medic;
    private LocalDate date;
    private String time;
    private String status;

    public AppointmentRequest() {
    }
    public AppointmentRequest(Patient patient, Medic medic, LocalDate date, String time, String status) {
        this.patient = patient;
        this.medic = medic;
        this.date = date;
        this.time = time;
        this.status = status;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Medic getMedic() {
        return medic;
    }

    public void setMedic(Medic medic) {
        this.medic = medic;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
