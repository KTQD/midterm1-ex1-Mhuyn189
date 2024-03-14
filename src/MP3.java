public class MP3 extends Item {
  int duration;

    public MP3(String name, String description, String ID, float price, int duration) {
        super(name, description, ID, price);
        this.duration = duration;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Duration: " + duration);
    }
}
