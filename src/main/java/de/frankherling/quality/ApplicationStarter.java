package de.frankherling.quality;

/**
 * Created by fherling on 19/11/2016.
 */
public class ApplicationStarter {


    /**
     * Main Method for starting the application process.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("TEST");
        ApplicationStarter starter = new ApplicationStarter();
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
    private void doFirst() {
        for (int i = 1; i < 10; i++) {
            System.out.println("running");
        }
        for (int i = 1; i < 10; i++) {
            System.out.println("running");
        }
    }

    private void doSecond() {
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
