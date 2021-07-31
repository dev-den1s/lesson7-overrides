package hilel.zadanie1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;

public class exercises {
    public static void main(String[] args) {
        new exercises().run();
    }

    // main function
    private void run() {
        dateTime();
    }

    private void dateTime() {
        int seconds = 6673662;
        int tmp = 0, years = 0, days = 0, hours = 0, minutes = 0;
        ArrayList<String> check = new ArrayList<String>();
        String result = "";
        if (seconds == 0)
            result = "now";
        else {
            if (seconds >= 31536000) {
                years = seconds / 31536000;
                seconds -= (years * 31536000);
                if (years == 1)
                    check.add(years + " year");
                else
                    check.add(years + " years");
            }
            if (seconds >= 86400) {
                days = seconds / 86400;
                seconds -= (days * 86400);
                if (days == 1)
                    check.add(days + " day");
                else
                    check.add(days + " days");
            }
            if (seconds >= 3600) {
                hours = seconds / 3600;
                seconds -= (hours * 3600);
                if (hours == 1)
                    check.add(hours + " hour");
                else
                    check.add(hours + " hours");
            }
            if (seconds >= 60) {
                minutes = seconds / 60;
                seconds -= (minutes * 60);
                if (minutes == 1)
                    check.add(minutes + " minute");
                else
                    check.add(minutes + " minutes");
            }
            if (seconds != 0) {
                if (seconds == 1)
                    check.add(seconds + " second");
                else
                    check.add(seconds + " seconds");
            }

            for (int i = 0; i < check.size(); i++) {
                if (i == check.size() - 1)
                    result += "and " + check.get(i);
                else
                    result += check.get(i) + ", ";
            }
        }
        System.out.println(result);
    }

    private void centure() {
        Scanner s = new Scanner(System.in);
        int centure;
        System.out.println("Enter a year : ");
        double y = s.nextInt();
        centure = (int) y / 100;
        if ((centure * 100) < y)
            centure++;
        System.out.println("This is " + centure + "centure");
    }

    // BigDecimal rounding method
    private double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    //Simple rounding method
    private void round2() {
        double number = 234.328645123454;
        System.out.println(round(number, 2));
        //round yura
        double arr[] = new double[10];
        System.out.print("( ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%.2f ", arr[i]);//////////////////////////////////////  tut
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print(")");
        //end round yura
    }

    private void isDividingByThree() {
        String str = "1111111111111111111110921375089347523094512347902134";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {

            sum += str.charAt(i) - '0';
        }
        if (sum % 3 == 0) {
            System.out.printf("делится на 3 i suma " + sum);
        } else {
            System.out.println("не делится на 3 i suma " + sum);
        }
    }

}
