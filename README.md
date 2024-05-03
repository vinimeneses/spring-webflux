# Projeto CRUD de Empregados - Programação Reativa com Spring Boot e MongoDB

Este projeto é uma aplicação CRUD (Create, Read, Update, Delete) de empregados, desenvolvida com o objetivo de aprender e aplicar os conceitos de programação reativa. A aplicação foi construída utilizando Java, Spring Boot, MongoDB e Maven.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação utilizada para desenvolver a aplicação.
- **Spring Boot**: Framework utilizado para facilitar o desenvolvimento de aplicações Spring.
- **MongoDB**: Banco de dados NoSQL utilizado para armazenar os dados dos empregados.
- **Maven**: Ferramenta de gerenciamento de projetos e compilação.

## Funcionalidades

A aplicação permite realizar as seguintes operações:

- **Criar Empregado**: Permite adicionar um novo empregado ao sistema.
- **Ler Empregado**: Permite recuperar os detalhes de um empregado específico pelo ID.
- **Atualizar Empregado**: Permite atualizar os detalhes de um empregado existente.
- **Deletar Empregado**: Permite remover um empregado do sistema pelo ID.
- **Listar Empregados**: Permite listar todos os empregados presentes no sistema.

## Estrutura do Projeto

O projeto segue a estrutura padrão de um projeto Spring Boot e está organizado da seguinte forma:

- `src/main/java/net/javaguides/springboot/controller`: Contém a classe `EmployeeController` que define os endpoints da API.
- `src/main/java/net/javaguides/springboot/service`: Contém a interface `EmployeeService` que define os métodos de serviço e a classe `EmployeeServiceImpl` que implementa esses métodos.
- `src/main/java/net/javaguides/springboot/mapper`: Contém a classe `EmployeeMapper` que é responsável por converter os objetos `Employee` para `EmployeeDto` e vice-versa.
- `src/main/java/net/javaguides/springboot/dto`: Contém a classe `EmployeeDto` que é o objeto de transferência de dados para o empregado.
- `src/main/java/net/javaguides/springboot/entity`: Contém a classe `Employee` que é a entidade de empregado.

## Como Executar

Para executar este projeto, você precisa ter o Java, Maven e MongoDB instalados em sua máquina. Depois de clonar o projeto, você deve configurar o banco de dados e em seguida, executar o projeto usando o comando `mvn spring-boot:run` no diretório raiz do projeto.

## Conclusão

Este projeto foi uma ótima oportunidade para aprender e aplicar os conceitos de programação reativa usando Spring Boot e MongoDB. A programação reativa é um paradigma de programação que lida com fluxos de dados assíncronos e a propagação de mudanças, o que é muito útil para criar aplicações modernas e eficientes.
