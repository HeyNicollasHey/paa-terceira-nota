package classes;

import java.util.ArrayList;
import java.util.List;

public class GrafoDirecionado {
    private List<List<Integer>> listaAdjacencia;
    private int numeroVertices;

    public GrafoDirecionado(int numeroVertices) {
        this.numeroVertices = numeroVertices;
        listaAdjacencia = new ArrayList<>(numeroVertices);

        for (int i = 0; i < numeroVertices; i++) {
            listaAdjacencia.add(new ArrayList<>());
        }
    }

    public void adicionarAresta(int verticeOrigem, int verticeDestino) {
        if (verticeOrigem >= 0 && verticeOrigem < numeroVertices && verticeDestino >= 0 && verticeDestino < numeroVertices) {
            listaAdjacencia.get(verticeOrigem).add(verticeDestino);
        } else {
            System.out.println("Vértices inválidos.");
        }
    }

    public void removerAresta(int verticeOrigem, int verticeDestino) {
        if (verticeOrigem >= 0 && verticeOrigem < numeroVertices && verticeDestino >= 0 && verticeDestino < numeroVertices) {
            listaAdjacencia.get(verticeOrigem).remove(Integer.valueOf(verticeDestino));
        } else {
            System.out.println("Vértices inválidos.");
        }
    }

    public void exibirGrafo() {
        for (int i = 0; i < numeroVertices; i++) {
            System.out.print("Vértice " + i + ":");
            for (int vertice : listaAdjacencia.get(i)) {
                System.out.print(" -> " + vertice);
            }
            System.out.println();
        }
    }
}
