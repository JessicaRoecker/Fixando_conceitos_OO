import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String codigo;
    private String nome;
    private int cargaHoraria;
    private String ementa;
    private Professor professor;
    private List<Aluno> alunosMatriculados ;

    // Construtor
    public Disciplina(String codigo, String nome, int cargaHoraria, String ementa, Professor professor) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.ementa = ementa;
        this.professor = professor;
        this.alunosMatriculados =  new ArrayList<>();
    }

    //Método para adicionar Matrícula na disciplina

    public void adicionarAluno(Aluno aluno) {
        alunosMatriculados.add(aluno);
    }


    //getters e setters dos atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public void setAlunosMatriculados(List<Aluno> listaMatriculados) {
        this.alunosMatriculados = listaMatriculados;
    }

}



