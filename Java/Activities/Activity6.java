package activities;

public class Activity6 {

    public static void main(String[] args) throws InterruptedException {
        //There is a plane with max 10 passengers
        Plane plane = new Plane(10);
        //Add passengers on the list
        plane.onboard("John");
        plane.onboard("Steve");
        plane.onboard("Anna");

        System.out.println("Plane took off at: " + plane.takeOff());

        System.out.println("People on the plane: " + plane.getPassengers());

        Thread.sleep(5000);

        plane.land();
        //Plane lands
        System.out.println("Plane landed at: " + plane.getLastTimeLanded());
        System.out.println("People on the plane after landing: " + plane.getPassengers());
    }
}
