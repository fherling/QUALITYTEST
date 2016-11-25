package de.frankherling.quality;

/**
 * Created by fherling on 19/11/2016.
 */
public class ApplicationStarter2 {


    /**
     * Main Method for starting the application process.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("TEST");
        ApplicationStarter2 starter = new ApplicationStarter2();
        starter.startApplication();
    }

    /**
     * Starts the application.
     */
    public void startApplication() {
        System.out.println("starting...");
        doFirst();
        doSecond();

    }

    /**
     * Do something stupid.
     */
    public void doFirst() {
        for (int i = 1; i < 10; i++) {
            System.out.println("running");
        }
        for (int i = 1; i < 10; i++) {
            System.out.println("running");
        }
    }

    public void doSecond() {
        for (int i = 1; i < 10; i++) {
            System.out.println("running");
        }
    }

    private void doSecondA() {
        for (int i = 1; i < 10; i++) {
            System.out.println("running");
        }
    }
    private void doSecondB() {
        for (int i = 1; i < 10; i++) {
            System.out.println("running");
        }
    }
    private void doSecondC() {
        for (int i = 1; i < 10; i++) {
            System.out.println("running");
        }
    }
}
