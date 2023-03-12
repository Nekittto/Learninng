public class Main {
    public static void main(String[] args) {
        int volume = 1200; // pool volume
        int fillingSpeed = 30; //30 litres per minute
        int devastationSpeed = 10; //10 litres per minute
        int xtime = 0, increase = fillingSpeed - devastationSpeed, filling = 0;
        while (filling < volume) {
            xtime++;
            filling += increase;
        }
        System.out.println("Filled in " + xtime + " min");
    }
}