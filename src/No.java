public class No {
    
    private Integer informacao;
    private No proximo;

    public No(){ // objeto do mesmo tipo da classe contendo info e prox
        informacao = null;
        proximo = null;
    }
    
    public void setInfo(Integer informacao){ // setter info
        this.informacao = informacao;
    }

    public void setProx(No proximo){ // setter proximo
        this.proximo = proximo;
    }

    public No getProx(){ // getter prox
        return this.proximo;
    }

    public Integer getInfo(){ // getter info
        return this.informacao;
    }
}
