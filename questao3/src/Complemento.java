public class Complemento{
    private String nome;
    private double valorAdicional;

    public Complemento(String nome, double valorAdicional){
        this.nome = nome;
        this.valorAdicional = valorAdicional;
    }

    public Complemento(Complemento origem){
        this.nome = origem.nome;
        this.valorAdicional = origem.valorAdicional;
    }

    public String getNome() { return this.nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getValorAdicional() { return this.valorAdicional; }
    public void setValorAdicional(double valorAdicional) { this.valorAdicional = valorAdicional; }

    public double subtotal(){
        return valorAdicional;
    }
}
