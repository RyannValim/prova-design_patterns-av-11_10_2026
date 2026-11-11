import java.util.Map;
import java.util.HashMap;

public class CatalogoDeBebidas {
    private final Map<String, Bebida> modelosBebida = new HashMap<>();

    public void registrar(String chave, Bebida prototipo){
        modelosBebida.put(chave, prototipo);
    }

    public Bebida criar(String chave){
        Bebida modeloBebida = modelosBebida.get(chave);

        if(modeloBebida == null){
            throw new IllegalArgumentException("Bebida '" + chave + "' não encontrado!");
        }

        return modeloBebida.clonar();
    }
}
