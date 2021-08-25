# PracticeTest

�	Para constru��o do projeto foi utilizado o framework Spring Boot
�	O banco de dados utilizado foi o mySQL, ao executar o sistema n�o esque�a de verificar a senha do banco, deixei o padr�o root
�	Todas as depend�ncias do projeto est�o no arquivo pom.xml
�	Para fazer o clone do projeto � preciso abrir o git e usar o comando abaixo:
git clone https://github.com/alessandrodjr/PracticeTest.git
�	O projeto est� na branch develop
�	Depois disso � preciso fazer a importa��o dentro da IDE

O projeto tem 3 tabelas (Usu�rios, Filmes e Categorias)
Para acessar o crud � necess�rio autentificar�o exceto para os caminhos abaixo que podem ser acessados pelo postman:
http://localhost:8080/usuarios/logar/
http://localhost:8080/usuarios/cadastrar/
http://localhost:8080//filmes/total/  (Para acessar a quantidade de filmes que tem no catalogo como pedido, sem autentica��o)

Para logar � precisa passar os seguintes par�metros:
{
    "usuario" : "string",
    "senha" : "string"
}
Para criar um novo usu�rio � passar os seguintes par�metros:
{
    "nome": "string",
    "usuario" : "string",
    "senha" : "string"
}

Depois de logado pode acessar o crud da tabela usu�rios, filmes e categorias
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
  "titulo": "Todo Mundo em P�nico",
  "urlImg": "www.imagemdefilme.com.jpg"
}
A API tamb�m pode ser acessada pelo Swagger, mas antes precisa cadastrar um usu�rio no postman.
http://localhost:8080/swagger-ui/
A API j� esta configurada para fazer o redirecionamento para o link acima caso seja acessado localhost:8080.

