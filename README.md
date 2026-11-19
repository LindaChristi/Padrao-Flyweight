
# Padrão de Projeto Flyweight

Exercício desenvolvido para a disciplina de **Arquitetura e Projeto de Software**.

**Autora:** Linda Freitas.

## Descrição

Este projeto apresenta um exemplo de utilização do padrão de projeto estrutural Flyweight.

A aplicação simula o cadastro de funcionários de uma empresa, compartilhando objetos de departamentos entre funcionários que pertencem ao mesmo departamento.

Os departamentos utilizados no exemplo são:

- Administrativo;
- Financeiro.

A `DepartamentoFactory` verifica se o departamento já existe e reutiliza sua instância, evitando a criação de objetos duplicados.

## Execução

Para executar o projeto, basta abrir na IDE e executar os testes unitários da classe `EmpresaTest`.

## Testes

O projeto possui testes unitários utilizando JUnit, verificando:

- O retorno dos funcionários cadastrados;
- A quantidade de departamentos criados.

## Estrutura

- `Funcionario`: representa um funcionário.
- `Departamento`: representa o objeto compartilhado.
- `DepartamentoFactory`: controla a criação e reutilização dos departamentos.
- `Empresa`: gerencia os funcionários.
- `EmpresaTest`: contém os testes unitários.

## Referência

Disciplina: Arquitetura e Projeto de Software.

Autora: Linda Freitas.
