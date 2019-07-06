package org.amitc.jenkins.helloworld;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Car car = new Car("blue", "bmw");
        System.out.println("Car color is " + car.getColor());
        System.out.println("Car model is " + car.getModel());
        
    }
}
