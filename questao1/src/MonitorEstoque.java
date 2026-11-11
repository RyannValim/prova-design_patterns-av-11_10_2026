import java.util.List;
import java.util.ArrayList;

public class MonitorEstoque{ // ConcreteSubject
    private String nome;
    private int quantidade = 0; // status
    private List<Observer> observadores = new ArrayList<>();

    public void setNome(String nome){ this.nome = nome; }
    public String getNome(){ return this.nome; }

    public int getQuantidade(){ return this.quantidade; }
    public void setQuantidade(int quantidade){
        if(quantidade == getQuantidade()){
            System.out.println("A quantidade permaneceu a mesma, os observadores nao serao notificados!");
            return;
        }

        this.quantidade = quantidade;
        this.notificar();
    }

    public void notificar(){
        for (Observer observer : observadores) {
            observer.update(this.getQuantidade());
        }
    }

    public void inscrever(Observer observador){
        observadores.add(observador);
    }

    public void desinscrever(Observer observador){
        observadores.remove(observador);
    }
}