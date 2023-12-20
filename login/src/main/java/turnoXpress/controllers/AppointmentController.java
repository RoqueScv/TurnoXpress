package turnoXpress.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import turnoXpress.dtos.AppointmentRequest;
import turnoXpress.services.AppointmentService;

@RestController
@CrossOrigin
@RequestMapping("/api/v3")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @PostMapping("/appointment")
    public ResponseEntity<String> appointment(@RequestBody AppointmentRequest appointmentRequest) {
        ResponseEntity<String> result;
        try {
            appointmentService.createAppointment(appointmentRequest);
            result = ResponseEntity.ok("Turno creado exitosamente");
        } catch (Exception e) {
            result = null;
        }
        return result;
    }

}
