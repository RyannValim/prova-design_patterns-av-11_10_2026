public class Compras implements Observer{
    private int quantidade;

    public int getQuantidade(){ return this.quantidade; }
    public void setQuantidade(int quantidade){ this.quantidade = quantidade; }

    public void update(int quantidade){
        this.setQuantidade(quantidade);

        if(this.getQuantidade() < 5){
            System.out.println("ALERTA [COMPRAS]: Estoque abaixo de 5 unidades. Quantidade: " + this.getQuantidade());
        }
    }
}