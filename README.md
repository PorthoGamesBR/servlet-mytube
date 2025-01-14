# Servidor de Vídeos Pessoal

Um "seu"tube, que permite que você armazene os vídeos no HD do seu computador e os acesse de qualquer outro aparelho que tenha um navegador

Feito em live na [Twitch](https://www.twitch.tv/porthogamesbr)
## 🚀 Começando

Essas instruções permitirão que você obtenha uma cópia do projeto em operação na sua máquina local para fins de desenvolvimento e teste.

Consulte **[Implantação](#-implanta%C3%A7%C3%A3o)** para saber como implantar o projeto.

### 📋 Pré-requisitos

Você vai precisar:

* Java Development Kit
* Maven
* Servidor Web ou de Aplicação Java-enabled. (recomendado Tomcat 9)

_Sempre recomendo, ao instalar servidores, usar máquinas virtuais ou containers para não poluir sua máquina._

### 🔧 Instalação

Uma série de exemplos passo-a-passo que informam o que você deve executar para ter um ambiente de desenvolvimento em execução.

Instalação do Maven

```
Dar exemplos
```

Configurando a pasta base dos arquivos

```
// Em mytube\src\main\resources, procure o arquivo app.properties 

// Altere a propriedade files.location para o path aonde os vídeos e thumbnails vão ficar
```

Criando o arquivo WAR

```
    // Uma vez que tenha o Maven instalado e configurado o projeto, vá para a pasta mytube e execute o comando

    mvn clean package

    // Isso vai gerar uma pasta target, e dentro dessa pasta um arquivo com a extensão .war
```

Termine com um exemplo de como obter dados do sistema ou como usá-los para uma pequena demonstração.

## ⚙️ Executando os testes

Explicar como executar os testes automatizados para este sistema.

### 🔩 Analise os testes de ponta a ponta

Explique que eles verificam esses testes e porquê.

```
Dar exemplos
```

### ⌨️ E testes de estilo de codificação

Explique que eles verificam esses testes e porquê.

```
Dar exemplos
```

## 📦 Implantação


Colocando a pagina pra rodar

```
    // Depois de gerar o war, deve colocá-lo no seu servidor java compatible.
    // Como esse projeto foi feito com Apache Tomcat, coloque o .war no diretorio tomcat/webapps e a pasta resources tambem

```

## 🛠️ Construído com

Mencione as ferramentas que você usou para criar seu projeto

* [Java](https://docs.oracle.com/en/java/) - Linguagem Usada
* [Maven](https://maven.apache.org/index.html) - Gerenciador de Projeto Java
* [Tomcat](https://tomcat.apache.org/) - Servidor Web e de Aplicações Usado

## 🖇️ Colaborando

Por favor, leia o [COLABORACAO.md](https://gist.github.com/usuario/linkParaInfoSobreContribuicoes) para obter detalhes sobre o nosso código de conduta e o processo para nos enviar pedidos de solicitação.

## 📌 Versão

Nós usamos [Git](https://git-scm.com/) para controle de versão. Para as versões disponíveis, observe as [tags neste repositório](https://github.com/suas/tags/do/projeto). 

## ✒️ Autores

Mencione todos aqueles que ajudaram a levantar o projeto desde o seu início

* **Portho** - *Trabalho Inicial* - [Portho](https://github.com/PorthoGamesBR)
* **Todos** que me acompanham na live diariamente durante o desenvolvimento

Você também pode ver a lista de todos os [colaboradores](https://github.com/usuario/projeto/colaboradores) que participaram deste projeto.

## 📄 Licença

Este projeto está sob a licença (sua licença) - veja o arquivo [LICENSE.md](https://github.com/usuario/projeto/licenca) para detalhes.

## 🎁 Expressões de gratidão

* Conte a outras pessoas sobre este projeto 📢;
* Convide alguém da equipe para uma cerveja 🍺;
* Um agradecimento publicamente 🫂;
* etc.


---
⌨️ com ❤️ por [Armstrong Lohãns](https://gist.github.com/lohhans) 😊