package psdroesestruturais.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private List<Funcionario> funcionarios = new ArrayList<>();

    public void contratar(String nomeFuncionario, String nomeDepartamento, String sigla) {
        Departamento departamento = DepartamentoFactory.getDepartamento(nomeDepartamento, sigla);
        Funcionario funcionario = new Funcionario(nomeFuncionario, departamento);
        funcionarios.add(funcionario);
    }

    public List<String> obterFuncionarios() {
        List<String> saida = new ArrayList<String>();
        for (Funcionario funcionario : this.funcionarios) {
            saida.add(funcionario.obterFuncionario());
        }
        return saida;
    }

}