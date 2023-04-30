public class Matriculado {
    private Aluno aluno;
    private Disciplina disciplina;
    private int ano;
    private int semestre;

    //construtor
    public Matriculado(Aluno aluno, Disciplina disciplina, int ano, int semestre){
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.ano = ano;
        this.semestre = semestre;

    }

    // getters e setters de cada atributo
    public Aluno getAluno(){
        return aluno;
    }

    public void setAluno(Aluno aluno){
        this.aluno = aluno;
    }

    public Disciplina getDisciplina(){
        return  disciplina;
    }

    public void setDisciplina(Disciplina diciplina){
        this.disciplina = diciplina;
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public int getSemestre(){
        return semestre;
    }

    public void setSemestre(int semestre){
        this.semestre = semestre;
    }
}
