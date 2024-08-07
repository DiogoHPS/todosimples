# 🍃 Spring
==========================================================================


adicionar (lombok,Java linguage, Java security)
O<b> Spring é um framework Java criado com o objetivo de facilitar o desenvolvimento de aplicações, explorando, para isso, os conceitos de Inversão de Controle e Injeção de Dependências.</b> Dessa forma, ao adotá-lo, temos à nossa disposição uma tecnologia que nos fornece não apenas recursos necessários à grande parte das aplicações, como módulos para persistência de dados, integração, segurança, testes, desenvolvimento web, como também um conceito a seguir que nos permite criar soluções menos acopladas, mais coesas e, consequentemente, mais fáceis de compreender e manter.

### Por que o Spring foi criado?

O <b>Spring foi criado por causa das dificuldades que os programadores enfrentavam ao criar determinado tipo de aplicação,</b> mais precisamente, aplicações corporativas. Na época, a plataforma Java voltada para isso, de nome J2EE, ainda era jovem, com ótimas ideias para a construção de aplicações leves, distribuídas, com um amplo leque de opções/ferramentas, mas com algumas limitações. Essas limitações levavam a uma programação dependente de muitas interfaces e com muitas configurações. Ao final, era comum ter uma solução pesada e que trazia consigo muito mais do que o que realmente era necessário.

E para completar, precisávamos utilizar servidores de aplicação pesados, o que tornava a programação e a depuração das aplicações ainda mais lento.

### Características do Spring Framework
Seguindo um caminho diferente, em pouco tempo o Spring conquistou seu espaço na comunidade. Mas, que caminho diferente foi esse?

1. A primeira diferença é que ele <b>não precisa de um servidor de aplicação para funcionar</b>
Fazendo uso apenas da JVM, o Spring traz para o programador recursos que antes só estavam disponíveis para soluções corporativas;
2. Com Spring também passamos a <b>utilizar apenas aquilo que é necessário para o projeto.</b> Como mencionado agora há pouco, a plataforma J2EE e os EJBs nos levavam a implementar comportamentos que não eram necessários. Esse diferencial do Spring torna a arquitetura mais leve, fácil de compreender, manter e evoluir;
3. Outro diferencial é que ele é <b>baseado na inversão de controle e injeção de dependência,</b> fornecendo para isso um container, que representa o núcleo do framework e que é responsável por criar e gerenciar os componentes da aplicação, os quais são comumente chamados de beans.
# 🗂️ MVC
==========================================================================
## 1. Introdução
O MVC (Model-View-Controller) é um padrão de projeto que separa a aplicação em três camadas: modelo, visão e controle.
## 2. Recursos
### 2.1 Modelo
O modelo é responsável por armazenar e manipular os dados da aplicação.
### 2.2 Visão
A visão é responsável por renderizar a interface do usuário.
### 2.3 Controle
O controle é responsável por receber requisições, chamar o modelo e visão e retornar a resposta ao usuário.
## 3. Exemplo de Uso
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

