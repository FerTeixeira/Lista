import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lista l = new Lista();
        l.inserePrimeiro(1);
        l.inserePrimeiro(5);
        l.insereUltimo(10);
        No n = l.BuscarNo(1);
        l.insereDepois(n, 2);
        l.insereDepois(n, 7);
        l.mostrar();
        l.removeUltimo();
        l.removePrimeiro();
        l.remove(n);
        System.out.println();
        l.mostrar();

    }
}
