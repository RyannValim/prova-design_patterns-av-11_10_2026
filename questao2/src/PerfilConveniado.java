public class PerfilConveniado implements Tarifa{
    private final int desconto = 30;
    private final double valorHora = 10.00;

    public int getDesconto(){ return this.desconto; }
    public double getValorHora(){ return this.valorHora; }

    @Override
    public double calcularTarifa(int minutos){
        int minutosDesconto = minutos - this.getDesconto();

        return (minutosDesconto/60) * getValorHora();
    }

    @Override
    public String nome(){ return "Perfil Conveniado"; }
}
