import java.util.Scanner;

public class Perfil {

    private static int Key1 = 12345; //senha para gerente 
    private static int Key2 = 56789; //senha para cliente

    public static void verificaSenha(int perfil) {

        System.out.println("Digite a senha para ter acesso: ");
        try (Scanner senhaDigitada = new Scanner(System.in)) {
            int senha = senhaDigitada.nextInt();
            if (perfil == 2  && senha == Key1) {
                Gerente.iniciar();
            }else if(perfil == 1 && senha == Key2 ) {
                MenuCliente.iniciar();
            }else{
                System.out.println("Você não tem permissão de acesso para o sistema");
            }
        }        
    }  
}
