public abstract class Funcionario {
    private String nome;
    private String endereco;
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public final void baterPonto(){
        System.out.println("Batendo ponto!");
    }
    public abstract void realizarAtendimento();
    public abstract void limparSalão();
}
