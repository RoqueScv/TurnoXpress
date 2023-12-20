package turnoXpress.dtos;

import turnoXpress.entities.Medic;
import turnoXpress.entities.Patient;

import java.time.LocalDate;

public class AppointmentRequest {
    private String patient;
    private String medic;
    private String date;
    private String time;
    private String status;

    public AppointmentRequest() {
    }
    public AppointmentRequest(String patient, String medic, String date, String time, String status) {
        this.patient = patient;
        this.medic = medic;
        this.date = date;
        this.time = time;
        this.status = status;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public String getMedic() {
        return medic;
    }

    public void setMedic(String medic) {
        this.medic = medic;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
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
