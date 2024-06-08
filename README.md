# Java Udemy
### Algoritmos 
- De definição simples e não apenas usada na programação, algoritmos são sequências de instruções a serem seguidas, é o passo a passo
### Entrada de dados 
- Ocorre através dos tipos de dados, entre eles os primitivos, tipos referência...
### Tipos Primitivos e variáveis 
- É o Primeiro contato com dados na linguagem
    - `int`, `double`, `float`, `String`, `char`, `long`, `boolean`, `byte`, `short`
    - É a partir daí que podemos armazenar informações
### Lógica de programação 
- Fase inicial e importantíssima para se familiarizar e entender o funcionamento das linhas de código
### Palavras reservadas
- São palavras já reservadas pelo compilador/interpretador para uso interno de operações, a lista aqui é bem vasta, aqui são alguns exemplos:
    - Palavras reservadas não podem ser usadas para dar nome as variáveis
    - Todos o tipos primitivos são reservadas
    - `public`, `private`, `protected`, `main`, `static`, `void`, `return`, `abstract`, `implements`, `extends` ...
### Parâmetros vs Argumentos

- **Parâmetros** são as variáveis listadas na definição da função.
- **Argumentos** são os valores reais passados para a função quando ela é invocada.
- Em resumo, os parâmetros são como “espaços reservados” para os valores que a função precisa, e os argumentos são os valores reais que preenchem esses espaços
### Classes
- Onde os pilares da programação orientada a objetos começam, esse é tipo de dados referência
- As Classes podem ser entendidas com uma receita de como tal coisa tem que ser.
- Aqui ocorre o desenrolar do pilares da POO
### Pilares da Programação Orientada a Objetos(POO)
- **Classe**: Define a estrutura de um objeto, incluindo seus atributos e métodos. Em Java, a palavra reservada `class` é usada para definir uma classe.
- **Objeto**: Uma instância de uma classe. Em Java, usamos a palavra reservada `new` para criar uma nova instância de uma classe.
- **Abstração**: É a prática de esconder a complexidade e mostrar apenas a funcionalidade essencial. Em Java, a palavra reservada `abstract` é usada para criar uma classe abstrata.
- **Encapsulamento**: É a prática de esconder detalhes de implementação de uma classe e permitir acesso através de métodos públicos. Em Java, usamos as palavras reservadas `public`, `private` e `protected` para definir o nível de acesso.
- **Herança**: Permite que uma classe herde atributos e métodos de outra classe. Em Java, usamos a palavra reservada `extends` para indicar herança.
- **Polimorfismo**: Permite que um objeto seja tratado de várias formas, dependendo de sua classe. Em Java, o polimorfismo é implementado através de métodos virtuais e abstratos. `@Override` é a anotação de método subrescrito
- **Interface**: É um contrato que garante que uma classe tenha um conjunto específico de métodos. Em Java, a palavra reservada `interface` é usada para definir uma interface.
- **Generics**: Generics permitem que classes, interfaces e métodos possam ser
parametrizados por tipo. Seus benefícios são: Reuso, Type safety, Performance. ex: `public static <T extends Comparable<? super T>> T max(List<T> list)`, a `letra T`(pode ser qualquer uma outra) é usado na sixtaxe. 
- **Wildcard types** Com tipos curinga podemos fazer métodos que recebem um genérico de "qualquer tipo", ex: `public static void printList(List<?> list)` o `?` é usado nessa sintaxe curinga.

### Programação Funcional e expressões lambda
- **Expressões lambda**: Em programação funcional, expressão lambda corresponde a uma
função anônima de primeira classe.

- **Interface funcional**: É uma interface que possui um único método abstrato. Suas implementações serão tratadas como expressões lambda.
