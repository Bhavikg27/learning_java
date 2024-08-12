package learning_java.learning_java;

abstract class pen {
    abstract void write();

    abstract void refill();
}

class fountainPen extends pen {
    @Override
    void write() {
        System.out.println("write");
    }

    @Override
    void refill() {
        System.out.println("refill");
    }

    void changeNib() {
        System.out.println("Change the Nib");
    }
}

class monkey {
    void jump() {
        System.out.println("jumping...");
    }

    void bite() {
        System.out.println("biting...");
    }
}

interface BasicAnimal {
    void eat();

    void sleep();
}

class human extends monkey implements BasicAnimal {
    void speak() {
        System.out.println("hi...");
    }

    @Override
    public void eat() {
        System.out.println("eating...");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping...");
    }
}

abstract class TelePhone {
    abstract void ring();

    abstract void lift();

    abstract void disconnect();
}

class SmartTelePhone extends TelePhone {
    @Override
    void ring() {
        System.out.println("ringing");
    }

    @Override
    void lift() {
        System.out.println("pick up");
    }

    @Override
    void disconnect() {
        System.out.println("disconnecting");
    }

    void SaveNumber() {
        System.out.println("saving number");
    }
}

interface TVRemote {
    void SwitchOn();

    void volumeUp();
}

interface SmartTVRemote extends TVRemote {
    void Netflix();

    void Youtube();
}

class TV implements SmartTVRemote {
    @Override
    public void Netflix() {
        System.out.println("netflix on");
    }

    @Override
    public void Youtube() {
        System.out.println("youtube on");
    }

    @Override
    public void SwitchOn() {
        System.out.println("switched on");
    }

    @Override
    public void volumeUp() {
        System.out.println("volume up");
    }
}

public class practiceSet {
    public static void main(String[] args) {
        fountainPen pen = new fountainPen();
        pen.changeNib();

        human bhavik = new human();
        bhavik.eat();
        TelePhone nokia = new SmartTelePhone();
        nokia.disconnect();
        SmartTelePhone nokia2 = new SmartTelePhone();
        nokia2.disconnect();
        nokia2.SaveNumber();
        monkey simar = new human();
        simar.bite();
        TV oppo = new TV();
        oppo.SwitchOn();
        oppo.Netflix();
        oppo.volumeUp();
    }
}