# Springboot
================
### 1. Introdução
O Spring Boot é um framework popular para construir aplicações web em Java. Ele fornece muitas funcionalidades prontas para uso, como auto-configuração, servidores embarcados e recursos prontos para produção.
### 2. Recursos
#### 2.1 Auto-Configuração
O Spring Boot pode configurar automaticamente sua aplicação com base nas dependências que você adicionou ao seu projeto. Isso significa que você não precisa escrever muito código de configuração.
#### 2.2 Servidores Embarcados
O Spring Boot permite que você crie servidores embarcados para executar sua aplicação.
#### 2.3 Recursos Prontos para Produção
O Spring Boot fornece muitos recursos prontos para uso, como segurança, internacionalização e suporte a banco de dados.
### 3. Exemplo de Uso

## MVC
================
### 1. Introdução
O MVC (Model-View-Controller) é um padrão de projeto que separa a aplicação em três camadas: modelo, visão e controle.
### 2. Recursos
#### 2.1 Modelo
O modelo é responsável por armazenar e manipular os dados da aplicação.
#### 2.2 Visão
A visão é responsável por renderizar a interface do usuário.
#### 2.3 Controle
O controle é responsável por receber requisições, chamar o modelo e visão e retornar a resposta ao usuário.
### 3. Exemplo de Uso
exemplo codigo em java:

~~~java
// Modelo
public class Usuario {
    private Long id;
    private String nome;
    // getters e setters
}

// Visão
public class UsuarioController {
    @GetMapping("/usuarios")
    public String listarUsuarios(Model model) {
        // lógica de negócios
        return "usuarios";
    }
}

// Controlador
@RestController
@RequestMapping("/api/usuarios")
public class UsuarioRestController {
    @GetMapping
    public List<Usuario> listarUsuarios() {
        // lógica de negócios
        return usuarios;
    }
}
~~~

## Instalação das Ferramentas
==========================
### Checklist:
#### Navegador
- [Google Chrome](https://www.google.com/intl/pt-BR/chrome/) / [Microsoft Edge](https://www.microsoft.com/pt-br/edge/download?form=MA13FJ)
### Conta no Github
- Criar conta no Github
### Git Bash
- Baixar [Git Bash](https://git-scm.com/downloads)
- Verificar versão: `git --version`
### Verificar Protocolos
- [ThunderClient](https://www.thunderclient.com/)
### Java JDK (versão LTS 17)
- Baixar [Java JDK](https://www.oracle.com/br/java/technologies/downloads/) `baixe a versão LTS 17(JDK 17)`
- Configurar variáveis de ambiente do sistema:
    - Painel de Controle -> Variáveis de Ambiente
    - JAVA_HOME: C:\Program Files\Java\jdk-17.0.2
    - Path: %JAVA_HOME%\bin
### IDE / Editor de Código
- [Visual Studio Code (VSCode)](https://code.visualstudio.com/download)
- Extensões para o VSCode:
    - [Extension Pack for Java e Spring Boot Extension Pack:](https://code.visualstudio.com/docs/java/extensions)
- Alternativas:
    - [STS - Spring Tool Suit](https://spring.io/tools)
    - [Eclipse IDE](https://www.eclipse.org/downloads/)
### MySQL Community Server 8
- Baixar [MySQL Community Server 8](https://dev.mysql.com/downloads/mysql/)
- Baixar [Heidisql](https://www.heidisql.com/download.php)
### Apache Maven (versão >= 3.8.6)
- Baixar Apache Maven
    - Configurar variáveis de ambiente do sistema:
    - Painel de Controle -> Variáveis de Ambiente
    - MAVEN_HOME: `C:/Program Files/Maven/apache-maven-3.8.5`
    - Path: `%MAVEN_HOME%\bin`
### Gerador do projeto Spring Boot
- Maven Project
- Spring Boot >= 2.7.2 (Que não seja SNAPSHOT)
- Packaging Jar
- Java 17
#### Dependências:
- Parametrizadas no link abaixo: https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.7.2&packaging=jar&jvmVersion=17&groupId=com.lucasangelo&artifactId=todosimple&name=todosimple&description=Spring%20Boot%20API%20for%20To%20Do%20App&packageName=com.lucasangelo.todosimple&dependencies=devtools,web,data-jpa,h2,mysql,validation

- https://github.com/ICEI-PUC-Minas-PPLES-TI/PLF-ES-2022-2-MON-CursoAPIJava/commit/ab9a862a6c6fa0668bd2a6cbead71161d59a18b0?diff=unified&w=0#diff-9c5fb3d1b7e3b0f54bc5c4182965c4fe1f9023d449017cece3005d3f90e8e4d8 
`(ir para o pom.xml + Ctrl C + Ctrl V, corrigindo o pom.xml do spring.io)`

