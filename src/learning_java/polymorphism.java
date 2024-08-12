package learning_java;

//interface mycamera {
//    void takeSnap();
//    void recordVideo();
//    default void record4kVideo(){
//        System.out.println("recording in 4k");
//    };
//}
//
//interface mywifi {
//    String[] getnetworks();
//
//    void connecttonetwork(String network);
//}
//
//class mycellphone {
//    void callnumber(int phonenumber) {
//        System.out.println("calling " + phonenumber);
//    }
//
//    void pickcall() {
//        System.out.println("connecting...");
//    }
//
//}
//
//class mysmartphone extends mycellphone implements mywifi, mycamera {
//    public void takeSnap() {
//        System.out.println("taking snap");
//    }
//
//    public void recordVideo() {
//        System.out.println("recording video");
//    }
//
//    @Override
//    public String[] getnetworks() {
//        System.out.println("getting list of networks");
//        String[] networklist = {"bhavik", "radheradhe", "hm-105"};
//        return networklist;
//    }
//
//    @Override
//    public void connecttonetwork(String network) {
//        System.out.println("connecting to" + network);
//    }
//
//    public void record4kVideo(){
//        System.out.println("snap and recording in 4k");
//    }
//}
//THE SAME CODE ABOVE EXISTS IN DEFAULT_METHODS.JAVA !!!

public class polymorphism {
    public static void main(String[] args) {
        myCamera cam = new mySmartPhone();

    }
}
