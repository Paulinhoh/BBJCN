## Programação Orientada a Objetos

POO é um paradigma de programação baseado no condeito de "objetos", que podem conter dados na forma de campos, chamados de atributos, e códigos, na forma de procedimentos, chamados de métodos.
O que precisamos entender, é que cada vez mais as linguagens de adequam ao cenário real, proporcionando assim que o programador desenvolva algoritmos mais próximos de fluxos comportamentais, logo ao nosso redor é representado como Objeto.

## Classes

Toda a estrutura de código na linguagem Java é distribuido em arquivos com extensão .java denominados de classes.
As classes existentes em nosso projeto serão compostas por:
Identificador, Cracteristicas e Comportamentos.

-   Classes (class): A estrutura e ou representação que dereciona a criação dos objetos de mesmo tipo.
-   Identicador (identity): Proposito existencial aos objetos que serão criados.
-   Caracteristicas (states): Também conhecido como atributos ou propriedades, é toda informação que representa o estado do objeto.
-   Comportamentos (behavior): Também conhecido como ações ou métodos, é toda parte comportamental que um objeto dispõe.
-   Instaciar (new): É o ato de criar um objeto a partir de uma estrutura definida em uma classe.

### Exemplo de Classes

```java
// Criando a classe Student
// Com todas as caracteristicas e comportamentos aplicados

public class Student {
    String name;
    int age;
    Color color;
    Sex sex;

    void eating(Food food) {
        // Código aqui
    }

    void drinking(Eat eat) {
        // Código aqui
    }

    void eating() {
        // Código aqui
    }
}
```

```java
// Criando objetos a partir da classe Student

public class School {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Paulo";
        student1.age = 23;
        student1.color = Color.FAIR;
        student1.sex = Sex.MALE;

        Student student2 = new Student();
        student2.name = "Ana Clara";
        student2.age = 5;
        student2.color = Color.FAIR;
        student2.sex = Sex.FEMALE;
    }
}
```

Seguindo algumas convenções, as nossas classes são classificadas como:

-   Classe de modelo (model): classes que representem estrutura de dominio da aplicação, exemplo: Cliente, Pedido, Nota Fiscal e etc...
-   Classe de serviço (service): classes que contém regras de negocio e validação de nosso sistema.
-   Classe de repositório (repository): classes que contém uma integração com banco de dados.
-   Classe utilitaaria (util): classes que contém recursos comuns à tosa nossa aplicação.
-   controller: classes quem possuem a finalidade de dispolibilizar os nossos recursos da aplicação para outras aplicações via padrão HTTP.
-   view: classes que possuem alguma interação com a interface gráfica acessada pelo usuário.

## Pacotes

### Nomeclatura

-   Comercial: com.powersoft
-   Governamental: gov.powersoft
-   Código aberto: org.powersoft

## Modificadores

Em java, utilizamos três palavras reservadas e um conceito default (sem nenhuma palavra reservada) para definir os quatro tipos de visibilidade de atributos, métodos e até mesmo classes no que se refere ao acesso por outras classes.

### Modificador publico

Como o proprio nome representa, quando nossa classe, método e atributo é definido como public, qualquer outra classe em qualquer outro pacote pode visualizar tais recursos.

### Modificador default

O modificador default esta fortemente associado a organização das classes por pacotes, algumas implementações não precisam estar disponiveis por todo o projeto, e este modificador de acesso restringe a visibilidade por pacotes.

### Modificador private

Depois de restaurar nosso estabelecimento (projeto), onde, temos as divisões (pacotes) espaços do cliente e atendimento, chegou a hora de ima reflexão sobre visibilidade ou modificadores de acesso
Conhecemos as ações disponiveis nas classes Cozinheiro, Almoxarife, Atendente e Cliente, mesmo com a organização da visibilidade por pacote, será se realmente estas classes precisam ser tão explicitas?

<b>OBS:</b> Também existe o modificador de acesso `protect`.

## Getters e Setters

O método `Getter` retorna o valor do atributo especificado.
O método `Setter` define outro novo valor para o atributo especificado.

## Enum

Enum é tipo especial de classe onde os objetos são previamente criados, imutáveis e disponiveis por toda aplicação.
Usamos Enum quando o nosso modelo de negócio contém objetos de mesmo contexto que ja existem de pré-estabelecida com a certeza de não haver tanta alteração de valores.

Exemplos:

-   Grau de escolaridade: Aalfabeto, Fundamental, Médio, Superior
-   Estado civil: Solteiro, Casado, Divorciado, Viúvo
-   Estados Brasileiros: São Paulo, Rio de Janeiro, Bahia, Parana

