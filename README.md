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
