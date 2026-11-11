import java.util.List;
import java.util.ArrayList;

public class Bebida implements Prototype<Bebida>{
    private String descricao;
    private double preco;

    private List<Complemento> complementos = new ArrayList<>();

    public Bebida(String descricao, double preco){
        this.descricao = descricao;
        this.preco = preco;
    }

    public void setDescricao(String descricao){ this.descricao = descricao; }
    public String getDescricao(){ return this.descricao; }

    public void setPreco(double preco){ this.preco = preco; }
    public double getPreco(){ return this.preco; }

    public List<Complemento> getComplementos(){ return this.complementos; }

    @Override
    public Bebida clonar(){
        Bebida copiaBebida = new Bebida(this.descricao, this.preco);
        for (Complemento complemento : this.complementos) {
            copiaBebida.complementos.add(new Complemento(complemento));
        }

        return copiaBebida;
    }

    public void adicionarComplementos(Complemento complemento){
        complementos.add(complemento);
    }

    public void exibirInfo(){
        System.out.println("===== INFORMAÇÕES DA BEBIDA =====");
        System.out.println("Descricao: " + getDescricao());
        System.out.println("Preço: " + valorTotal());
        System.out.println("Complementos: ");
        for (Complemento complemento : complementos) {
            System.out.println(
                "Nome: " + complemento.getNome() +
                "\nValor adicional: R$" + complemento.getValorAdicional()
            );
        }
        System.out.println("==================================");
    }

    public Double valorTotal(){
        for(Complemento complemento : complementos){
            this.setPreco(this.preco += complemento.subtotal());
        }
        
        return this.getPreco();
    }
}
