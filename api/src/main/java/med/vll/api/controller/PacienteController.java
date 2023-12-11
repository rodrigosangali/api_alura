package med.vll.api.controller;

import med.vll.api.paciente.Paciente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("paciente")
public class PacienteController {



    @PostMapping
    public void cadastrarPaciente(@RequestBody Paciente paciente) {

    }
}
