package Chapter9_ObjectsAndClasses.latihan;

public class listing9_3_TV {
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;

    public listing9_3_TV() {
    }
    public void turnOn() {
        on = false;
    }

    public void setChannel(int newChannel1) {
        if (on && newChannel1 >= 1 && newChannel1 <= 120)
            channel = newChannel1;
    }

    public void setVolume(int newVolumeLevel) {
        if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
            volumeLevel = newVolumeLevel;
    }
    public void channelUp() {
        if (on && channel < 120)
            channel++;
    }
    public void channelDown() {
        if (on && channel > 1)
            channel--;
    }
    public void volumeUp() {
        if (on && volumeLevel < 7)
            volumeLevel++;
    }
    public void volumeDown() {
        if (on && volumeLevel > 1)
            volumeLevel--;
    }
}
