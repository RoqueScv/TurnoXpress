package turnoXpress.entities;
import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "appointments")
public class Appointment implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_app;
    @Column(name="patient")
    private Patient patient;
    @Column(name="medic")
    private Medic medic;
    @Column(name= "date")
    private LocalDate date;
    @Column(name= "time")
    private String time;
    @Column(name= "status")
    private String status;

    public Appointment() {
    }

    public Appointment(Patient patient, Medic medic, LocalDate date, String time, String status) {
        this.patient = patient;
        this.medic = medic;
        this.date = date;
        this.time = time;
        this.status = status;
    }
    public int getId_app() {
        return id_app;
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

    // Los getters y setters para id_user y medic no se deberian proporcionar públicamente
    // para limitar el acceso a estos atributos relacionados con otras entidades.
}