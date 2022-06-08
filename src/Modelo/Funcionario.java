package Modelo;

public class Funcionario extends Pessoa {

    private String setor;
    private String funcao;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                " nome: " + getNome()  +
                " / idade: " + getIdade() +
                " / genero: " + getGenero() +
                " / setor: " + setor +
                " / funcao: " + funcao +
                '}';
    }
}
