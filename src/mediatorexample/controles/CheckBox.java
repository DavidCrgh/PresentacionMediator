package mediatorexample.controles;

import mediatorexample.Mediator;

public class CheckBox extends Control {

    public CheckBox(Mediator dialogo) {
        super(dialogo);
    }

    public void OnChecked(){
        dialogo.notificar(this, "CHECK");
    }
}
