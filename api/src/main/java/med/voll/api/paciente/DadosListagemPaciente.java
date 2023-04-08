package med.voll.api.paciente;

public record DadosListagemPaciente(Long id, String pacte_nome, String pacte_email) {
    public DadosListagemPaciente(Paciente paciente){
        this(paciente.getId(), paciente.getPacte_nome(), paciente.getPacte_email());
    }
}
