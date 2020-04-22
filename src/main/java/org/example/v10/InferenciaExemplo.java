package org.example.v10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.stream.Collectors;

public class InferenciaExemplo {

    public static void main(String[] args) throws IOException {
        printarNomeCompleto("João", "Santos");
        printarSoma(5, 7);
    }

    public static void connectURL() throws IOException {
        var url = new URL("https://docs.oracle.com/javase/10/language");
        var urlConnection = url.openConnection();
        var reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

        System.out.println(reader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
    }

    public static void printarNomeCompleto(String nome, String sobremome) {
        var nomeCompleto = nome + " " + sobremome;
        System.out.println(nomeCompleto);
    }

    public static void printarSoma(Integer... numeros) {
        Integer soma;
        if (numeros.length > 0) {
            soma = 0;
            for (var numero = 0; numero < numeros.length; numero++) {
                soma += numeros[numero];
            }

            System.out.println("A soma é " + soma);
        }
    }
}
