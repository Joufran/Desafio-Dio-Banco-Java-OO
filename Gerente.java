import java.util.Scanner;

public class Gerente {
    
    private static Clientes nomeCliente;

    public static void iniciar() {
        System.out.println("Menu \n Digite a opção que deseja executar: ");
                System.out.println("1 - Cadastrar novo Cliente na agência");
                System.out.println("2 - Sair");  
                    try(Scanner escolha  =  new Scanner( System.in)) {
                        int opcao = escolha.nextInt();
                        if (opcao == 1) {
                            cadastrarClientes();
                        } else {
                           System.out.println("Até mais ...");  
                        }
                    } catch (Exception e) {
                        System.out.println("Escolha uma opção válida!");
                        iniciar();
                    }                
    }

    private static void cadastrarClientes() {

        Clientes novoCliente = new Clientes(nomeCliente);
        System.out.println("Digite o nome do Novo Cliente: ");

        try (Scanner sc = new Scanner(System.in)) {
            String nameCliente = sc.nextLine();
            novoCliente.setNome(nameCliente); 
            
            depositoInicial(nameCliente);
        
 
        } catch (Exception e) {
            System.out.println("Digite um nome!");
            cadastrarClientes();
        }   
    } 

    private static void depositoInicial(String nome) {
        
       System.out.println("O valor inicial Deve ser a cima de R$ 50,00 ");
       System.out.println("E será depositado na Conta Corrente do Cliente.");
       System.out.println("Digite um valor para Abertura de Conta");

       try (Scanner sc = new Scanner(System.in)){
           
           Double valorInicial = sc.nextDouble(); 

           Conta cc = new ContaCorrente(nomeCliente);
           Conta cp = new ContaPoupaca(nomeCliente);

           if (valorInicial >= 50) {
            System.out.println("\n Conta Corrente: \n");   
            cc.depositar(valorInicial);  
            System.out.println(" Conta poupança");
            cp.depositar(0);
  
           }else if (valorInicial < 50){
               System.out.println("O valor deve ser válido com valor de 50.00 ou superior! \n");
               depositoInicial(nome);
           }
              
       } catch (Exception e) {
           System.out.println("Não foi digitado um tipo válido exigido \n");

       } 
    }

    
}
