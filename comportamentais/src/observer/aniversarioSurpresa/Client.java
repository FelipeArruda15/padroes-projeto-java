package observer.aniversarioSurpresa;

import observer.aniversarioSurpresa.observer.Namorada;
import observer.aniversarioSurpresa.observer.Porteiro;

public class Client {
    public static void main(String[] args) throws Exception {
        Namorada namorada = new Namorada();
        Porteiro porteiro = new Porteiro();

        porteiro.addChegadaAniversarianteObserver(namorada);

        porteiro.run();
    }
}
