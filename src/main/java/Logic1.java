package src.main.java;


public class Logic1
{
    public static void main(String[] args){
        Logic1 logicDriver = new Logic1();
        //All test cases;
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

    public Logic1()
    {

    }

    //ONLY EDIT BELOW HERE-------------------------------------------------------------------------


    public boolean old35(int n) {
        if (n%3 == 0 && n%5 == 0) {
            return false;
        }
        else if (n%3 == 0 || n%5 == 0) {
            return true;
        }
        else {
            return false;
        }
    }



    public boolean specialEleven(int n) {
        if (n%11 == 0 || n%11 == 1) {
            return true;
        }
        else {
            return false;
        }
    }


    public boolean more20(int n) {
        if (n%20 == 1 || n%20 == 2) {
            return true;
        }
        else {
            return false;
        }
    }



    public boolean less20(int n) {
        if (n%20 == 19 || n%20 == 18) {
            return true;
        }
        else {
            return false;
        }
    }


    public boolean nearTen(int num) {
        if (num % 10 <= 2 || num % 10 >= 8) {
            return true;
        }
        else {
            return false;
        }
    }



    public int sortaSum(int a, int b) {
        int sum = a + b;
        if (sum >=10 && sum < 20) {
            sum = 20;
        }
        return sum;
    }



    public boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode == true) {
            if (n <= 1 || n >= 10) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            if (n >= 1 && n <= 10) {
                return true;
            }
            else {
                return false;
            }
        }
    }



    public int teenSum(int a, int b) {
        if ((a>=13 && a<=19) || (b>=13 && b<=19)) {
            return 19;
        }
        else {
            return a + b;
        }
    }



    public boolean love6(int a, int b) {
        if (a==6 || b==6 || (a+b)==6 || Math.abs(a-b)==6) {
            return true;
        }
        else {
            return false;
        }
    }



    public boolean lastDigit(int a, int b, int c) {
        if (a%10 == b%10 || b%10 == c%10 || a%10 == c%10) {
            return true;
        }
        else {
            return false;
        }
    }



    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if ((isAsleep == true) || (isMorning == true && isMom == false)) {
            return false;
        }
        else {
            return true;
        }
    }


    public String alarmClock(int day, boolean vacation) {
        if (vacation == true) {
            if (day == 0 || day == 6) {
                return "off";
            }
            else {
                return "10:00";
            }
        }
        else {
            if (day == 0 || day == 6) {
                return "10:00";
            }
            else {
                return "7:00";
            }
        }
    }



    public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0;
        }
        else if (2*tea <= candy || 2*candy <= tea) {
            return 2;
        }
        else {
            return 1;
        }
    }



    public int redTicket(int a, int b, int c) {
        if (a==2 && b==2 && c==2) {
            return 10;
        }
        else if (a==b && b==c) {
            return 5;
        }
        else if (a!=b && a!=c) {
            return 1;
        }
        else {
            return 0;
        }
    }



    public int greenTicket(int a, int b, int c) {
        if (a==b && b==c) {
            return 20;
        }
        else if (a==b || b==c || a==c) {
            return 10;
        }
        else {
            return 0;
        }
    }



    public boolean squirrelPlay(int temp, boolean isSummer) {
        int upper = 90;
        if (isSummer == true) {
            upper = 100;
        }
        if (temp >= 60 && temp <= upper) {
            return true;
        }
        else {
            return false;
        }
    }



    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday == true) {
            speed -= 5;
        }
        if (speed <= 60) {
            return 0;
        }
        else if (speed <= 80) {
            return 1;
        }
        else {
            return 2;
        }
    }



    public int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) {
            return 0;
        }
        else if (you >= 8 || date >= 8) {
            return 2;
        }
        else {
            return 1;
        }
    }
    
    

    public String fizzString2(int n) {
        if (n%3 == 0 && n%5 == 0) {
            return "FizzBuzz!";
        }
        else if (n%3 == 0) {
            return "Fizz!";
        }
        else if (n%5 == 0) {
            return "Buzz!";
        }
        else {
            return n + "!";
        }
    }


    public boolean sodaParty(int sodas, boolean isWeekend) {
        if (isWeekend == true) {
            if (sodas >= 40) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            if (sodas >= 40 && sodas <= 60) {
                return true;
            }
            else {
                return false;
            }
        }
    }

}
