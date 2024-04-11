package controller;

import serviceImpl.JuegoServiceImpl;

public class MainController {

        public static void main(String[] args) {
                JuegoServiceImpl juegoService = new JuegoServiceImpl();
                juegoService.iniciarJuego();
        }
}