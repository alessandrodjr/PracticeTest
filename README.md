# PracticeTest - Loja

� Para constru��o do projeto foi utilizado o framework Spring Boot

� O banco de dados utilizado foi o mySQL, ao executar o sistema n�o esque�a de verificar a senha do banco.

� Todas as depend�ncias do projeto est�o no arquivo pom.xml

� Para fazer o clone do projeto � preciso abrir o git e usar o comando abaixo:

git clone https://github.com/alessandrodjr/PracticeTest.git

� O projeto est� na branch tgid

� Depois disso � preciso fazer a importa��o dentro da IDE

O projeto tem 4 tabelas (Usu�rios, Produtos, Venda e ItemVenda)

Para criar um novo usu�rio � passar os seguintes par�metros: { "nome": "string", "email" : "email", "cpf" : "string" }

Rota: http://localhost:8080/usuarios

Para Criar um novo produto � preciso passar os seguintes par�metros: "nome": "Lapis", "preco": 2.30, "quantidade": 5, "usuario": { "id": 2 }

Rota: http://localhost:8080/produtos

Para cadastrar uma nova venda pe preciso passar os seguintes par�metros: {"nomeCliente": "String"}

Rota: http://localhost:8080/vendas

Para cadastrar um novo item para venda � preciso passar os seguintes par�metros: { "quantidade": 1, "produto": { "id": 2 }, "venda": { "id": 2 }}

Rota: http://localhost:8080/itensVenda


A API tamb�m pode ser acessada pelo Swagger, mas antes precisa cadastrar um usu�rio no postman. http://localhost:8080/swagger-ui/

A API j� esta configurada para fazer o redirecionamento para o link acima caso seja acessado localhost:8080.