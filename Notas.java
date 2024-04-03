import java.util.Scanner;

public class Notas{
static String nome;
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 'Aluno' se você for um aluno e 'Professor' se você for um professor");
        String usuario = sc.nextLine();
     

            if(usuario.equalsIgnoreCase("Professor")) {
                System.out.println("Digite o seu nome"); 
                 nome = sc.nextLine();
                System.out.println("Ola Professor " + nome + " Seja bem vindo ");

                System.out.println(" Digite o nome do aluno para adicionar uma nota");
                String aluno = sc.nextLine();

                System.out.println(" Insira a nota da A1 ");
                int nota1 = sc.nextInt(); 
                System.out.println(" Insira a nota da A2 ");
                int nota2 = sc.nextInt(); 
                System.out.println(" Insira a nota da A3 ");
                int nota3 = sc.nextInt(); 

            
             int soma = nota1 + nota2 + nota3;
             System.out.println(soma);
           

            }else if(usuario.equalsIgnoreCase("Aluno")) {
                System.out.println("Ola Aluno " + nome + ".Seja bem vindo ");
            } else {
                System.out.println("Erro:opção inválida");
            }
            sc.close();
    }
}
