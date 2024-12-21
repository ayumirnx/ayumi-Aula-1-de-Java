import java.util.Locale;

public class idioma {
    public static void main(String[] args) {
        //obtem a s confguracoes locais do sistema
        Locale locale = Locale.getDefault();
        
        //obtem o idioma do sistema
        String language = locale.getLanguage();

        System.out.println("idioma do sistema: " + language);
        System.out.println("Nome do idioma: " + locale.getDisplayLanguage());
    }
}

/*1- Locale.getDefault: obtem o Locale padrao do sistea operacional
  2-  getLanguage(): REtorna o codigo ISO 639-1 do idioma, como "en" para ingles ou "pt" para portugues
  3- getDisplay(): REtorna o nome do idioma no idioma local(ex: "Portuges" em portugues ou "English" em ingles)
*/