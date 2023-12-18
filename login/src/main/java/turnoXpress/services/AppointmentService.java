package turnoXpress.services;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import turnoXpress.dtos.AppointmentRequest;
import turnoXpress.entities.Appointment;
import turnoXpress.repositories.AppointmentRepository;

@Service
public class AppointmentService {
    @Autowired
    public AppointmentRepository appointmentRepository;

    @Autowired
    public AppointmentService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    @Transactional
    public void createAppointment(AppointmentRequest appointmentRequest){
        Appointment appointment = new Appointment(appointmentRequest.getPatient(), appointmentRequest.getMedic(), appointmentRequest.getDate(), appointmentRequest.getTime(), appointmentRequest.getStatus());
        appointmentRepository.save(appointment);
    }

}
