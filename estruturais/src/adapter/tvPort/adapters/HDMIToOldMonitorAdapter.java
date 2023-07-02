package adapter.tvPort.adapters;

import adapter.tvPort.interfaces.HDMI;
import adapter.tvPort.model.OldMonitor;

public class HDMIToOldMonitorAdapter extends OldMonitor implements HDMI {

    @Override
    public void setImage(String image) {
        System.out.println("Converting the image from HDMI to VGA");
        super.setImage(image);
    }

    @Override
    public void setSound(String sound) {
        System.out.println("Sorry, We don´t work with sound");
    }

}
