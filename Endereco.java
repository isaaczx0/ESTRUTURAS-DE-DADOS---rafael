public class Endereco {
    private String rua;
    private int numero;
    private String bairro;

    public Endereco(){
        this(null, 0, null);
    }

    public Endereco(String rua, int numero, String bairro){
        setRua(rua);
        setNumero(numero);
        setBairro(bairro);
    }
    @Override
    public String toString(){
        return String.format("Endereco[Rua: %s, Numero: %d, Bairro: %s]",getRua(),getNumero(),getBairro());
    }
    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return this.rua;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getBairro() {
        return this.bairro;
    }
}
