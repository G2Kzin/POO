package p.questao_2;

public class Aluno extends Pessoa{
     private String curso;
    private String disciplina;

    public Aluno(String nome, int idade, String cpf, String curso, String disciplina) {
        super(nome, idade, cpf);
        this.curso = curso;
        this.disciplina = disciplina;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override

    public String toString() {
        return
                "Aluno{" + "Curso=" + curso  + ", Disciplina=" + disciplina +  ", Cpf=" + getCpf() + ", Nome=" + getNome() + ", Idade=" + getIdade();
    }
}
