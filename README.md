# Academia_capgemini_challenge
DESAFIO DE PROGRAMAÇÃO 02 - ACADEMIA CAPGEMINI


## Main
Para fazer o primeiro teste, basta iniciar o Run As Java Application, e então os primeiros exemplos serão mostrados.
1. Na linha 9, temos "Collections.addAll(questionOneList, 9, 2, 1, 4, 6);" e a saída 4.
2. Na linha 12, temos "Collections.addAll(questionTwoList, 1, 5, 3, 4, 2);" como a lista e "int questionTwoDiferece = 2;" como diferença, a será saída 3.
3. Na linha 15, temos "String questionThreeText = "tenha um bom dia";" com a saída taoa eum nmd hbi.
Mudando qualquer das entradas já será recebido um valor diferente para a respectiva questão 1, 2 ou 3.


Essas respostas são acessadas atraves da classe "CallResponse responseTo = new CallResponse();" previamente iniciada no main


## CallResponse
Aqui temos iniciados os objetos:
"public Median doMedianOf = new Median();, public DifferenceBetween doMatchsOf = new DifferenceBetween(); e public EncriptText doEncriptOf = new EncriptText();"
Desses podendos acessar o método "calc();" de cada um para executar a tarefa necessária que responde uma das questões.

Eles são acessados no main pelos métodos:


public int callMedian(Array do tipo Integer) {


  // Contém o método da classe Median, que recebe uma lista de inteiros e retorna um inteiro esperado como uma mediana para um lista ordenada.
}


public int callDifferences(Array do tipo Integer, constante do tipo int) {
  /* Contém o método da classe DiffereceBetween, que recebe uma lista inteiros e também uma constante, então retorna quantos valores na lista
  possuem uma diferença entre si igual a constante recebecida */
}
public String callEncript(String textoParaSerEncriptado) {
  /* Contém o método da classe EncriptText, que recebe um texto/frase, remover os espaços contidos no mesmo, e então o retorna reescrito considerando
  as regras de colunas e linhas do desafio */
}

## Como cada classe se comporta?

1. Median, recebe um ArrayList<Integer> ordenado, verifica em uma condição lógica se a quantidade de elementos contida é par ou impar, então,
  se for par, o valor retornado será um iteiro arredondado para cima igual a razão entre os dois elementos que estão entre as extremidades de
  valores menores e maiores. Se for impar, o valor retornado será o que está entre as extremidades de valores menores e maiores.
  O Cálculo que indica a devida posição é baseado na metade do tamnho da lista e é passado no método get(x) do array.
2. DifferenceBetween, recebe um ArrayList<Integer> não ordenado e também uma consnte do tipo primitivo int, e para verificar quantos pares
  que possuem uma diferença igual a constete recebida em seu parâmetro, "listOfNumbers.contains(listOfNumbers.get(i) - diference))" verifica
  se está contigo na lista um valor correspondente a tal diferença, como na lista [1, 5, 3, 4, 2]... um for interar sobre a lista e executar 
  o teste lógico, quando o i for 0 e a constante for 2, termos "listOfNumbers.contains(1-2))" o ".contains(x)"  então verifica na lista dada
  se há um valor "-1", não haverá caso da lista [1, 5, 3, 4, 2], mas haveria quando o o for interar sobre a posição [1], onde teremos o caso
  "listOfNumbers.contains(5-2))", onde existe o valor  "3" presente na lista. Sempre que existir tal valor um contador presente no método é
  incrementado, para ao final do laço ser retornado seu valor acumulado.
  Preferi usar o método "contains(x)" por ficar uma estrutura mais limpa e também pela verificação do método ser mais robusta do que eu pudesse
  fazer caso usasse um for(i){for(j){}} para verificar com "==".
3. EncriptText
