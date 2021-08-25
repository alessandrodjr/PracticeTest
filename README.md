# PracticeTest

•	Para construção do projeto foi utilizado o framework Spring Boot
•	O banco de dados utilizado foi o mySQL, ao executar o sistema não esqueça de verificar a senha do banco, deixei o padrão root
•	Todas as dependências do projeto estão no arquivo pom.xml
•	Para fazer o clone do projeto é preciso abrir o git e usar o comando abaixo:
git clone https://github.com/alessandrodjr/PracticeTest.git
•	O projeto está na branch develop
•	Depois disso é preciso fazer a importação dentro da IDE

O projeto tem 3 tabelas (Usuários, Filmes e Categorias)
Para acessar o crud é necessário autentificarão exceto para os caminhos abaixo que podem ser acessados pelo postman:
http://localhost:8080/usuarios/logar/
http://localhost:8080/usuarios/cadastrar/
http://localhost:8080//filmes/total/  (Para acessar a quantidade de filmes que tem no catalogo como pedido, sem autenticação)

Para logar é precisa passar os seguintes parâmetros:
{
    "usuario" : "string",
    "senha" : "string"
}
Para criar um novo usuário é passar os seguintes parâmetros:
{
    "nome": "string",
    "usuario" : "string",
    "senha" : "string"
}

Depois de logado pode acessar o crud da tabela usuários, filmes e categorias
Para cadastrar uma nova categoria:
{
    "genero" : "Terro"
}

Para cadastrar um novo filme:
{
  "categoria": {
     "id": 2
  },
  "classificacao": "16",
  "dataLancamento": "2005-08-24",
  "titulo": "Todo Mundo em Pânico",
  "urlImg": "www.imagemdefilme.com.jpg"
}
A API também pode ser acessada pelo Swagger, mas antes precisa cadastrar um usuário no postman.
http://localhost:8080/swagger-ui/
A API já esta configurada para fazer o redirecionamento para o link acima caso seja acessado localhost:8080.

