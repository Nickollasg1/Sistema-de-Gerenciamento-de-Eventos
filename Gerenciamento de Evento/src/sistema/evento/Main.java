package sistema.evento;
public class Main {
    public static void main(String[] args) {
        // Criação de um local para o evento
        Local local = new Local("Auditório Central", "Rua Exemplo, 123", 2);

        // Criação de um evento
        Evento evento = new Evento("Workshop de Java", local);

        // Criação de participantes
        Participante p1 = new Participante("João", "joao@email.com");
        Participante p2 = new Participante("Maria", "maria@email.com");

        // Registro de participantes
        evento.registrarParticipante(p1);
        evento.registrarParticipante(p2);

        // Geração de relatório
        evento.gerarRelatorio();
    }
}
