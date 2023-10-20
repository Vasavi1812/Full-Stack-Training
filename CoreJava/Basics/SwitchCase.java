import java.util.Scanner;

public class SwitchCase {
    public static void main(String args[]) {
        int month;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month number: ");
        month = input.nextInt();

        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                season = "Bogus Month";
        }
        System.out.println(month + " month is in the " + season + ".");
    }

}
