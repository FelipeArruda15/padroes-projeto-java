package observer.aniversarioSurpresa.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro extends Thread {

    private List<ChegadaAniversarianteObserver> observers = new ArrayList<>();

    public void addChegadaAniversarianteObserver(ChegadaAniversarianteObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int valor = sc.nextInt();

            if (valor == 1) {
                ChegadaAniversarianteEvent event = new ChegadaAniversarianteEvent(new Date());

                for (ChegadaAniversarianteObserver obs : observers) {
                    obs.chegou(event);
                }
                break;
            } else {
                System.out.println("Alarme falso!!");
            }
        }

    }

}
