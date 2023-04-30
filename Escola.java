
public class Escola {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("00222555", "Jessica","Rua: Eduardo ribeiro de andrade, numero 147","47991825709","roeckerarns@gmail.com");
        Curso curso1 = new Curso("Engenharia de Software", "5 anos");
        Professor professor1 = new Professor("Glauco","Mestre","Rua: iririu","4799495252","glauco@gmail.com");
       Disciplina disciplina1 = new Disciplina("02222","Programação Orientada Objeos",90,"Introdução à Programação Orientada a Objetos\n" +
                "Conceitos básicos de POO. Vantagens e desvantagens da abordagem orientada a objetos",professor1 );

        Matriculado matriculado1 = new Matriculado(aluno1,disciplina1,2023,2);

        System.out.println("Dados do Aluno:");
        System.out.println("Matrícula: " + aluno1.getMatricula());
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Endereço: " + aluno1.getEndereco());
        System.out.println("Telefone: " + aluno1.getTelefone());
        System.out.println("E-mail: " + aluno1.getEmail());

        System.out.println("*****************************");
        System.out.println("");
        System.out.println("*****************************");

        System.out.println("Dados do curso");
        System.out.println("Nome do curso: "+curso1.getNome());
        System.out.println("Duração do curso: "+curso1.getDuracao());

        System.out.println("*****************************");
        System.out.println("");
        System.out.println("*****************************");

        System.out.println("Dados das matriculas em devidos cursos e disciplinas");
        System.out.println("Nome do Aluno: "+matriculado1.getAluno());
        System.out.println("Nome da disciplina: "+matriculado1.getDisciplina());
        System.out.println("Ano de inicio: "+matriculado1.getAno());
        System.out.println("Semestre que esta cursando: "+matriculado1.getSemestre());

        System.out.println("*****************************");
        System.out.println("");
        System.out.println("*****************************");

        System.out.println("Dados da disciplina:");
        System.out.println("Codigo: "+disciplina1.getCodigo());
        System.out.println("Nome da disciplina: "+disciplina1.getNome());
        System.out.println("Carga Horaria: "+disciplina1.getCargaHoraria());
        System.out.println("Ementa: "+disciplina1.getEmenta());
        System.out.println("Professor: "+disciplina1.getProfessor());
    }





}
