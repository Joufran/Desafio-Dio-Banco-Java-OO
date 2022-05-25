import java.util.Scanner;

public class MenuCliente {
    
    private static Clientes nomeCliente;

    public static void iniciar() {
    
        Clientes novoCliente = new Clientes(nomeCliente);       
       
            String nameCliente = "Marcelo";
            novoCliente.setNome(nameCliente);             
            
            Conta cc = new ContaCorrente(nomeCliente);
            Conta cp = new ContaPoupaca(nomeCliente);
   
             cc.depositar(100);  
             cp.depositar(0);
                   
        System.out.println("MENU \nEscolha uma das Opções: ");
        System.out.println(" 1 - Consultar Extrato");
        System.out.println(" 2 - Sacar");
        System.out.println(" 3 - Depositar");
        System.out.println(" 4 - Transferir");
        System.out.println(" 5 - Sair \n");
        System.out.println("Opção: ");  
        
        try (Scanner op = new Scanner(System.in)) {
            int opcao = op.nextInt();   
         
            switch (opcao) {
                case 1:
                    // Exibirá o Extrato para o Cliente
                    System.out.println(" EXTRATO DA CONTA CORRENTE");
                    cc.exibirExtrato();
                    System.out.println(" EXTRATO DA CONTA POUPANÇA");
                    cp.exibirExtrato();

                    break;

                case 2:
                    //Exibe o valor que tem em cada conta 
                    System.out.println(" EXTRATO DA CONTA CORRENTE");
                    cc.exibirExtrato();
                    System.out.println(" EXTRATO DA CONTA POUPANÇA");
                    cp.exibirExtrato();

                    //Pergunta o valor que será sacado
                    System.out.println("Digite o valor que deseja Sacar: ");

                    try (Scanner val = new Scanner(System.in);){
                        double valor = val.nextDouble();

                        //Pergunta de qual conta se deseja sacar 
                        System.out.println("De qual conta será feito o saque ?");
                        System.out.println("1 - Conta Corrente \n2- Conta Poupança");
    
                        try (Scanner qc = new Scanner(System.in);) {
                            Integer sacarDaConta = qc.nextInt();
    
                            if (sacarDaConta == 1) {
                                cc.sacar(valor); 
                            } else if (sacarDaConta == 2){
                                cp.sacar(valor);
                            }else{
                                System.out.println("Digite uma opção válida !");
                                iniciar();
                            }
    
                        } catch (Exception e) {
                            System.out.println("Digite uma opção válida !");
                            iniciar();
                        }
                    } catch (Exception e) {
                        System.out.println("Opção inválida ! ");
                    }  

                    break;
    
                case 3:
                    System.out.println("Digite o Valor que será depositado:");

                    try (Scanner valorDeposito = new Scanner(System.in)) {
                        double depositado = valorDeposito.nextDouble();

                        System.out.println("Em qual conta será depositado o valor ?");
                        System.out.println(" 1 - Conta Corrente \n 2 - Conta Poupança");

                            try (Scanner dc = new Scanner(System.in);) {
                            Integer depositarNaConta = dc.nextInt();

                                if (depositarNaConta == 1) {
                                    cc.depositar(depositado);
                                    } else if (depositarNaConta == 2){
                                    cp.depositar(depositado);;
                                    }else{
                                    System.out.println("Digite uma opção válida !");
                                    iniciar();
                                    }

                            } catch (Exception e) {
                                System.out.println("Digite uma opção válida !");
                                iniciar();
                            }

                    } catch (Exception e) {
                        System.out.println("Digite um valor válido");
                        iniciar();
                    }   

                    break;

                case 4:
                System.out.println(" EXTRATO DA CONTA CORRENTE");
                cc.exibirExtrato();
                System.out.println(" EXTRATO DA CONTA POUPANÇA");
                cp.exibirExtrato();
                    System.out.println("Digite o valor que será transferido");
                    Scanner valorParaTransferir = new Scanner(System.in);
                    double transferirValor = valorParaTransferir.nextDouble();
    
                    System.out.println("Digite a Conta Destino");
                    //IConta transferirParaConta = new Scanner(System.in);
    
                   cc.transferir(transferirValor, cc); 

                    break;   
    
                case 5:
                    System.out.println("Até mais ...");

                    break;
    
                default:
                    System.out.println("Escolha uma opção válida");

                    break;
            }

                  
    }


    
}
}

