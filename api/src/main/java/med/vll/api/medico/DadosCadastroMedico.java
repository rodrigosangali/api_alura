package med.vll.api.medico;

import med.vll.api.endereco.Endereco;
import med.vll.api.enumerator.Especialidades;

public record DadosCadastroMedico(String nome, String email, String telefone, String CRM, Especialidades especialidades,
                                  Endereco endereco  ) {
}
