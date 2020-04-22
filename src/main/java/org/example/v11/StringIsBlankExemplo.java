package org.example.v11;

public class StringIsBlankExemplo {

    public static void main(String[] args) {
        String espaco = " ";
        String vazio = "";
        String preechido = "sdf";

        System.out.println(espaco.isBlank());
        System.out.println(vazio.isBlank());
        System.out.println(preechido.isBlank());
    }
}
