public abstract class Handler {
    protected Handler nextHandler;
    public void setNextHandler(Handler nexHandler) {
        this.nextHandler = nexHandler;
    }
    public abstract void processarRequisicao(double valor);
}
