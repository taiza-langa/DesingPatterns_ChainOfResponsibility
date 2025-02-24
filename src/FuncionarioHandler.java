public class FuncionarioHandler extends Handler {

    @Override
    public void processarRequisicao(double valor) {
        if (valor <= 1000) {
            System.out.println("Funcionário aprovou a requisição de valor: " + valor);
        } else if (nextHandler != null) {
            nextHandler.processarRequisicao(valor);
        }
    }
}
