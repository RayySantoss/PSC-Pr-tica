import java.util.Scanner;
public class Aluno{
    

    String nome;
    String email;
    int idade;
    int ra;
    String telefone;
    Scanner sc = new Scanner(System.in);

public void IdentificarAluno(){
    System.out.println("Digite o nome do aluno");
    nome= sc.nextLine();
    System.out.println("Ola Aluno " + nome + ".Seja bem vindo ");

    System.out.println("Digite o email do aluno");
    email= sc.nextLine();

    System.out.println("Digite a idade do aluno");
    idade = sc.nextInt();
 
    System.out.println("Digite o ra do aluno");
    ra = sc.nextInt();

    System.out.println("Digite o telefone do aluno");
    telefone = sc.nextLine();





}
}
 