package med.voll.api.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroPaciente(
        @NotBlank
        String pacte_nome,
        @NotBlank
        @Email
        String pacte_email,
        @NotBlank
        String pacte_telefone,

        @NotNull @Valid
        DadosEndereco endereco) {

}
