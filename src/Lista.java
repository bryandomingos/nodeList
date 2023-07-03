public class Lista {

    private No primeiro; // objeto com endereco do primeiro elemento da lista

    public Lista() {
        primeiro = null; // primeiro elemento da lista
    }

    public boolean vazia() { // metodo que verifica lista vazia se pirmiero: null
        if (primeiro == null) {
            System.out.println("Lista vazia!" + "\n");
            return true;
        } else {
            return false;
        }
    }

    public void inserePrimeiro(int info) { // metodo que insere No na primeira posicao
        No novo = new No(); // novo no
        novo.setInfo(info); // info do novo no
        novo.setProx(primeiro); // prox como primeiro (que sera o proximo)
        primeiro = novo; // novo se torna primeiro
    }

    public void insereDepois(int no, int info) { // metodo que insere No apos No especifico com parametros do valor do No e do novo No
        if (vazia()) { // retorna vazia se vazia
            return;
        } else {
            No aux = primeiro; // No auxiliar de repeticao
            while (aux != null) { // repeticao enquanto nao for null
                if (aux.getInfo() == no) { // quando info de aux for igual ao do No especificado
                    No novo = new No(); // novo No a ser inserido
                    novo.setInfo(info); // info do novo No
                    novo.setProx(aux.getProx()); // prox do novo No igual ao prox do auxiliar
                    aux.setProx(novo); // prox do auxiliar igual ao novo No
                    break;
                }
                aux = aux.getProx(); // proximo valor para repeticao
            }
        }
    }

    public void insereUltimo(int info) { // metodo que insere parametro na ultima posicao
        if (vazia()) { // retorna vazia se vazia
            inserePrimeiro(info);
        } else {
            No aux = primeiro; // No auxiliar de repeticao
            while (aux.getProx() != null) { // repeticao enquanto proximo nao for null (fim da lsita)
                aux = aux.getProx(); // proximo valor para repeticao
            }

            if (aux.getProx() == null) { // ao chegar no fim da lista
                No novo = new No(); // novo No a ser inserido
                novo.setInfo(info); // info do novo No 
                aux.setProx(novo); // prox do ultimo como novo
            }
        }
    }

    public void removePrimeiro() { // metodo que revome primeiro elemento
        if (vazia()) { // retorna vazia se vazia
            return;
        } else {
            primeiro = primeiro.getProx(); // primeiro vira o proximo do primeiro
        }
    }

    public void removeUltimo() { // metodo que remove ultimo elemento
        if (vazia()) { // retorna vazia se vazia
            return;
        }

        No aux = primeiro; // No auxiliar de repeticao
        No anterior = null; // No anterior

        while (aux.getProx() != null) { // ao chegar no fim da lista
            anterior = aux; // valor anterior para repeticao
            aux = aux.getProx(); // proximo valor para repeticao
        }

        if (anterior == null) { // unico elemento na lista
            primeiro = null; // primeiro/ultimo deletado
        } else {
            anterior.setProx(null); // remove o ultimo ao transformar prox do anterior em null
        }
    }

    public void remove(int info) { // metodo que remove No especifico
        if (vazia()) { // retorna vazia se vazia
            return;
        } else {
            No aux = primeiro; // No auxiliar de repeticao
            No anterior = null; // No anterior
            while (aux != null) { // enquanto aux nao for null
                if (aux.getInfo() == info) { // quando aux for igual a parametro
                    if (anterior == null) { // unico elemento da lista
                        primeiro = aux.getProx(); // primeiro vira o proximo do primeiro
                    } else {
                        anterior.setProx(aux.getProx()); // transforma proximo do anterior no proximo do proximo
                    }
                    break;
                }
                anterior = aux; // valor anterior paraa repeticao
                aux = aux.getProx(); // proximo valor para repeticao
            }
        }
    }

    public void mostrar() { // metodo para mostrar lista
        No aux = primeiro; // auxiliar de repeticao
        if (vazia()) { // retorna vazia se vazia
            return;
        }
        while (aux != null) { // enquanto aux nao for null
            if (aux.getProx() != null) { // se proximo nao for null
                System.out.print(aux.getInfo() + ", "); // print seguido de virgula
                aux = aux.getProx(); // proximo valor para repeticao
            } else { // se proximo for null (fim da lista)
                System.out.print(aux.getInfo() + "\n" + "\n"); // print sem virgula (ultimo valor), pula linha para proximo print
                aux = aux.getProx(); // proximo valor para repeticao
            }
        }
    }
}
