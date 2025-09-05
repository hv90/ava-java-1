# Projeto Java: Classe Computador [![DOI](https://zenodo.org/badge/DOI/10.5281/zenodo.17059616.svg)](https://doi.org/10.5281/zenodo.17059616)

Este projeto é uma aplicação em Java que implementa a classe `Computador`, demonstrando conceitos de **POO (Programação Orientada a Objetos)**, incluindo **construtores**, **getters**, **setters** e **testes unitários com JUnit 5**.

O objetivo do projeto é servir como material de estudo e exemplo prático de como organizar classes, manipular atributos e validar comportamento via testes automatizados.

## Estrutura do Projeto

- `src/main/java` - Código-fonte da classe `Computador`.
- `src/test/java` - Testes unitários da classe `Computador` utilizando JUnit 5.
- `pom.xml` - Configuração Maven com dependências e plugin de compilação/testes.

## Funcionalidades

1. **Classe `Computador`**:
   - Atributos: `marca`, `modelo`, `processador`, `memoriaRAM`, `armazenamento`.
   - Construtor padrão e construtor parametrizado.
   - Getters e Setters para todos os atributos.

2. **Testes com JUnit 5**:
   - Verificação da inicialização pelo construtor padrão.
   - Verificação da inicialização pelo construtor parametrizado.
   - Validação do funcionamento dos setters.
   - Mensagens detalhadas no console indicando valores esperados e valores retornados.

## Como Rodar

Certifique-se de ter **Java JDK 11+** e **Maven** instalados.  
No terminal, execute:

```bash
mvn clean test
