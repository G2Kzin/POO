package Tarefas;

public class Tarefa {

    private String nomeTarefa;
    private String oqFaz;
    private String data;
    private boolean concluida;

    public Tarefa(String nomeTarefa, String tempo) {
        this.nomeTarefa = nomeTarefa;
        this.data = tempo;
    }

    @Override
    public String toString() {
        return "Tarefa: " + nomeTarefa + "\nTempo: " + data + "\nO que faz: " + oqFaz + "\n";
    }

    public String getNomeTarefa() {
        return nomeTarefa;
    }

    public void setNomeTarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
    }

    public String getOqFaz() {
        return oqFaz;
    }

    public void setOqFaz(String oqFaz) {
        this.oqFaz = oqFaz;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public boolean isConcluida() {
        return concluida;
    }
}

