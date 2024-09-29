package src.main.java;

public class Logic1 {
    public static void main(String[] args) {
        Logic1 logicDriver = new Logic1();
        // All test cases;
        System.out.println(logicDriver.old35(3));
        System.out.println(logicDriver.old35(10));
        System.out.println(logicDriver.old35(15));
        System.out.println(logicDriver.specialEleven(22));
        System.out.println(logicDriver.specialEleven(23));
        System.out.println(logicDriver.specialEleven(24));
        System.out.println(logicDriver.more20(20));
        System.out.println(logicDriver.more20(21));
        System.out.println(logicDriver.more20(42));
        System.out.println(logicDriver.less20(18));
        System.out.println(logicDriver.less20(59));
        System.out.println(logicDriver.less20(20));
        System.out.println(logicDriver.nearTen(12));
        System.out.println(logicDriver.nearTen(17));
        System.out.println(logicDriver.nearTen(19));
        System.out.println(logicDriver.sortaSum(3, 4));
        System.out.println(logicDriver.sortaSum(9, 4));
        System.out.println(logicDriver.sortaSum(10, 11));
        System.out.println(logicDriver.in1To10(5, false));
        System.out.println(logicDriver.in1To10(11, false));
        System.out.println(logicDriver.in1To10(11, true));
        System.out.println(logicDriver.teenSum(3, 4));
        System.out.println(logicDriver.teenSum(10, 13));
        System.out.println(logicDriver.teenSum(13, 2));
        System.out.println(logicDriver.love6(6, 4));
        System.out.println(logicDriver.love6(4, 5));
        System.out.println(logicDriver.love6(1, 5));
        System.out.println(logicDriver.lastDigit(23, 19, 13));
        System.out.println(logicDriver.lastDigit(23, 19, 12));
        System.out.println(logicDriver.lastDigit(23, 19, 3));
        System.out.println(logicDriver.answerCell(false, false, false));
        System.out.println(logicDriver.answerCell(false, false, true));
        System.out.println(logicDriver.answerCell(true, false, false));
        System.out.println(logicDriver.alarmClock(1, false));
        System.out.println(logicDriver.alarmClock(5, false));
        System.out.println(logicDriver.alarmClock(0, false));
        System.out.println(logicDriver.teaParty(6, 8));
        System.out.println(logicDriver.teaParty(3, 8));
        System.out.println(logicDriver.teaParty(20, 6));
        System.out.println(logicDriver.redTicket(2, 2, 2));
        System.out.println(logicDriver.redTicket(2, 2, 1));
        System.out.println(logicDriver.redTicket(0, 0, 0));
        System.out.println(logicDriver.greenTicket(1, 2, 3));
        System.out.println(logicDriver.greenTicket(2, 2, 2));
        System.out.println(logicDriver.greenTicket(1, 1, 2));
        System.out.println(logicDriver.squirrelPlay(70, false));
        System.out.println(logicDriver.squirrelPlay(95, false));
        System.out.println(logicDriver.squirrelPlay(95, true));
        System.out.println(logicDriver.caughtSpeeding(60, false));
        System.out.println(logicDriver.caughtSpeeding(65, false));
        System.out.println(logicDriver.caughtSpeeding(65, true));
        System.out.println(logicDriver.dateFashion(5, 10));
        System.out.println(logicDriver.dateFashion(5, 2));
        System.out.println(logicDriver.dateFashion(5, 5));
        System.out.println(logicDriver.fizzString2(1));
        System.out.println(logicDriver.fizzString2(5));
        System.out.println(logicDriver.fizzString2(3));
        System.out.println(logicDriver.fizzString2(15));
        System.out.println(logicDriver.sodaParty(30, false));
        System.out.println(logicDriver.sodaParty(50, false));
        System.out.println(logicDriver.sodaParty(70, true));
    }

    public Logic1() {
    }

    // ONLY EDIT BELOW HERE-------------------------------------------------------------------------

    public boolean old35(int n) {
        return (n % 3 == 0) ^ (n % 5 == 0); // Return true if a multiple of 3 or 5, but not both
    }

    public boolean specialEleven(int n) {
        return (n % 11 == 0) || (n % 11 == 1); // Return true if multiple of 11 or one more than a multiple
    }

    public boolean more20(int n) {
        return (n % 20 == 1) || (n % 20 == 2); // Return true if 1 or 2 more than a multiple of 20
    }

    public boolean less20(int n) {
        return (n % 20 == 19) || (n % 20 == 18); // Return true if 1 or 2 less than a multiple of 20
    }

    public boolean nearTen(int num) {
        return (num % 10 <= 2) || (num % 10 >= 8); // Return true if within 2 of a multiple of 10
    }

    public int sortaSum(int a, int b) {
        int sum = a + b;
        return (sum >= 10 && sum < 20) ? 20 : sum; // Return sum or 20 if in the range 10..19
    }

    public boolean in1To10(int n, boolean outsideMode) {
        return (outsideMode) ? (n <= 1 || n >= 10) : (n >= 1 && n <= 10); // Check range based on outsideMode
    }

    public int teenSum(int a, int b) {
        return ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) ? 19 : (a + b); // Return sum or 19 if any is teen
    }

    public boolean love6(int a, int b) {
        return (a == 6 || b == 6 || (a + b) == 6 || Math.abs(a - b) == 6); // Check if love for number 6
    }

    public boolean lastDigit(int a, int b, int c) {
        return (a % 10 == b % 10) || (b % 10 == c % 10) || (a % 10 == c % 10); // Check last digits
    }

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        return !(isAsleep || (isMorning && !isMom)); // Determine if the phone should be answered
    }

    public String alarmClock(int day, boolean vacation) {
        if (vacation) {
            return (day == 0 || day == 6) ? "off" : "10:00"; // Alarm settings based on vacation
        }
        return (day == 0 || day == 6) ? "10:00" : "7:00"; // Regular alarm settings
    }

    public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) return 0; // Bad party if either is less than 5
        if (tea >= 2 * candy || candy >= 2 * tea) return 2; // Great party if one is double the other
        return 1; // Good party
    }

    public int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) return 10; // All twos
        if (a == b && b == c) return 5; // All same
        if (a != b && a != c) return 1; // All different
        return 0; // Otherwise
    }

    public int greenTicket(int a, int b, int c) {
        if (a == b && b == c) return 20; // All the same
        if (a == b || b == c || a == c) return 10; // Two are the same
        return 0; // All different
    }

    public boolean squirrelPlay(int temp, boolean isSummer) {
        int upper = isSummer ? 100 : 90; // Set upper limit based on summer
        return (temp >= 60 && temp <= upper); // Check if squirrels can play
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) speed -= 5; // Adjust speed for birthday
        if (speed <= 60) return 0; // No ticket
        if (speed <= 80) return 1; // Small ticket
        return 2; // Big ticket
    }

    public int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) return 0; // Bad date if either is 2 or less
        if (you >= 8 || date >= 8) return 2; // Great date if either is 8 or more
        return 1; // Good date
    }

    public String fizzString2(int n) {
        String result = "";
        if (n % 3 == 0) result += "fizz"; // Add fizz for multiples of 3
        if (n % 5 == 0) result += "buzz"; // Add buzz for multiples of 5
        return result.isEmpty() ? n + "!" : result + "!"; // Return fizz, buzz, or number
    }

    public boolean sodaParty(int straws, boolean extra) {
        return (extra) ? (straws >= 60) : (straws >= 40); // Check if there are enough straws
    }

    // ONLY EDIT ABOVE HERE-------------------------------------------------------------------------
}
