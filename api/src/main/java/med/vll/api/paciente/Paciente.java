package med.vll.api.paciente;

import med.vll.api.endereco.Endereco;

public record Paciente(String nome, String email, String Telefone, String cpf, Endereco endereco) {
}
