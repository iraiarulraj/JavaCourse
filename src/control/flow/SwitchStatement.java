package control.flow;

public class SwitchStatement {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2000));
    }

    public static boolean isOdd(int number){

        if (number > 0 && number % 2 != 0){
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end){
        int total = 0;
        if (end >= start && start >= 0 && end >= 0){
            for (int i = start; i <= end; i++){
                if (isOdd(i)){
                    total += i;
                }
            }
        } else {
            return -1;
        }

        return total;
    }

    public static boolean isLeapYear(int year){
        if (year >= 1 && year <= 9999){
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                //if (year % 100 != 0 || year % 400 == 0){
                    return true;
                //}
            }
        } else {
            return false;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year){
        int result = 0;
        if(month < 1 || month > 12 || year < 1 || year > 9999){
            result = -1;
        } else {
            switch (month){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    result = 31;
                    break;
                case 2:
                    if (isLeapYear(year)){
                        result = 29;
                    }else {
                        result = 28;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    result = 30;
            }
        }
        return  result;
    }

    public static void printNumberInWord(int num){

        switch (num){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
        }

    }
}
