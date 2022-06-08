import Modelo.Aluno;
import Modelo.Funcionario;
import Modelo.Professor;

public class principal {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        Professor professor1 = new Professor();
        Funcionario funcionario1 = new Funcionario();

        aluno1.setNome("Gael Gondim Carvalho");
        aluno1.setIdade(2);
        aluno1.setGenero("M");
        aluno1.setCurso("Infantil 1");
        aluno1.setMatricula("11111-11");

        professor1.setNome("Helena Souza");
        professor1.setIdade(27);
        professor1.setGenero("F");
        professor1.setEspecialidade("Pedagoga/Educação infantil");
        professor1.setSalario(2000);

        funcionario1.setNome("Maria Filomena");
        funcionario1.setIdade(40);
        funcionario1.setGenero("F");
        funcionario1.setSetor("Cantina");
        funcionario1.setFuncao("Atendente");

        System.out.println(aluno1.toString());
        System.out.println(professor1.toString());
        System.out.println(funcionario1.toString());


    }
}
