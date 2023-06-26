package adapter.tvPort;

import adapter.tvPort.model.Computer;
import adapter.tvPort.model.OldMonitor;
import adapter.tvPort.model.TV;

public class Client {

    public static void main(String[] args) {
        TV tv = new TV();
        OldMonitor monitor = new OldMonitor();
        Computer computer = new Computer();
        // Consigo conectar a TV na porta do computador pois são de tipos
        // compatives(HDMI)
        computer.connectPort(tv);
        // Tipos incompativeis
        // computer.connectPort(monitor);
    }

}
