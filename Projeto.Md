# Sumário do Projeto

Pagina de visualização dos arquivos no meu servidor web

# Partes do Projeto

- Servidor : Um servidor Apache Tomcat com os seguintes servlets, que serão feitos usando a API Servlet Javax:
    - Pagina principal (HTML)
    - Lista de videos que tem no servidor no momento (Microserviço, REST)
    - FTP para carregar os videos
- Conexão : As portas IP do meu proprio PC e rede serão usadas. Para pegar o IP global atual do PC podemos usar alguma API ou serviço
- Pagina : Pagina simples em HTML + CSS + JS
    - script.js faz o request para conseguir a lista de videos do servidor e montar a lista de videos lateral

# Como um servidor funciona

O navegador faz um request, o servidor envia o que o navegador pediu naquele endereço

# Design Base

![DesignBase](DesignBase.jpg)

# Comando para usar Maven

../apache-maven-3.9.9/bin/mvn.cmd