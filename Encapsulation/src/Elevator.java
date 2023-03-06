public class Elevator {
    private int currentFloor;
    private int minFloor;
    private int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        this.currentFloor = 0;
    }

    public int getCurrentFloor() {
        return this.currentFloor;
    }
    public void moveDown() {
        if (this.currentFloor > this.minFloor) {
            this.currentFloor--;
            System.out.println("The elevator goes down to the floor: " + this.currentFloor);
        } else {
            System.out.println("The elevator is on the lowest floor");
        }
    }
    public void moveUp() {
        if (this.currentFloor < this.maxFloor) {
            this.currentFloor++;
            System.out.println("The elevator rises to the floor: " + this.currentFloor);
        } else {
            System.out.println("The elevator is on the top floor");
        }
    }
    public void move(int floor){
        if (floor >= this.minFloor && floor <= this.maxFloor) {
            while (this.currentFloor < floor){
                moveUp();
            }
            while (this.currentFloor > floor) {
                moveDown();
            }
            System.out.println("The elevator has arrived on the floor: " + this.currentFloor);
        } else {
            System.out.println("The specified floor is out of range");
        }
    }
}