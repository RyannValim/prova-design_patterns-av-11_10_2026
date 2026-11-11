public class Main {
    public static void main(String[] args){
        // modelo padrão
        Bebida cafe_padrao = new Bebida("cafe", 5.00);

        CatalogoDeBebidas catalogoDeBebidas = new CatalogoDeBebidas();
        catalogoDeBebidas.registrar("cafe-padrao", cafe_padrao);

        cafe_padrao.exibirInfo();
        System.out.println();

        // espresso com calda
        Bebida espresso = catalogoDeBebidas.criar("cafe-padrao");
        espresso.adicionarComplementos(new Complemento("Calda", 2.50));
        espresso.setDescricao("Espresso" + " com " + espresso.getComplementos().get(0).getNome());
        espresso.exibirInfo();
        System.out.println();

        // cha com leite
        Bebida cha = catalogoDeBebidas.criar("cafe-padrao");
        cha.adicionarComplementos(new Complemento("Leite", 1.50));
        cha.setDescricao("Chá" + " com " + cha.getComplementos().get(0).getNome());
        cha.exibirInfo();
    }
}
