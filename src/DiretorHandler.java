public class DiretorHandler extends Handler {

    @Override
    public void processarRequisicao(double valor) {
        if (valor <= 10000) {
            System.out.println("Diretor aprovou a requisição de valor: " + valor);
        } else {
            System.out.println("Valor muito alto, requisição não aprovada: " + valor);
        }
    }
}
