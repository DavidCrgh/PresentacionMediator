package mediatorexample;

import mediatorexample.controles.Control;

public interface Mediator {
    void notificar(Control emisor, String evento);
}
