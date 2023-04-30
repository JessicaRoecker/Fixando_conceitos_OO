public class Aluno {
    private String matricula;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;

    //construtor classe

    public Aluno(String matricula, String nome, String endereco, String telefone, String email ){
        this.matricula= matricula;
        this.nome= nome;
        this.endereco= endereco;
        this.telefone= telefone;
        this.email= email;
    }

    // métodos getters e setters para cada atributo

    public  String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco= endereco;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email= email;
    }
}
