
public class Clientes extends Conta {


    public Clientes(Clientes cliente2) {
        super(cliente2);

 }

private String nome; 

   public String getNome() {
       return nome;

   }

   public void setNome(String string) {
       this.nome = string;
   }
 
}
