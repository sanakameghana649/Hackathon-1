import java.util.Scanner;
class WasteStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double wasteCollected;
        System.out.print("Enter Waste Collected (kg): ");
        wasteCollected = sc.nextDouble();
        if (wasteCollected >= 100) {
            System.out.println("Collection Target Achieved");
        } else {
            System.out.println("More Waste Collection Required");
        }
    }
}