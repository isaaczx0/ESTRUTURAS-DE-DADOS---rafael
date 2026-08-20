public class No {
    private String dado;
    private No nextNo;
    
    public No(){
        this(null, null);
        
    }
    public No(String dado){
        this(dado, null);
    }
    public No (String dado, No nextNo){
        this.dado = dado;
        this.nextNo = nextNo;
    }
    public String getDado() {
        return dado;
    }
    public void setDado(String dado) {
        this.dado = dado;
    }
    public void setNextNo(No nextNo){
        this.nextNo = nextNo;
    }
    public No getnextNo(){
        return this.nextNo;
    }
}
