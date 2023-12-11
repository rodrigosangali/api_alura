package med.vll.api.controller;

import med.vll.api.medico.DadosCadastroMedico;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medicos")
public class MedicoController {


    @PostMapping
    public void cadastrarMedico(@RequestBody DadosCadastroMedico medico){
        System.out.println(medico);
    }

}