# ➡️ Instalação das Ferramentas
==========================================================================
### ✅ Checklist:
#### Navegador
- [Google Chrome](https://www.google.com/intl/pt-BR/chrome/) / [Microsoft Edge](https://www.microsoft.com/pt-br/edge/download?form=MA13FJ)
### 🖥️ Conta no Github
- [Criar conta no Github](https://docs.github.com/en/get-started/start-your-journey/creating-an-account-on-github)
### 🖥️ Git Bash
- Baixar [Git Bash](https://git-scm.com/downloads)
- Verificar versão: `git --version`
### 📝 Verificar Protocolos
- [ThunderClient](https://www.thunderclient.com/)
### ♨️ Java JDK (versão LTS 17)
- Baixar [Java JDK](https://www.oracle.com/br/java/technologies/downloads/) `baixe a versão LTS 17(JDK 17)`
- Configurar variáveis de ambiente do sistema:
    - Painel de Controle -> Variáveis de Ambiente
    - JAVA_HOME: C:\Program Files\Java\jdk-17.0.2
    - Path: %JAVA_HOME%\bin
### 🌐 IDE / Editor de Código
- [Visual Studio Code (VSCode)](https://code.visualstudio.com/download)
- Extensões para o VSCode:
    - [Extension Pack for Java e Spring Boot Extension Pack:](https://code.visualstudio.com/docs/java/extensions)
- Alternativas:
    - [STS - Spring Tool Suit](https://spring.io/tools)
    - [Eclipse IDE](https://www.eclipse.org/downloads/)
### 🗃️ MySQL Community Server 8
- Baixar [MySQL Community Server 8](https://dev.mysql.com/downloads/mysql/)
- Baixar [Heidisql](https://www.heidisql.com/download.php)
### Ⓜ️ Apache Maven (versão >= 3.8.6)
- Baixar Apache Maven
    - Configurar variáveis de ambiente do sistema:
    - Painel de Controle -> Variáveis de Ambiente
    - MAVEN_HOME: `C:/Program Files/Maven/apache-maven-3.8.5`
    - Path: `%MAVEN_HOME%\bin`
### 📥 Gerador do projeto Spring Boot
- Maven Project
- Spring Boot >= 2.7.2 (Que não seja SNAPSHOT)
- Packaging Jar
- Java 17
#### 🔄 Dependências:
- Parametrizadas no link abaixo: https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.7.2&packaging=jar&jvmVersion=17&groupId=com.lucasangelo&artifactId=todosimple&name=todosimple&description=Spring%20Boot%20API%20for%20To%20Do%20App&packageName=com.lucasangelo.todosimple&dependencies=devtools,web,data-jpa,h2,mysql,validation

- https://github.com/ICEI-PUC-Minas-PPLES-TI/PLF-ES-2022-2-MON-CursoAPIJava/commit/ab9a862a6c6fa0668bd2a6cbead71161d59a18b0?diff=unified&w=0#diff-9c5fb3d1b7e3b0f54bc5c4182965c4fe1f9023d449017cece3005d3f90e8e4d8 
`(ir para o pom.xml + Ctrl C + Ctrl V, corrigindo o pom.xml do spring.io)`

# ⤵️ Intruções

Essas instruções vão te levar a uma cópia do projeto rodando em sua máquina local para propósitos de testes, desenvolvimento e aprendizagem.

Pré-requisitos:

* Ter instalado todas as ferramentas e dependências ensinadas no vídeo [Aula 02 - Instalação de todas as ferramentas e configuração de ambiente](https://www.youtube.com/watch?v=WHJvBUADvCE)
    * Java
    * Maven
    * MySQL
    * Docker (Docker-Compose)

* Passo 1: Clonar o repositório:
~~~properties
$ git clone https://github.com/ICEI-PUC-Minas-PPLES-TI/PLF-ES-2022-2-MON-CursoAPIJava.git
~~~

* Passo 2: Configurar e iniciar a API Spring Boot (backend)

    * Passo 2.1: Entrar no arquivo application.properties:
    ~~~properties
    $ vi PLF-ES-2022-2-MON-CursoAPIJava\src\main\resources\application-dev.properties
    ~~~

    * Passo 2.2: Configurar as credenciais de banco de dados de acordo com sua instalação do MySQL Server:
    ~~~properties
    # Database config
    spring.datasource.url=jdbc:mysql://localhost:3306/todosimple?createDatabaseIfNotExist=true
    spring.datasource.username=root
    spring.datasource.password=root
    ~~~

    * Passo 2.3: Voltar para a pasta raíz do projeto:
    ~~~properties
    $ cd PLF-ES-2022-2-MON-CursoAPIJava\
    ~~~

    * Passo 2.4: Iniciar a aplicação Spring Boot:
    ~~~properties
    $ mvn clean install
    ~~~

    * Passo 2.4.1: Iniciar a aplicação Spring Boot utilizando o Maven:
    ~~~properties
    $ mvn spring-boot:run
    ~~~
    (pode usar o run no vscode)

    ou

    * Passo 2.4.1: Iniciar a aplicação utilizando Docker-Compose:
    ~~~properties
    $ docker-compose up
    ~~~

    * API estará rodando em http://localhost:8080/
* Passo 3: Entrar na aplicação frontend após subir a API
    * Passo 3.1: Entrar na pasta raíz do projeto:
    ~~~properties
    $ cd PLF-ES-2022-2-MON-CursoAPIJava\
    ~~~
    * Passo 3.2: Abrir o arquivo index.html diretamente ou pela extensão Live Server do VsCode:
    ~~~properties
    $ cd PLF-ES-2022-2-MON-CursoAPIJava\view\login.html
    ~~~
    * Frontend estará rodando em http://127.0.0.1:5500/view/login.html caso iniciado com Live Server.


- ( ͡° ͜ʖ ͡°)