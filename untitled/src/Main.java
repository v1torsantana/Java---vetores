//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CreatingQueue teste = new CreatingQueue(5);
        teste.adicionar(1);
        teste.adicionar(2);
        teste.adicionar(1000);
        teste.adicionar(700);
        teste.adicionar(7);
        teste.remover(0);
        teste.listar();
        teste.buscar(3);
        teste.atualizar(1, 200);

        Fila fila = new Fila(2);
        fila.getIsQueueEmpty();



    }
    }
