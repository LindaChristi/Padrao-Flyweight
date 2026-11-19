package psdroesestruturais.flyweight;

public class Funcionario {

    private String nome;
    private Departamento departamento;

    public Funcionario(String nome, Departamento departamento) {
        this.nome = nome;
        this.departamento = departamento;
    }

    public String obterFuncionario() {
        return "Funcionario{" +
                "nome='" + this.nome + '\'' +
                ", departamento='" + departamento.getNome() + '\'' +
                ", sigla='" + departamento.getSigla() + '\'' +
                '}';
    }
}