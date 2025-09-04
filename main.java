/*
public → significa que esse método pode ser acessado de qualquer lugar. 
A JVM precisa “enxergar” ele, por isso é público.

static → quer dizer que esse método pertence à classe e não a um objeto. Ou seja, 
você não precisa criar um objeto da classe Main pra rodar, ele já está pronto.

void → tipo de retorno. Aqui é void porque o método main não devolve nada, só executa (retorno).

main → nome fixo do método. Tem que ser exatamente assim, senão não roda.

String[] args → é um array de Strings que serve pra receber argumentos de linha de comando
 (tipo passar valores quando você executa o programa). Se não usar, pode deixar quieto
  
System.out.println(); --> ira exibir a string, int , etc
 */


public class Main{
    public static void main(String[] args){ 
        int idade = 19;
        System.out.println("Idade: " + idade);




        if (idade > 18) { // condição 
            System.out.println("Voce é maior de idade!"); // printar mensagem caso a condição seja verdadeira
        }else{
            System.out.println("Voce é menor de idade!");// caso contrario a condição seja falsa
        }




    }

}

/* Criação de Váriaveis -->  TIPO nomeVariavel = VALOR

    int = tipo inteiro --> int idade = 19
    string= tipo texto --> string nome = "Pedro" / string -> representa palavras e frases --> "aspas duplas" 
*/


/* [tipos primitivos] 

    byte -> 8 bits -> -128 a 127
    short -> 16 bits -> -32.768 a 32.767
    int -> 32 bits -> -2.147.483.648 a 2.147.483.647
    long -> 64 bits -> -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807

    float -> 32bits -> precisão simples -> 5.50 (NUMEROS DECIMAIS)
    double -> 64 bits -> precisão dupla 

    
    char -> representar um unico caractere -> 'a', 'b', 'c'  --> 'aspas simples'

    boolean -> true ou false

*/


/*  [CONDICIONAIS]
    

*/









