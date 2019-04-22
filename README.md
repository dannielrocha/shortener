# shortener
API REST Encurtador de URLs para o processo seletivo do Uol PagSeguro

# Pré-Requisitos
- JDK 1.8
- SGBD MySQL 8.0
- IDE Eclipse Jee Photon
 
# Guia de Configuração
Criar as seguintes variáveis de ambiente para o Banco de Dados:
- SHORTENER_DB_USER
- SHORTENER_DB_PASSWORD

# Guia de Utilização

Para utilizar a API, utilize a seguinte URL:
http://localhost:8080/url/www.uol.com.br

Será gerado um JSON com a URL encurtada, para utilizá-la faça da seguinte forma:
http://localhost:8080/url/shrt.io/URLencurtada
