package net.xeill.elpuig;

import java.io.*;

public class Main {

    public static void main(String[] args) {

	Leer_documento acceder=new Leer_documento();
	acceder.leer();
    }
}

class Leer_documento {

    public void leer() {

        try {
            FileReader input = new FileReader("C:/Users/fran_/Desktop/prueba.txt");
            int almacen = input.read();

            while (almacen != -1) {

                almacen = input.read();

                char letra = (char)almacen;

                System.out.print(letra);
            }

        } catch (IOException e) {
            System.out.println("No se encontraron archivos para leer, modifiquelo.");

        }
    }
}
