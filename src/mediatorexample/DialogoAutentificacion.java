package mediatorexample;

import mediatorexample.controles.Boton;
import mediatorexample.controles.CheckBox;
import mediatorexample.controles.Control;
import mediatorexample.controles.TextField;

public class DialogoAutentificacion implements Mediator {
    private Boton botonOk;
    private TextField tf_username;
    private CheckBox cb_acepto;

    public DialogoAutentificacion() {
        //Se inicializan los componentes de la interfaz y se les pasa la referencia a su dialogo (mediador)
        botonOk = new Boton(this);
        tf_username = new TextField(this);
        cb_acepto = new CheckBox(this);
    }

    @Override
    public void notificar(Control emisor, String evento) {
        if(emisor == botonOk && evento.equals("CLICK")){
            //Se procede a hacer el login
            System.out.println("botonOk clicked!");
        } else if(emisor == tf_username && evento.equals("KEY_PRESS")){
            System.out.println("Se ha escrito en el textfield!");
        } else if(emisor == cb_acepto && evento.equals("CHECK")){
            //Se habilita el boton de OK.
            //botonOK.toggle();
            System.out.println("Toggled botonOk!");
        }
    }

    //Funciones para simular el uso del dialogo
    public void clickOk(){
        botonOk.OnClicked();
    }

    public void checkAcepto(){
        cb_acepto.OnChecked();
    }
}
