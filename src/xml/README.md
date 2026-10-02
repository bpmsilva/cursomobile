# Extensible Markup Language (XML)

## Introdução

Extensible Markup Language (XML) é uma linguagem de marcação que define um conjunto de regras para codificar documentos em um formato que seja legível tanto por humanos quanto por máquinas. A seguir há um trecho de código XML que exemplifica a estrutura básica de um arquivo XML:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<note>
    <to>Tove</to>
    <from>Jani</from>
    <heading>Reminder</heading>
    <body>Don't forget me this weekend!</body>
</note>
```

## Sintaxe e Estrutura

### Tags
O XML é composto por elementos, valores e atributos. Um elemento XML pode ser representado por uma tag de abertura e uma tag de fechamento. A tag de abertura define o início do elemento, enquanto a tag de fechamento, identificada pelo caractere `/`, define seu fim. A seguir, há um exemplo de um elemento com uma tag de abertura, um conteúdo textual e uma tag de fechamento:

```xml
<elemento>Valor do elemento</elemento>
```

Um elemento que não possui conteúdo também pode ser representado por uma tag de elemento vazio:

```xml
<elemento />
```

que é equivalente a:

```xml
<elemento></elemento>
```

Em resumo, para o elemento `<nome>Bernardo</nome>`, temos:

- `nome` -> nome do elemento;
- `<nome>` -> tag de abertura;
- `</nome>` -> tag de fechamento;
- `Bernardo` -> conteúdo textual do elemento.

### Estrutura Hierárquica

O XML possui uma estrutura hierárquica, onde elementos podem conter outros elementos, formando uma árvore de elementos. A seguir, há um exemplo de uma estrutura hierárquica de elementos:

```xml
<livro>
    <titulo>O Senhor dos Anéis</titulo>
    <autor>
        <nome>J.R.R. Tolkien</nome>
        <nacionalidade>Britânica</nacionalidade>
    </autor>
    <ano>1954</ano>
</livro>
```

No exemplo anterior, `livro` é o elemento raiz. Os elementos `<titulo>`, `<autor>` e `<ano>` são filhos de `livro` e, portanto, são irmãos entre si. Por sua vez, `nome` e `nacionalidade` são filhos de `autor`.

```
livro
├── titulo
├── autor
│   ├── nome
│   └── nacionalidade
└── ano
```

### Atributos
Os atributos são usados para fornecer informações adicionais sobre os elementos. Eles são definidos dentro da tag de abertura do elemento e possuem um nome e um valor. A seguir, há um exemplo de um elemento com atributos e também um comentário explicativo:

```xml
<!-- Exemplo de um elemento com atributos -->
<livro genero="fantasia" idioma="inglês">
    <titulo idioma="pt-BR">O Senhor dos Anéis</titulo>
    <autor>
        <nome>J.R.R. Tolkien</nome>
        <nacionalidade>Britânica</nacionalidade>
    </autor>
    <ano>1954</ano>
</livro>
```

### XML e Android Studio

O XML é amplamente utilizado no desenvolvimento de aplicativos Android, especialmente para definir a interface de usuário. No Android Studio, os arquivos XML são usados para criar layouts, definir estilos, cores e outros recursos visuais. Esses arquivos ficam localizados na pasta `res` do projeto:
```
app
 └── src
     └── main
         └── res
             ├── layout
             ├── values
             └── drawable
```

### Layouts no Android Studio

Os layouts no Android Studio são definidos em arquivos XML localizados na pasta `res/layout`. 
Cada arquivo descreve um layout que pode representar uma tela ou parte da interface de uma aplicação Android.

Os componentes de uma interface Android baseada em Views são objetos da classe `View` ou de suas subclasses. A classe `ViewGroup` é uma subclasse de `View` capaz de conter e organizar outras Views.

#### Views
As Views são os elementos básicos da interface de usuário, como botões, textos, imagens, etc. Cada View é representada por uma tag XML específica, como `<Button>`, `<TextView>`, `<ImageView>`, entre outras. Em geral, as Views possuem atributos que definem suas propriedades, como tamanho, cor, texto, entre outros, e não possuem elementos filhos.

A seguir, há um exemplo de uma View em XML:

```xml
<Button
    android:id="@+id/button_example"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Clique aqui" />
``` 

#### ViewGroups

As ViewGroups são contêineres capazes de conter outras Views ou ViewGroups, permitindo a criação de layouts mais complexos. Quando possuem elementos filhos, são representadas utilizando uma tag de abertura e uma tag de fechamento, com os elementos filhos declarados em seu interior. Alguns exemplos de ViewGroups são `LinearLayout`, `RelativeLayout`, `ConstraintLayout`, entre outros. Hoje em dia, o `ConstraintLayout` é amplamente utilizado devido à sua flexibilidade e capacidade de criar layouts responsivos.

A seguir, há um exemplo de um ViewGroup com ConstraintLayout contendo um TextView:

```xml
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <TextView
        android:id="@+id/textview_example"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Olá, Mundo!"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintStart_toStartOf="parent" />

</androidx.constraintlayout.widget.ConstraintLayout>
```

#### Namespace

O namespace é um conceito importante no XML, especialmente no contexto do Android Studio. Ele permite diferenciar elementos e atributos que podem ter o mesmo nome, mas pertencem a diferentes contextos ou bibliotecas. No Android, os namespaces são definidos usando atributos especiais nas tags de abertura dos elementos.

Exemplo de declaração de namespaces em um arquivo XML do Android:

```xml
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <!-- Conteúdo do layout -->
</androidx.constraintlayout.widget.ConstraintLayout>
```

Os namespaces aqui presentes são:
- `xmlns:android`: associa o prefixo android ao namespace dos atributos definidos pelo framework Android.
- `xmlns:app`: associa o prefixo app ao namespace usado para atributos personalizados definidos pelo aplicativo ou por bibliotecas, como o ConstraintLayout.

A seguir, há um exemplo de como os prefixos android: e `app:` são utilizados em um mesmo layout:

```xml
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <TextView
        android:id="@+id/textview_example"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Olá, Mundo!"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintStart_toStartOf="parent" />
</androidx.constraintlayout.widget.ConstraintLayout>
```
