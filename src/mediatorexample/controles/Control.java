package mediatorexample.controles;

import mediatorexample.Mediator;

public class Control {
    Mediator dialogo;

    Control(Mediator dialogo) {
        this.dialogo = dialogo;
    }

    public void OnClicked(){
        dialogo.notificar(this, "CLICK");
    }
}
