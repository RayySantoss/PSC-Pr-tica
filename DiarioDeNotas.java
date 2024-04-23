import java.util.Scanner;

public class DiarioDeNotas{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Usuario usuario = new Usuario();
       

        System.out.println("Digite 'Aluno' se você for um aluno e 'Professor' se você for um professor");
        String usuario1  = sc.nextLine();
        
        
            if(usuario1.equalsIgnoreCase("Professor")) {
                Professor professor = new Professor();
                professor.IdentificarProfessor();
                usuario.setTipoUsuario("Professor");
                System.out.println("Verificando o tipo de usuário " + usuario.getTipoUsuario());
            
            }else if(usuario1.equalsIgnoreCase("Aluno")) {
                Aluno aluno = new Aluno();
                aluno.IdentificarAluno();
               
            } else {
                System.out.println("Erro:opção inválida");
            }
            sc.close();
    }
}