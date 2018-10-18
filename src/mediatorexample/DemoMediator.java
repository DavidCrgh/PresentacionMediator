package mediatorexample;

public class DemoMediator {
    public static void main(String[] args){
        //Se inicializa un nuevo dialogo
        DialogoAutentificacion ventana = new DialogoAutentificacion();

        //Se simula una interaccion con la interfaz grafica
        ventana.checkAcepto();
        ventana.clickOk();
    }
}
