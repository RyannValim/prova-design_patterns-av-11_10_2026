public class Auditoria implements Observer{
    private int quantidade;

    public int getQuantidade(){ return this.quantidade; }
    public void setQuantidade(int quantidade){ this.quantidade = quantidade; }

    public void update(int quantidade){
        this.setQuantidade(quantidade);

        System.out.println("[AUDIT]: Estoque alterado para: " + this.getQuantidade() + " unidades!");
    }
}