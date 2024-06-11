public class PrisonTest {
    private static int prisonerCount = 0;
    private int bookingNumber;

    public PrisonTest() {
        prisonerCount++;
        bookingNumber = prisonerCount;
    }

    public void display() {
        System.out.println("Booking Number: " + bookingNumber);
        System.out.println("Prisoner Count: " + prisonerCount);
    }

    public static void main(String[] args) {
        PrisonTest prisoner1 = new PrisonTest();
        PrisonTest prisoner2 = new PrisonTest();
        PrisonTest prisoner3 = new PrisonTest();

        System.out.println("Prisoner 1:");
        prisoner1.display();
        System.out.println();

        System.out.println("Prisoner 2:");
        prisoner2.display();
        System.out.println();

        System.out.println("Prisoner 3:");
        prisoner3.display();
        System.out.println();
    }
}
