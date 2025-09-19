import java.util.Date; // importando uma biblioteca java
// pacote SWING permite a criação de interfaces gráficas
import javax.swing.JFrame; // é a janela em si
import javax.swing.JLabel; // O JLabel é um texto que você coloca dentro da janela.


public class primeiroPrograma {
    public static void main(String[] args) { // metodo principalç (main)
        Date data = new Date(); // isso cria uma data
        System.out.println("Hoje é " + data.toString()); // imprime a data atual , transformando em string

        // verificar o Sistema operacional do sistema "exercicio" ✓
        System.getProperties(); // imprime as propriedades do sistema --> .getProperties() --> método
        String windows = System.getProperty("os.name"); // Criando a variável do tipo string e imprimindo o sistema operacional (os.name → retorna o nome do sistema operacional.)
        System.out.println("Sistema operacional: " + windows.toString()); // imprime o sistema operacional que está sendo utilizado


        // verificar o idioma do sistema "exercicio" ✓    
        String language = System.getProperty("user.language");
        System.out.println("Liguagem original do sistema: " + language.toString());


        
        // 1 - CRIAR JANELA
        JFrame janela = new JFrame("Minha janela");
        
        // 2. Definir o tamanho (largura, altura em pixels)
        janela.setSize(400,200);

        // 3. Configurar para fechar quando clicar no X
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 4 - Criar um JLabel e guardar em uma variável
        JLabel texto = new JLabel("texto dentro da janela" , JLabel.CENTER);

        // 5 - Adicionar o JLabel dentro da janela
        janela.add(texto);

        // 6. Tornar a janela visível
        janela.setVisible(true);
    }
}
