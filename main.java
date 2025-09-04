import java.util.ArrayList; // importar a classe ArrayList para usar listas dinâmicas
// porque ArrayList não é uma classe padrão do java, precisa importar
// Precisa-se de Integer (e não int) na ArrayList porque ArrayList só aceita tipos objetos e Integer é a classe wrapper do tipo primitivo int



/*
public → Assim como na classe, significa que o método é acessível de qualquer lugar.

static → Indica que esse método pertence à classe Main em si, e não a um objeto específico.

void → tipo de retorno. Aqui é void porque o método main não devolve nada, só executa (retorno).

main → O nome do método. O Java reconhece esse nome como o ponto de entrada do programa.

String[] args → é um array de Strings que serve pra receber argumentos de linha de comando
 (tipo passar valores quando você executa o programa). Se não usar, pode deixar quieto
  
System.out.println(); --> ira exibir a string, int , etc

ARRAY -> estrutura de dados usado para armazenar uma coleção de elementos do mesmo tipo.
         Exemplo: String[] args -> array de strings ou  int[] numeros = {1, 2, 3, 4, 5} -> array de inteiros

 */


public class Main{ //  É a declaração de uma classe, que é como um molde para criar objetos. 
    public static void main(String[] args){ // Essa é a função principal (ou método principal) do programa. É aqui que tudo começa. Quando você executa seu código, o Java procura por essa linha e executa o que estiver dentro dela.
       
       
       
        int idade = 19;
        System.out.println("Idade: " + idade);



        if (idade > 18) { // condição 
            System.out.println("Voce é maior de idade!"); // printar mensagem caso a condição seja verdadeira
        }else{
            System.out.println("Voce é menor de idade!");// caso contrario a condição seja falsa
        }


        int[] numeros = {1,2,3,4,5}; // array de inteiros
        System.out.println("Numero selecionado: " + numeros[0]); // acessar o primeiro elemento do array (indice 0 quer dizer o primeiro elemento)


        // Como criar o arrayList e acessar seus elementos 
        // Arraylist<>tipo da lista (String, Integer, Double, etc) nomeDaLista = new ArrayList<tipo da lista>();

        
        ArrayList<String> listaNomes = new ArrayList<String>(); // arraylist de strings (lista com varios valores)
        listaNomes.add("Pedro"); // adicionar valor na lista [0]
        listaNomes.add("Maria"); // adicionar valor na lista [1]
        listaNomes.add("João"); // adicionar valor na lista [2]
        System.out.println(listaNomes.get(1)); // acessar o segundo elemento da lista , usa o get no arraylist (indice 1 quer dizer o segundo elemento)


        ArrayList<Integer> listanumeros = new ArrayList<Integer>(); // arraylist de inteiros (lista com varios valores)
        listanumeros.add(0);
        listanumeros.add(1);
        listanumeros.add(2);
        System.out.println("Numero Selecionado: " + listanumeros.get(2)); // acessar o terceiro elemento da lista (indice 2 quer dizer o terceiro elemento)



/*Como funciona um Loop for? -> O loop for é como preencher um formulário com três partes:
    
Início::Onde começa?
Condição: Até quando repetir?
Incremento: Como avançar?*/
 for(int i = 0 ;  i < 5 ; i++){// loop for (inicia em 0, enquanto i for menor que 5, incrementa 1)
            System.out.println(i + 1);// printa o valor de i + 1 (para começar a contar do 1 e não do 0)
        }


// mostrar nomes da ArrayList com loop for
for(int exibirN = 0; exibirN < listaNomes.size(); exibirN++){ // enquanto exibir for menor que o tamanho da listaNomes, incrementa 1
            System.out.println("Nome: " + listaNomes.get(exibirN)); // printa o nome na posição exibir
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
    double -> 64 bits -> // precisão dupla -> 19.99 (NUMEROS DECIMAIS) 
    
    char -> representar um unico caractere -> 'a', 'b', 'c'  --> 'aspas simples'

    boolean -> true ou false

   [tipos não primitivos - tipos objetos]

     String -> representa palavras e frases --> "aspas duplas" 
    Integer -> classe wrapper do tipo primitivo int
    Double -> classe wrapper do tipo primitivo double
    Float -> classe wrapper do tipo primitivo float
    Long -> classe wrapper do tipo primitivo long
    Boolean -> classe wrapper do tipo primitivo boolean
    Character -> classe wrapper do tipo primitivo char


*/






