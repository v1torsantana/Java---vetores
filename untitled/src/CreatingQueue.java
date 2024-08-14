public class CreatingQueue {
    private Integer[] queue;
    private int posicao_final;

    public CreatingQueue(int size) {
        queue = new Integer[size];
        posicao_final = 0;
    }

    public void adicionar(Integer objeto) {
        if (posicao_final < queue.length) {
            queue[posicao_final] = objeto;
            posicao_final++;
        } else {
            System.out.println("A fila está cheia.");
        }
    }

    public void buscar(Integer posicao) {
        if (posicao >= 0 && posicao < posicao_final) {
            System.out.println(queue[posicao]);
        } else {
            System.out.println("Posição inválida.");
        }
    }

    public void atualizar(Integer posicao, Integer objeto) {
        if (posicao >= 0 && posicao < posicao_final) {
            queue[posicao] = objeto;
        } else {
            System.out.println("Posição inválida.");
        }
    }

    public void remover(Integer posicao) {
        if (posicao >= 0 && posicao < posicao_final) {
            // Desloca os elementos para preencher o espaço
            for (int i = posicao; i < posicao_final - 1; i++) {
                queue[i] = queue[i + 1];
            }
            queue[posicao_final - 1] = null;
            posicao_final--;
        } else {
            System.out.println("Posição inválida.");
        }
    }

    public Integer[] getQueue() {
        return queue;
    }

    public void listar() {
        System.out.print("Fila: ");
        for (int i = 0; i < posicao_final; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}