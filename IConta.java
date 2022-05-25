public interface IConta {
    
    static final int AGENCIA_PADRAO = 0001;
    
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, IConta contaDestino);
    void exibirExtrato();  
}
