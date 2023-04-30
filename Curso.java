import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private String  duracao;
    private List<Disciplina> disciplinas;


    // Construtor
    public Curso(String nome, String duracao) {
        this.nome = nome;
        this.duracao = duracao;
        this.disciplinas = new ArrayList<>();

    }

    // Método para adicionar uma disciplina ao curso
    public void adicionarDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    // Método para matricular um aluno em uma disciplina do curso
    public void adicionarAlunoNaDisciplina(Aluno aluno, Disciplina  disciplina){
        disciplina.adicionarAluno(aluno);
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome= nome;
    }

    public String getDuracao(){
        return duracao;
    }

    public void setDuracao(String duracao){
        this.duracao=duracao;
    }

    public List<Disciplina> getDisciplinas(){
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas){
        this.disciplinas= disciplinas;
    }



}
