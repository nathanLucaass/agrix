# Projeto Agrix - Controle de Fazendas
Descrição do Projeto:
O Projeto Agrix - Controle de Fazendas é uma API desenvolvida utilizando o ecossistema Spring, com o objetivo de oferecer um sistema eficiente para gerenciar informações relacionadas a fazendas, plantações e fertilizantes. A aplicação permite o cadastro de fazendas, o registro de plantações associadas a essas fazendas e a gestão de fertilizantes.

## Tecnologias Utilizadas:
- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Maven
- Docker
## Funcionalidades Implementadas:
- Cadastro de Fazendas:

Rota POST /farms para criar e salvar dados de uma fazenda.
Retorno de status HTTP 201 (CREATED) em caso de sucesso.
- Listagem de Fazendas:

Rota GET /farms para retornar todas as fazendas cadastradas.
Detalhes de uma Fazenda:

Rota GET /farms/{id} para retornar as informações de uma fazenda pelo ID.
Tratamento de erro para fazenda não encontrada (HTTP 404).
Cadastro de Plantações:

Rota POST /farms/{farmId}/crops para criar plantações associadas a uma fazenda.
Retorno de status HTTP 201 (CREATED) em caso de sucesso.
Tratamento de erro para fazenda não encontrada (HTTP 404).
Listagem de Plantações de uma Fazenda:

Rota GET /farms/{farmId}/crops para listar as plantações de uma fazenda.
Tratamento de erro para fazenda não encontrada (HTTP 404).
Listagem de Todas as Plantações:

Rota GET /crops para listar todas as plantações cadastradas.
Detalhes de uma Plantação:

Rota GET /crops/{id} para retornar informações de uma plantação pelo ID.
Tratamento de erro para plantação não encontrada (HTTP 404).
## Docker:

Utilização de um Dockerfile multi-estágio para criar uma imagem Docker eficiente e fácil de implantar.

## Contato:
- LinkedIn: https://www.linkedin.com/in/nathanlucaass/
- Email: nathanlucaass@outlook.com
  
Este projeto demonstra a aplicação prática de conceitos como injeção de dependência, persistência de dados com Spring Data JPA, tratamento de erros personalizado e a utilização do Docker para facilitar o processo de implantação. Fique à vontade para explorar o código-fonte e adaptar conforme suas necessidades! 🌱🚀
