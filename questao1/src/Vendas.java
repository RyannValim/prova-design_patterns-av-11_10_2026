public class Vendas implements Observer{
    private int quantidade;

    public int getQuantidade(){ return this.quantidade; }
    public void setQuantidade(int quantidade){ this.quantidade = quantidade; }

    public void update(int quantidade){
        this.setQuantidade(quantidade);

        if(this.getQuantidade() > 0){
            System.out.println("ALERTA [VENDAS]: O estoque foi reposto e agora possui " + this.getQuantidade() + " unidades!");
        }
    }
}