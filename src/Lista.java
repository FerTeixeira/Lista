public class Lista {
    private No primeiro;

    public Lista() {
        this.primeiro = null;
    }

    public boolean vazia() {
        return this.primeiro == null;
    }

    public void inserePrimeiro(int info) {
        No auxiliar = new No(info);
        auxiliar.setNext(this.primeiro);
        this.primeiro = auxiliar;
    }

    public void insereDepois(No no, int info) {
        No novo = new No(info);
        novo.setNext(no.getNext());
        no.setNext(novo);
    }

    public void insereUltimo(int info) {
        if (vazia()) {
            inserePrimeiro(info);
        } else {
            No auxiliar = this.primeiro;
            while (auxiliar != null && auxiliar.getNext() != null) {
                auxiliar = auxiliar.getNext();
            }
            if (auxiliar.getNext() == null) {
                No novo = new No(info);
                auxiliar.setNext(novo);
            }
        }
    }


    public void removePrimeiro() {
        if (vazia()) {
            System.out.println("Está vazia!");
        } else {
            this.primeiro = this.primeiro.getNext();
        }
    }



    public void removeUltimo() {
        if (vazia()) {
            System.out.println("Está vazia!");
        }else {
            No anterior = null;
            No atual = this.primeiro;
            while (atual != null && atual.getNext() != null) {
                anterior = atual;
                atual = atual.getNext();
            }
            if (anterior != null) {
                anterior.setNext(null);
            } else {
                this.primeiro = null;
            }
        }
    }

    public void remove(No no){
        if (vazia()) {
            System.out.println("Está vazia!");
        }else {
            No anterior = null;
            No atual = this.primeiro;
            while(atual.getNext() != null){
                if(atual.equals(no)){
                    if (atual.equals(this.primeiro)){
                        this.removePrimeiro();

                        return;
                    }
                    System.out.println("Nó encontrado: " + atual.getValor());
                    anterior.setNext(atual.getNext());
                    return;
                }
                anterior = atual;
                atual = atual.getNext();

            }
            if (atual.getNext() == null && atual.equals(no)) {

                this.removeUltimo();
            }
        }
    }

    public void mostrar(){
        if (vazia()){
            System.out.println("Lista vazia!");
        }else {
            No auxiliar = this.primeiro;
            while (auxiliar != null) {
                System.out.print(auxiliar.getValor() + "| ");
                auxiliar = auxiliar.getNext();
            }
        }
    }
    public No BuscarNo(int valor){
        No auxiliar = this.primeiro;
        while(auxiliar != null){
            if (auxiliar.getValor() == valor){
                return auxiliar;
            }
            auxiliar = auxiliar.getNext();
        }
        return null;
    }


}
