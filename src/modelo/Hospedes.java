package modelo;

public class Hospedes {

    private String nome;
    private String email;
    private String numeroIdentificacao;
    private String telefone;

    public Hospedes(String nome, String email, String numeroIdentificacao){
        validarNome(nome);
        setEmail(email);
        validarNumeroIdentificacao(numeroIdentificacao);
        this.telefone = null;
    }
    public Hospedes(String nome, String email, String numeroId , String telefone){
       this(nome, email, numeroId);
        this.numeroIdentificacao = numeroId;
        this.telefone = telefone;
    }

    public String getNome(){
        return nome;
    }
    public String getEmail(){
        return  email;
    }
    public  String getTelefone(){
        return telefone;
    }

    public String getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    public void validarNome(String nome){
       if(nome == null || nome.isBlank()){
           throw new IllegalArgumentException("Nome Não pode ser vazio.");
       }
        this.nome = nome.trim();
    }


    public boolean emailValido(String email){
       return email != null
               && email.contains(".")
               && email.contains("@") && email.indexOf("@") < email.lastIndexOf(".");

    }

    public void validarNumeroIdentificacao(String numeroIdentificacao){
       if (numeroIdentificacao == null || numeroIdentificacao.isBlank()){
           System.out.println("Numero de identificaçao Obrigatorio. ");
       }
       this.numeroIdentificacao = numeroIdentificacao;

    }
    public void setEmail(String email){
        if(!emailValido(email)){
            throw new IllegalArgumentException("Email inválido: " + email);
        }
        this.email = email.trim();

    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    @Override
    public String toString() {

        String tel = telefone != null ? " | Tel: " + telefone : "";
        return nome + " [" + numeroIdentificacao + "] - " + email + tel;
    }
}
