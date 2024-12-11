import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Point2D
    Point2D p1 = new Point2D();
    Point2D p2 = new Point2D();

    //p1.setX(5);
    //p2.setX(10);

    //p1.setY(3);
    //p2.setY(5);

    // Ohio Dog
    Dog OhioDog = new Dog();
    OhioDog.breed = "daschund";
    OhioDog.size = 10.2;
    OhioDog.colorOfFur = "brown";

    Dog RizzDog = new Dog();
    RizzDog.setBreed("chihuahua");
    RizzDog.setColor("Green");
    RizzDog.setSize(19.6);


  }
}
