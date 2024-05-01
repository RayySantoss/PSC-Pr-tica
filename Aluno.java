import java.util.Scanner;
public class Aluno extends Usuario{
    
 
    int ra;
    String telefone;
    Scanner sc = new Scanner(System.in);
 @Override 
public void IdentificarUsuario(){
   super.IdentificarUsuario();
    
    System.out.println("Digite o ra do aluno");
    ra = sc.nextInt();
    sc.nextLine();

    System.out.println("Digite o telefone do aluno");
    telefone = sc.nextLine();

    sc.close();
    




}
}
 