//pontos da sintaxe
//ponto 1- toda vez que criarmos um arquivo pro java temos que declarar uma classe no java
/*ponto 2- o nome da classe que formos declarar, tem que ter o mesmo nome do arquivo one ela se encontra,
ex: se o nome do arquivo for "main.java" o nomde da classe sera "main", podemos tambem declarar mais uma classe no mesmo arquivo,
mas é recomendado que tenhamos pelomenos uma classe com o mesmo nome do arquivo*/
//por java ser uma liguagem muito tipada temos que especificarmos bem o que queremos pra maquina, ao declarar variaveis, temos que usar este escopo
// tipo da variavel, nome da variavel e valor seguido de um ";" Ex: int = minhaIdade = 15;

import java.util.Date;

public class Main {    

    public static void main(String[] args) {
       
        Date relogio = new Date();
        System.out.println("A hora do sitema e: " + relogio.toString());
    }

}