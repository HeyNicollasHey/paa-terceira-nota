import classes.Grafo;
import classes.Grafo2;
import classes.GrafoDirecionado;

public class Main {
    public void main(String[] args) {

        //Questão 1: Matriz de adjacencia
        Grafo grafo = new Grafo(5);
        grafo.adicionarAresta(0, 1);
        grafo.adicionarAresta(0, 4);
        grafo.adicionarAresta(1, 2);
        grafo.adicionarAresta(1, 3);
        grafo.adicionarAresta(1, 4);
        grafo.adicionarAresta(2, 3);
        grafo.adicionarAresta(3, 4);

        System.out.println("Matriz de Adjacência do Grafo:");
        grafo.exibirGrafo();

        System.out.println("\nRemovendo as arestas entre 1 e 4, 1 e 2, 1 e 3:");
        grafo.removerAresta(1, 4);
        grafo.removerAresta(1, 2);
        grafo.removerAresta(1, 3);
        grafo.exibirGrafo();

        //Questão 2: Grafo conectado ou não
        Grafo2 grafoComCiclo = new Grafo2(5);
        grafoComCiclo.adicionarAresta(0, 1);
        grafoComCiclo.adicionarAresta(0, 4);
        grafoComCiclo.adicionarAresta(1, 2);
        grafoComCiclo.adicionarAresta(1, 3);
        grafoComCiclo.adicionarAresta(1, 4);
        grafoComCiclo.adicionarAresta(2, 3);
        grafoComCiclo.adicionarAresta(3, 4);

        System.out.println("Matriz de Adjacência do Grafo para Verificação de Ciclo:");
        grafoComCiclo.exibirGrafo();

        if (grafoComCiclo.temCiclo()) {
            System.out.println("O grafo contém um ciclo.");
        } else {
            System.out.println("O grafo não contém um ciclo.");
        }

        // Questão 3: Grafo direcionado com lista de adjacência
        GrafoDirecionado grafoDirecionado = new GrafoDirecionado(5);
        grafoDirecionado.adicionarAresta(0, 1);
        grafoDirecionado.adicionarAresta(0, 4);
        grafoDirecionado.adicionarAresta(1, 2);
        grafoDirecionado.adicionarAresta(1, 3);
        grafoDirecionado.adicionarAresta(1, 4);
        grafoDirecionado.adicionarAresta(2, 3);
        grafoDirecionado.adicionarAresta(3, 4);

        System.out.println("Lista de Adjacência do Grafo Direcionado:");
        grafoDirecionado.exibirGrafo();

        System.out.println("\nRemovendo a aresta entre 1 e 4:");
        grafoDirecionado.removerAresta(1, 4);
        grafoDirecionado.exibirGrafo();
    }
}
