import java.util.Scanner;

public class DiarioDeNotas{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 'Aluno' se você for um aluno e 'Professor' se você for um professor");
        String usuario = sc.nextLine();

            if(usuario.equalsIgnoreCase("Professor")) {
                System.out.println("Digite o seu nome"); 
                String nome = sc.nextLine();
                System.out.println("Ola Professor " + nome + " Seja bem vindo ");
            }else if(usuario.equalsIgnoreCase("Aluno")) {
                System.out.println("Digite o seu nome"); 
                String nome = sc.nextLine();
                System.out.println("Ola Aluno " + nome + ".Seja bem vindo ");
            } else {
                System.out.println("Erro:opção inválida");
            }
            sc.close();
    }
}