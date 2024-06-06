package classes;

public class Grafo2 {
    private int[][] matrizAdjacencia;
    private int numeroVertices;

    public Grafo2(int numeroVertices) {
        this.numeroVertices = numeroVertices;
        matrizAdjacencia = new int[numeroVertices][numeroVertices];
    }

    public void adicionarAresta(int verticeOrigem, int verticeDestino) {
        if (verticeOrigem >= 0 && verticeOrigem < numeroVertices && verticeDestino >= 0 && verticeDestino < numeroVertices) {
            matrizAdjacencia[verticeOrigem][verticeDestino] = 1;
            matrizAdjacencia[verticeDestino][verticeOrigem] = 1;
        } else {
            System.out.println("Vértices inválidos.");
        }
    }

    public void exibirGrafo() {
        for (int i = 0; i < numeroVertices; i++) {
            for (int j = 0; j < numeroVertices; j++) {
                System.out.print(matrizAdjacencia[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean temCiclo() {
        boolean[] visitado = new boolean[numeroVertices];

        for (int v = 0; v < numeroVertices; v++) {
            if (!visitado[v]) {
                if (profundidade(v, visitado, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean profundidade(int vertice, boolean[] visitado, int pai) {
        visitado[vertice] = true;

        for (int i = 0; i < numeroVertices; i++) {
            if (matrizAdjacencia[vertice][i] == 1) {
                if (!visitado[i]) {
                    if (profundidade(i, visitado, vertice)) {
                        return true;
                    }
                } else if (i != pai) {
                    return true;
                }
            }
        }
        return false;
    }
}
