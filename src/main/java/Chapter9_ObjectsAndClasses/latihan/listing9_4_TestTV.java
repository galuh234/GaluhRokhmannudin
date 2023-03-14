package Chapter9_ObjectsAndClasses.latihan;

public class listing9_4_TestTV {
    public static void main(String[] args) {
        listing9_3_TV tv1 = new listing9_3_TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);

        listing9_3_TV tv2 = new listing9_3_TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();

        System.out.println("tv1's channel is " + tv1.channel + " and volume level is " + tv1.volumeLevel);
        System.out.println("tv2's channel is " + tv2.channel + " and volume level is " + tv2.volumeLevel);
    }
}
