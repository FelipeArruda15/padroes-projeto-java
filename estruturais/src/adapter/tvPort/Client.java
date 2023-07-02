package adapter.tvPort;

import adapter.tvPort.adapters.HDMIToOldMonitorAdapter;
import adapter.tvPort.adapters.HDMIToVGAAdapter;
import adapter.tvPort.model.Computer;
import adapter.tvPort.model.OldMonitor;

public class Client {

    public static void main(String[] args) {
        OldMonitor monitor = new OldMonitor();
        Computer computer = new Computer();
        computer.connectPort(new HDMIToVGAAdapter(monitor));
        computer.sendImageAndSound("Cr7 bike x JUve", "SIIIIIIIII");

        System.out.println("-----------------------------------------------");

        HDMIToOldMonitorAdapter oldMonitorAdapter = new HDMIToOldMonitorAdapter();
        computer.connectPort(oldMonitorAdapter);
        computer.sendImageAndSound("Cachorro", "Auuuuuuuuauau");
    }

}
