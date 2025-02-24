public class GerenteHandler extends Handler {

    @Override
    public void processarRequisicao(double valor) {
        if (valor <= 5000) {
            System.out.println("Gerente aprovou a requisição de valor: " + valor);
        } else if (nextHandler != null) {
            nextHandler.processarRequisicao(valor);
        }
    }
}
