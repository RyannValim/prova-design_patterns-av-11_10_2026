public class SistemaCobranca{ // CONTEXT
    private String placa;
    private int minutos;

    private Tarifa tarifa;

    public SistemaCobranca(String placa, int minutos){
        this.placa = placa;
        this.minutos = minutos;
    }

    public int getMinutos(){ return this.minutos; }
    public void setMinutos(int minutos){ this.minutos = minutos; }

    public String getPlaca(){ return this.placa; }
    public void setPlaca(String placa){ this.placa = placa; }

    public void setTarifa(Tarifa tarifa){ this.tarifa = tarifa; }

    public double total(){
        return tarifa.calcularTarifa(this.getMinutos());
    }
}
