import java.util.Date; // importando uma biblioteca java

public class primeiroPrograma {
    public static void main(String[] args) { // metodo principalç (main)
        Date data = new Date(); // isso cria uma data
        System.out.println("Hoje é " + data.toString()); // imprime a data atual , transformando em string
        

        // verificar o idioma do sistema "exercicio" ✓
        System.getProperties(); // imprime as propriedades do sistema --> .getProperties() --> método
        String windows = System.getProperty("os.name"); // Criando a variável do tipo string e imprimindo o sistema operacional (os.name → retorna o nome do sistema operacional.)
        System.out.println("Sistema operacional: " + windows.toString()); // imprime o sistema operacional que está sendo utilizado



        // verificar a resolução de do sistema "exercicio" ✓
        String language = System.getProperty("user.language");
        System.out.println("Liguagem original do sistema: " + language.toString());


    }
}
