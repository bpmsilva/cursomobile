# Programação para Dispositivos Móveis

## Informações Gerais

Este repositório contém o material da disciplina de Programação para Dispositivos Móveis, ministrada no Curso Superior de Tecnologia em Análise e Desenvolvimento de Sistemas (ADS) do IFBA Campus Valença. Esta matéria também é oferecida como disciplina optativa para o curso de Licenciatura em Computação do mesmo campus. No semestre 2026.2, são abordados o desenvolvimento de aplicativos Android com a linguagem de programação Java e o uso do Android Studio como ambiente de desenvolvimento integrado (IDE).

## Organização do Repositório

Este repositório está organizado de forma a facilitar o acesso aos projetos e códigos da disciplina. A estrutura de pastas é a seguinte:

- [`src/`](src): todos os códigos-fonte desenvolvidos durante a disciplina.
  - [`src/android`](src/android): códigos-fonte dos projetos desenvolvidos utilizando o Android Studio.
  - [`src/java`](src/java): códigos-fonte dos projetos desenvolvidos utilizando Java visando a revisão e solidificação dos conceitos dessa linguagem de programação.
  - [`src/kotlin`](src/kotlin): códigos-fonte dos projetos desenvolvidos utilizando Kotlin.
  - [`src/mit-app-inventor`](src/mit-app-inventor): Contém os arquivos `.aia` dos projetos desenvolvidos utilizando a plataforma MIT App Inventor.
  - [`src/xml`](src/xml): arquivos `.xml` visando o ensino de XML com foco na construção de layouts de aplicativos Android.


## Arquivos README.md

Comumente as pastas contêm arquivos `README.md` que descrevem o conteúdo, propósito, instruções além de trazerem explicações para melhor compreensão dos conceitos abordados. Recomenda-se a leitura desses arquivos para melhor compreensão do material.


## Semestre de 2026.2

### Avaliações

Estão previstas quatro avaliações, organizadas em três notas:

- A primeira nota será composta por um trabalho em dupla (reprodução da interface de um aplicativo existente) e uma prova prática de programação, também realizada em dupla. Cada avaliação terá valor de 5,0 pontos, totalizando 10,0 pontos para a primeira nota;
- A segunda nota corresponderá a um trabalho em grupo, voltado ao desenvolvimento de um aplicativo simples;
- A terceira nota corresponderá a um projeto em grupo, voltado ao desenvolvimento de um aplicativo completo.

### Conteúdo

- [x] Criar GitHub da Disciplina de Programação para Dispositivos Móveis;
- [x] Introdução à disciplina;
- [x] Por que desenvolvimento Mobile?;
- [x] Mostrar e testar o Android Studio;
- [x] "Olá, Mundo!" no Android Studio;
- [x] Comparação entre desenvolvimento por emulador e por dispositivo físico;
- [x] Apresentação à plataforma MIT App Inventor;
- [ ] Desenvolvimento de aplicativos simples no MIT App Inventor:
  - [x] Olá, Mundo!;
  - [x] Slider para tamanho de fonte;
  - [x] Aplicativo de Contador de Cliques;
  - [ ] Aplicativo de Câmera;
  - [ ] Aplicativo com Acelerômetro;
  - [ ] Desafio: Banco de Dados para controle de gastos pessoais;
  - [ ] Cálculo de IMC, "pedra, papel, tesoura" e calculadora, etc.;
- [ ] Introdução às plataformas:
  - [x] "Android XML/Layout Lab" (bernardopeters.com.br/aulas/android-xml);
  - [ ] Kodular (kodular.io);
- [x] Passo a passo para acesso aos Layouts no Android Studio;
- [ ] Extensible Markup Language (XML);
  - [x] Estrutura e sintaxe de um arquivo XML;
  - [x] Elementos, atributos e valores;
  - [x] Hierarquia de elementos;
  - [ ] Atributos de layout;
  - [ ] Atributos de estilo;
  - [ ] Atributos de comportamento;
  - [ ] XML e Android Studio;
    - [ ] Hierarquia de Views e ViewGroups;
    - [x] Exemplo de um Layout simples;
    - [x] Exemplo de um Layout mais complexo;
    - [ ] Desafio: replicar um Layout de um App;
- [ ] Revisão dos conceitos básicos de Java;
  - [x] Sintaxe;
  - [ ] Variáveis e Constantes;
  - [ ] Tipos de Dados;
  - [ ] Operadores;
    - [ ] Foco em operador ternário;
  - [ ] Estruturas de Controle;
  - [ ] Métodos;
  - [ ] Programação Orientada a Objetos;
    - [ ] Classes, Objetos, Atributos;
    - [ ] Herança;
    - [ ] Interfaces;
- [x] "Olá, Mundo!" com Java no Android Studio;
- [ ] Introdução ao Constraint Layout;
  - [x] Elemento botão
  - [x] IDs
  - [x] Eventos de clique
    - [x] onClick;
    - [x] setOnClickListener;
  - [x] Uso de Toast e Logcat para exibir mensagens;
  - [ ] Predileção por hierarquias rasas de Views e ViewGroups;
- [ ] Exibição dos principais componentes de uma aplicação Android (Views);
- [ ] Principais atributos de uma View;
  - [x] width e height:
    - [x] wrap_content e match_parent;
  - [ ] textColor, textSize, textStyle;
  - [x] Pixel (px), Density Pixel (dp), Scale-independent Pixels (sp);
  - [x] "Box Model": padding, margin;
- [ ] Exemplo de um contador de cliques utilizando Java;
- [ ] Slider para tamanho de fonte utilizando Java;
- [ ] Boas práticas na utilização de recursos;
  - [x] Strings;
  - [x] Colors;
  - [ ] Styles;
  - [ ] Tradução de Strings;
- [ ] Navegação entre Activities;
- [ ] Tópicos em Constraint Layout:
  - [ ] Bias;
  - [ ] Chains;
- [ ] ListView e RecyclerView;
  - [x] Adapter e ViewHolder no RecyclerView;
  - [ ] Layout personalizado para cada item;
  - [x] Eventos de clique e atualização da lista;
- [ ] Arquivo Manifest.xml;'
- [ ] Introdução à linguagem Kotlin;
  - [ ] Variáveis e Constantes;
  - [ ] Funções;
  - [ ] Interoperabilidade entre Java e Kotlin;
  - [ ] Exemplo de um contador de cliques utilizando Kotlin;
- [ ] Android Manifest;
- [ ] Demais componentes de interface:
  - [x] EditText;
  - [ ] CheckBox;
  - [ ] RadioButton;
  - [ ] Switch;
  - [ ] Spinner;
  - [ ] SeekBar;
  - [ ] ProgressBar;
  - [x] ImageView;
  - [ ] ListView;
  - [ ] RecyclerView;
  - [x] Snackbar;
- [ ] Ciclo de vida de uma Activity:
  - [ ] onCreate, onStart, onResume, onPause, onStop, onDestroy;
  - [ ] Exemplo: rotação de tela;
- Intents:
  - [ ] Implícitas;
  - [ ] Explícitas;
  - [ ] Recebimento de dados entre Activities;
  - [ ] Exemplo: abertura de um mapa com Intent implícita;
  - [ ] Exemplo: compartilhamento de dados entre aplicativos;

## Avaliações

- Primeira nota:
  - Trabalho individual: reprodução de um layout de um aplicativo existente;
  - Prova em dupla: formulário de cadastro de usuário com validação de campos;
