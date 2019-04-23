# shortener
API REST Encurtador de URLs para o processo seletivo do Uol PagSeguro

# Pré-Requisitos
- JDK 1.8
- SGBD MySQL 8.0
- IDE Eclipse Jee Photon
- Postman
 
# Guia de Configuração
Criar as seguintes variáveis de ambiente para o Banco de Dados:
- SHORTENER_DB_USER
- SHORTENER_DB_PASSWORD

# Guia de Utilização

É necessário gerar um Access Token para autenticação OAuth2, para tanto, utilize a seguinte URL no Postman:
http://localhost:8080/oauth/token -> Requisição POST, Basic Auth, Dados de autenticação estão no arquivo application.properties
Também é necessário utilizar as seguintes keys no Body da requisição: grant_type:password, username e password que estão contidos na classe SecurityConfig.

Utilize então o token gerado como Bearer token para acessar a API.

Para utilizar a API, utilize a seguinte URL:
http://localhost:8080/url/www.uol.com.br

Será gerado um JSON com a URL encurtada, para utilizá-la faça da seguinte forma:
http://localhost:8080/url/URLencurtada

URL Heroku: https://lucas-nagata-url-shortener.herokuapp.com/
