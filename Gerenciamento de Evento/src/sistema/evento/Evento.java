package sistema.evento;

import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String nome;
    private Local local;
    private final List<Participante> participantes;

    public Evento(String nome, Local local) {
        this.nome = nome;
        this.local = local;
        this.participantes = new ArrayList<>();
    }

    // Método para cadastrar um participante
    public boolean registrarParticipante(Participante participante) {
        if (participantes.size() < local.getCapacidade()) {
            participantes.add(participante);
            return true;
        } else {
            System.out.println("Lotação esgotada para o evento " + nome);
            return false;
        }
    }

    // Método para verificar lotação
    public boolean lotacaoCompleta() {
        return participantes.size() >= local.getCapacidade();
    }

    // Método para gerar relatório de participantes
    public void gerarRelatorio() {
        System.out.println("Relatório de Participantes do Evento: " + nome);
        for (Participante participante : participantes) {
            System.out.println(participante);
        }
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }
}
