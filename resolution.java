import java.awt.Dimension;
import java.awt.Toolkit;

public class resolution {
    public static void main(String[] args) {
        //Obtem o tamanho da tela usando o t
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        //obtem a largura e a altura
        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();

        System.out.println("A resolucao da tua tela e: " + width + "x" + height);

    }

}

/*explicacao do codigo font chat gpt 
1- Toolkit.getDefaultToolkit().getScreenSize(): Essa funcao obtem o tamanho da tela como um objeo
2- getWidth e getHeight: Esses metodos retornam a largura e a altura da tela, respectivamente.*/