<b>OBS:</b> não confunda uma lista de constanstes com enum

Enquanto que uma constante é uma variavel de tipo com valor imutável, um enum é um conjunto de objetos ja pré-definidos na aplicação.
Como um enum é um conjunto de objetos, logo, estes objetos podem conter atributos e métodos. Veja o exemplo de um enum para disponibilizar os quatros estados brasileiros citados acima, contendo informações de Nome, Sigla e um método que pega o nom e de cada estado e já retorna para tudo maiúsculo.

```java
// criando o enum EstadoBrasileiro para ser usado em toda a aplicação
public enum EstadosBrasileiros {
    SAO_PAULO ("SP", "São Paulo"),
    RIO_JANEIRO ("RJ", "Rio de Janeiro"),
    BAHIA ("BA", "Bahia"),
    PARANA ("PR", "Parana");

    private String nome;
    private String sigla;

    private EstadosBrasileiros(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}
```

## UML

Linguagem de Modelagem Unificada ou UML é uma notação que possibilita a representação gráfica do projeto.
Na UML temos três conceitos necessarios para compreendermos inicialmente: `diagramas`, `elementos` e `relacionamentos`.

### Diagramas

As notações UML são distribuidas em duas categorias de diagramas, a estrutural e comportamental.

<b>Diagramas Estruturais</b>

-   Diagrama de classe: o diagrama de classe é utilizado para fazer a representação de estruturas de classes de negócio, interfaces e outros componentes do sistem. Por esta caracteristica, este diagrama é considerado o mais importante para a UML, pois auxilia a maioria dos demais diagramas.
-   Diagrama de objetos: este diagrama representa os objetos existentes em um determinado instante ou fato na aplicação. Assim conseguimos ter uma perspectiva do estado de nossos objetos mediante a interação dis usuários no sistema.

<b>OBS:</b> Existem outras categorias de diagramas estruturais e comportamentais.

### Diagrama de Classe

O diagrama de classes ilustra graficamente como classes serão estruturadas e interligadas entre si diante da proposta do nosso software.
Em diagrama a estrutura das classes é constituida por:
<b>Indenteficação:</b> Nome e/ou finalidade da classe
<b>Atributos:</b> Propriedades e/ou caracteristicas
<b>Operações:</b> Ações e/ou métodos

<b>Relacionamentos</b>
Em um diagrama as classes podem existir de forma independente, mas obviamente haverá em alguma etapa da aplicação a necessidade de algumas se relacionarem, o que devemos compreender é o nivel de dependência entre elas:

Associação: defini um relacionamento entre duas classes, permitindo que um objeto tenha acesso a estrutura de um outro objeto.
Class A -----> Class B : Associação Simples - navegação de A para B
Class A <----> Class B : Associação Bidirecional
Class A <>---> Class B : Agregação
Class A </>--> Class B : Composição

-   Agregação: a classe principal contém uma relação com outra classe mas ela pode existir sem a classe agregador. Imagina em um cadastro de Candidatos, podemos encontrar candidatos que ainda não possuam um Profissão.
    Candidato <>---> Profissão
-   Composição: caracteriza uma dependência existencial entre a classe principal e a classe associada. Imaginamos que uma Admissão só pode existir contendo suas informações básicas e a composição do Candidato selecionado.
    Admissão </>--> Candidato

Multiplicidade: nem sempre o relacionamento entre as classes sera de <b>um para um</b>, um determinado cenário podeá existir multiplicidades especificas conforme opções abaixo:

-   \1. -> Representa uma associação <b>contendo um elemento</b>
-   \*. -> Representa uma associação <b>contendo uma lista de elementos</b>
-   0..1 -> Representa uma associação <b>contendo zero ou um elemento</b>
-   0..\* -> Representa uma associação <b>contendo zero ou uma lista de elementos<b>

Visibilidaded: os atributos e métodos de uma classe podem receber níveis de visibiidade, e na UML existem síbolos que representam cada um deles.

-   (+) Visibilidade publica
-   (#) Visibilidade protegida (muita associada com herança)
-   (-) Visibilidade privada

    | Identificação                                                  |
    | -------------------------------------------------------------- |
    | - atributoPrivado : int                                        |
    | # atributoProtegido : String                                   |
    | + atributoPublico : double                                     |
    | -------------------------------------------------------------- |
    | + metodoSemRetorno() : void                                    |
    | + metodoComRetorno() : String                                  |
    | + metodoComParametro(param1 : int) : void                      |
