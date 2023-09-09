package observer.aniversarioSurpresa.observer;

import java.util.Date;

public class ChegadaAniversarianteEvent {

    private final Date chegada;

    public ChegadaAniversarianteEvent(Date chegada) {
        this.chegada = chegada;
    }

    public Date getChegada() {
        return chegada;
    }

}
