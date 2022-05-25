import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Digite o que deseja realizar: ");
        System.out.println(" 1 - Para iniciar ");
        System.out.println(" 2 - Para Sair ");
        System.out.println("Opção:");

        try (Scanner sc = new Scanner(System.in)){
            int inicio = sc.nextInt();

            if (inicio == 1) {

                    //Opção para diferenciar uma conta de cliente de uma de gerente que terá opção para cadastar cliente    
                    System.out.println("Digite uma opção de perfil: \n 1 - Cliente \n 2 - Gerente");
                    System.out.println("Opção:");
                    try (Scanner opcaoDePerfil = new Scanner(System.in)) {
                        int perfil = opcaoDePerfil.nextInt();
                            Perfil.verificaSenha(perfil); 
                    } catch (Exception e) {
                        System.out.println("Digite um opção válida! ");
                    }
                }else if(inicio == 2){
                    System.out.println("Até mais ....");
                }else{
                    System.out.println("Esse número não é válido !");
                }
                
        } catch(Exception e ){
            System.out.println("Digite uma opçao válida!");
            
        }       
    }
  
}

