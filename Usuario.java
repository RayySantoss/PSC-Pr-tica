import java.util.Scanner;

public class Usuario {
    private String nome;
    private int idade;
    private String email;
    private String tipoUsuario;


     Scanner sc = new Scanner(System.in);
     
      public void IdentificarUsuario(){   
     System.out.println("Digite seu nome  Professor");
      nome= sc.nextLine();
      System.out.println("Ola Professor " + nome + " Seja bem vindo ");
  
      System.out.println("Digite seu email Professor");
     email= sc.nextLine();

     System.out.println("Digite sua idade Professor");
     idade = sc.nextInt();
  }

    public String getNome(){
        return nome;
       }
    
       
       public void setNome(String nome){
        this.nome = nome ;
       }
    
       public int getIdade(){
        return idade;
       }
    
       
       public void setIdade(int idade){
        this.idade = idade ;
       }
    
       public String getEmail(){
        return email;
       }
    
       
       public void setEmail(String email){
        this.email = email ;
       }

       public String getTipoUsuario(){
        return tipoUsuario;
       }
    
       
       public void setTipoUsuario(String tipoUsuario){
        this.tipoUsuario = tipoUsuario;
       }
}
