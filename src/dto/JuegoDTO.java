package dto;
public class JuegoDTO {
    private int numeroIngresado;
    private String bienvenida;

    public JuegoDTO() {
        this.bienvenida = """
                Bienvenido! adivina el número secreto.
                Tienes 5 intentos.""";
        System.out.println(bienvenida);
    }

    public int getNumeroIngresado() {
        return this.numeroIngresado;
    }

    public void setNumeroIngresado(int numeroIngresado) {
        this.numeroIngresado = numeroIngresado;
    }
}