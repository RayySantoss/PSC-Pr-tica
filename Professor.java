import java.util.Scanner;
public class Professor{
    

    String nome;
    String email;
    int idade;
    
    Scanner sc = new Scanner(System.in);

public void IdentificarProfessor(){
    System.out.println("Digite seu nome  Professor");
    nome= sc.nextLine();
    System.out.println("Ola Professor " + nome + " Seja bem vindo ");
    
    System.out.println("Digite seu email Professor");
    email= sc.nextLine();

    System.out.println("Digite sua idade Professor");
    idade = sc.nextInt();
}
}