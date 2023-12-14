public class Atendente extends Funcionario {
    @Override
    public void limparSalão(){
        System.out.println("Limpando salão!");
    }
    @Override
    public void realizarAtendimento(){
        System.out.println("Direcionando atendimento!");
    }
}
