public class Main {
    public static void main(String[] args){
        MonitorEstoque monitorEstoque = new MonitorEstoque();

        Compras compras = new Compras();
        Vendas vendas = new Vendas();
        Auditoria auditoria = new Auditoria();

        monitorEstoque.inscrever(compras);
        monitorEstoque.inscrever(vendas);
        monitorEstoque.inscrever(auditoria);

        System.out.println("Quantidade atual: " + monitorEstoque.getQuantidade());

        System.out.println("\nMudando a quantidade para 0!");
        monitorEstoque.setQuantidade(0);

        System.out.println("\nMudando a quantidade para: 6");
        monitorEstoque.setQuantidade(6);

        System.out.println("\nMudando a quantidade para: 4");
        monitorEstoque.setQuantidade(4);
    }
}
