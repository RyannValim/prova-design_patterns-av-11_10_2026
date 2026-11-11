import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]){
        SistemaCobranca sistemaCobranca = new SistemaCobranca("ABC-1234", 180);

        List<Tarifa> tarifasPerfil = new ArrayList<>();
        tarifasPerfil.add(new PerfilRotativo());
        tarifasPerfil.add(new PerfilMensalista());
        tarifasPerfil.add(new PerfilConveniado());

        for (Tarifa tarifaPerfil : tarifasPerfil) {
            sistemaCobranca.setTarifa(tarifaPerfil);
            System.out.printf("%s: R$ %.2f\n", tarifaPerfil.nome(), sistemaCobranca.total());
        }
    }
}
