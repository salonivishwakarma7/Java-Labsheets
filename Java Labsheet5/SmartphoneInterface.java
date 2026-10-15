interface PhotoCamera {
    void takePhoto();
}

interface MusicPlayback {
    void playMusic();
}

class SmartMobile implements PhotoCamera, MusicPlayback {
    @Override
    public void takePhoto() {
        System.out.println("Smartphone is taking a photo.");
    }

    @Override
    public void playMusic() {
        System.out.println("Smartphone is playing music.");
    }
}

public class SmartphoneInterface {
    public static void main(String[] args) {
        SmartMobile phone = new SmartMobile();

        phone.takePhoto();
        phone.playMusic();
    }
}
