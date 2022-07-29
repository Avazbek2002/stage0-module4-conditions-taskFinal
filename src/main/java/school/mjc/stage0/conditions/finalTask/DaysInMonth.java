package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        switch (month) {
            case (1):
                System.out.println(31);
                break;
            case (2):
                if (isLeapYear(year))
                    System.out.println (29);
                else
                    System.out.println(28);
                break;
            case (3):
                System.out.println(31);
                break;
            case (4):
                System.out.println(30);
                break;
            case (5):
                System.out.println(31);
                break;
            case (6):
                System.out.println(30);
                break;
            case (7):
                System.out.println(31);
                break;
            case (8):
                System.out.println(31);
                break;
            case (9):
                System.out.println(30);
                break;
            case (10):
                System.out.println(31);
                break;
            case (11):
                System.out.println(30);
                break;
            case (12):
                System.out.println(31);
                break;
            default:
                System.out.println("invalid date");
                break;
        }
    }

    public boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 != 0)
                return true;
            else if (year % 400 == 0) {
                return true;
            } else
                return false;
        } else
            return false;
    }
}
