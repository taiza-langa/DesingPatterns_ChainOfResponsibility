public class App {
    public static void main(String[] args) {
        // Criação dos manipuladores
        Handler funcionario = new FuncionarioHandler();
        Handler gerente = new GerenteHandler();
        Handler diretor = new DiretorHandler();

        // Cofiguração da cadeia de responsabilidade
        funcionario.setNextHandler(gerente); 
        gerente.setNextHandler(diretor);

        // Enviando requisiçõespara o primeiro manipulador da cadeia
        funcionario.processarRequisicao(500);
        funcionario.processarRequisicao(3000);
        funcionario.processarRequisicao(8000);
        funcionario.processarRequisicao(12000);
    }
}
