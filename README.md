# PracticeTest - Loja

• Para construção do projeto foi utilizado o framework Spring Boot

• O banco de dados utilizado foi o mySQL, ao executar o sistema não esqueça de verificar a senha do banco.

• Todas as dependências do projeto estão no arquivo pom.xml

• Para fazer o clone do projeto é preciso abrir o git e usar o comando abaixo:

git clone https://github.com/alessandrodjr/PracticeTest.git

• O projeto está na branch tgid

• Depois disso é preciso fazer a importação dentro da IDE

O projeto tem 4 tabelas (Usuários, Produtos, Venda e ItemVenda)

Para criar um novo usuário é passar os seguintes parâmetros: { "nome": "string", "email" : "email", "cpf" : "string" }

Rota: http://localhost:8080/usuarios

Para Criar um novo produto é preciso passar os seguintes parâmetros: "nome": "Lapis", "preco": 2.30, "quantidade": 5, "usuario": { "id": 2 }

Rota: http://localhost:8080/produtos

Para cadastrar uma nova venda é preciso passar os seguintes parâmetros: {"nomeCliente": "String"}

Rota: http://localhost:8080/vendas

Para cadastrar um novo item para venda é preciso passar os seguintes parâmetros: { "quantidade": 1, "produto": { "id": 2 }, "venda": { "id": 2 }}

Rota: http://localhost:8080/itensVenda


A API também pode ser acessada pelo Swagger. http://localhost:8080/swagger-ui/

A API já esta configurada para fazer o redirecionamento para o link acima caso seja acessado localhost:8080.
