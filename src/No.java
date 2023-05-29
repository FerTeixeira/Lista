public class No {
    private int valor;
    private No next;
    public No(int info){
        this.valor = info;
        next = null;

    }

    public void setValor(int info) {
        this.valor = info;
    }

    public void setNext(No next) {
        this.next = next;
    }

    public No getNext() {
        return next;
    }

    public int getValor() {
        return valor;
    }
}
