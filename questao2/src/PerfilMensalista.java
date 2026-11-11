public class PerfilMensalista implements Tarifa{
    private final double valorAoMes = 180.00;

    public double getValorAoMes(){ return this.valorAoMes; }

    @Override
    public double calcularTarifa(int minutos){
        return this.getValorAoMes(); // 180 ao mês
    }

    @Override
    public String nome(){ return "Perfil Mensalista"; }
}
