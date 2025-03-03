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
