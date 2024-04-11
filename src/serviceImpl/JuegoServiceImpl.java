package serviceImpl;

import dto.JuegoDTO;

import java.util.Random;
import java.util.Scanner;

public class JuegoServiceImpl {
    private int maximoIntentos = 5;
    private Scanner numeroCapturado = new Scanner(System.in);
    private int numeroAleatorio = new Random().nextInt(100 + 1);

    public void iniciarJuego() {
        JuegoDTO juegoDTO = new JuegoDTO();

        for ( int numeroIntentos = 1; numeroIntentos <= 5; numeroIntentos++) {
            System.out.println("Ingrese un número: ");
            juegoDTO.setNumeroIngresado(numeroCapturado.nextInt());

            if (numeroAleatorio == juegoDTO.getNumeroIngresado()) {
                System.out.println("Acertaste el número secreto es " + numeroAleatorio);
                break;
            } else if (numeroAleatorio < juegoDTO.getNumeroIngresado()) {
                System.out.println("El número secreto es menor");
                maximoIntentos--;
            } else if (numeroAleatorio > juegoDTO.getNumeroIngresado()) {
                System.out.println("El número secreto es mayor");
                maximoIntentos--;
            }

            System.out.println("Te queda " + (maximoIntentos > 1 ? maximoIntentos + " intentos" : maximoIntentos + " intento"));
        }


        if (maximoIntentos == 0) {
            System.out.println("Lo siento superaste el número de intentos");
        }
    }
}
