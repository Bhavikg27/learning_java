package learning_java;

interface myCamera {
    void takeSnap();
    void recordVideo();
    default void record4kVideo(){
        System.out.println("recording in 4k");
    }
}

interface myWifi {
    String[] getNetworks();

    void ConnectToNetwork(String network);
}

class myCellphone {
    void callNumber(int phoneNumber) {
        System.out.println("calling " + phoneNumber);
    }

    void pickCall() {
        System.out.println("connecting...");
    }

}

class mySmartPhone extends myCellphone implements myWifi, myCamera {
    @Override
    public void takeSnap() {
        System.out.println("taking snap");
    }

    @Override
    public void recordVideo() {
        System.out.println("recording video");
    }

    @Override
    public String[] getNetworks() {
        System.out.println("getting list of networks");
        return new String[]{"bhavik", "RadheRadhe", "hm-105"};
    }

    @Override
    public void ConnectToNetwork(String network) {
        System.out.println("connecting to " + network);
    }

    @Override
    public void record4kVideo(){
        System.out.println("snap and recording in 4k");
    }
}

public class default_method {
    public static void main(String[] args) {
        mySmartPhone samsung = new mySmartPhone();
        samsung.record4kVideo();
        String[] ar = samsung.getNetworks();
        for (String item : ar) {
            System.out.println(item);
        }
        samsung.takeSnap();
        samsung.callNumber(108);
        samsung.callNumber(109);
        samsung.pickCall();
        samsung.ConnectToNetwork("abc");
    }
}
