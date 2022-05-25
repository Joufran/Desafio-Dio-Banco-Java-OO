public abstract class Conta implements IConta{
    
    private static final int AGENCIA_PADRAO = 001;
    private static int SEQUENCIAL = 001;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Clientes cliente;

    public Conta (Object cliente2) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = (Clientes) cliente2;
    }
    
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("sacado: " + valor);
            System.out.println("Novo saldo:  " + saldo + "\n");    
        } else {
            System.out.println("saldo insuficiente. Realize um depósito \n");
        }       
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depositado: " + valor);
        System.out.println("Novo saldo: " + saldo + "\n");        
    }

    @Override
    public void transferir(double valor, IConta contaDestino ) {
        this.sacar(valor);
        System.out.println("Tranferencia realizada com sucesso para a agencia " + agencia);
        System.out.println("Novo saldo: " + saldo + "\n");   
    } 
    
    @Override
    public void exibirExtrato() {
        System.out.println("Número da Conta: " + this.numero);
        System.out.println("Saldo atual: "  + this.saldo);
    }
}
