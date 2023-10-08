package math.ves.api.professor;

public record Cadastramento(
        Especializacao especializacao,
        String nome,
        String crm,
        String email
) {
}
