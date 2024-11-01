# Banco DIO

Este é um projeto de banco desenvolvido em Java, utilizando conceitos de Orientação a Objetos. O objetivo do projeto é simular um sistema bancário básico, permitindo a criação de clientes, contas correntes e contas poupança.

## Funcionalidades

- **Cadastro de Clientes**: Permite registrar novos clientes com informações como nome, CPF e endereço.
- **Criação de Contas**: Os clientes podem criar contas correntes e contas poupança.
- **Operações Bancárias**: Realização de operações como depósito, saque e transferência entre contas.
- **Listagem de Contas e Clientes**: Possibilidade de listar todos os clientes e contas cadastrados.
## Imagem
![image](https://github.com/user-attachments/assets/a81a94c7-60ea-42ab-b9f4-140a31245080)

## Estrutura do Projeto

O projeto é organizado nas seguintes classes principais:

- `Cliente`: Representa um cliente do banco.
- `Endereco`: Representa o endereço de um cliente ou de uma agência
- `Banco`: Classe singleton que gerencia a lista de clientes e contas.
- `Conta`: Classe abstrata que define métodos comuns para contas bancárias.
- `ContaCorrente`: Extensão da classe `Conta`, que adiciona funcionalidades específicas para contas correntes.
- `ContaPoupanca`: Extensão da classe `Conta`, que adiciona funcionalidades específicas para contas poupança.
- `Agencia`: Representa uma agência do banco.

## Requisitos

- Java 21

## Instalação

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/HenriqueCaldas/desafio-banco-dio.git


