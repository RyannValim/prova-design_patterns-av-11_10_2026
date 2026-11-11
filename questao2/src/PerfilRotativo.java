public class PerfilRotativo implements Tarifa{
    private final double valorPorHora = 12.00;

    public double getValorPorHora(){ return this.valorPorHora; }
    
    @Override
    public double calcularTarifa(int minutos){
        int horas = minutos/60;
        return horas * this.getValorPorHora();
    }

    @Override
    public String nome(){ return "Perfil Rotativo"; }
}
