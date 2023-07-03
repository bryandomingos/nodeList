public class App {
    public static void main(String[] args) throws Exception {

        Lista l = new Lista();

        l.inserePrimeiro(10);
        l.mostrar();

        l.inserePrimeiro(11);
        l.mostrar();

        l.inserePrimeiro(22);
        l.mostrar();

        l.insereDepois(22, 15);
        l.mostrar();

        l.insereUltimo(99);
        l.mostrar();

        l.removePrimeiro();
        l.mostrar();

        l.remove(10);
        l.mostrar();

        l.remove(99);
        l.mostrar();

        l.removeUltimo();
        l.mostrar();

        l.removeUltimo();
        l.mostrar();

    }
}
