package mediatorexample.controles;

import mediatorexample.Mediator;

public class TextField extends Control {

    public TextField(Mediator dialogo) {
        super(dialogo);
    }

    public void OnKeyPressed(){
        dialogo.notificar(this, "KEY_PRESS");
    }
}
