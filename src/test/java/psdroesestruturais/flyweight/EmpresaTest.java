package psdroesestruturais.flyweight;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

    @Test
    void deveRetornarFuncionarios() {
        Empresa empresa = new Empresa();
        empresa.contratar("Joao", "Administrativo", "ADM");
        empresa.contratar("Maria", "Administrativo", "ADM");
        empresa.contratar("Ana", "Administrativo", "ADM");
        empresa.contratar("Carlos", "Financeiro", "FIN");

        List<String> saida = Arrays.asList(
                "Funcionario{nome='Joao', departamento='Administrativo', sigla='ADM'}",
                "Funcionario{nome='Maria', departamento='Administrativo', sigla='ADM'}",
                "Funcionario{nome='Ana', departamento='Administrativo', sigla='ADM'}",
                "Funcionario{nome='Carlos', departamento='Financeiro', sigla='FIN'}");

        assertEquals(saida, empresa.obterFuncionarios());
    }

    @Test
    void deveRetornarTotalDepartamentos() {
        Empresa empresa = new Empresa();
        empresa.contratar("Joao", "Administrativo", "ADM");
        empresa.contratar("Maria", "Administrativo", "ADM");
        empresa.contratar("Ana", "Administrativo", "ADM");
        empresa.contratar("Carlos", "Financeiro", "FIN");

        assertEquals(2, DepartamentoFactory.getTotalDepartamentos());
    }

}