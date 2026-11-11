public interface Subject{
    public void notificar();
    public void inscrever(Observer observador);
    public void desinscrever(Observer observador);
}