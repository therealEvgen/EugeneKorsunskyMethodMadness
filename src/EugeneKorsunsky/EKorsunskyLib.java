package EugeneKorsunsky;

public class EKorsunskyLib {
    public static int leastCommonMultiple(int number1, int number2, int number3){
        int testNumber = 1;
        // as long as the number being tested isn't divisible by all three numbers, the loop will continue
        // this is a simple loop to find the least common multiple
        while(!((testNumber%number1 == 0) & (testNumber%number2 == 0) & (testNumber%number3 == 0))){
            // increases the test number by one until the least common multiple is found
            testNumber++;
        }
        return testNumber;
    }
    public static int sumUpTo(int number){
        int testNumber = 0;
        int totalSum = 0;
        // keeps adding until the loop is finished
        while(testNumber < (number + 1)){
            totalSum += testNumber;
            testNumber++;
        }
        return totalSum;
    }
    public static void fooBarBaz(int number){
        int testNumber = 1;
        while(testNumber < (number + 1)){
            // if number isn't divisible by any of these
            if(!(testNumber%3 == 0) & (testNumber %5 == 0)){
                System.out.print(testNumber + ",");
            }
            // if number is divisible by both
            else if((testNumber%3 == 0) & (testNumber %5 == 0)){
                System.out.print("baz,");
            }
            // if number is divisible by three
            else if((testNumber%3 == 0)){
                System.out.print("foo,");
            }
            // if number is divisible by five
            else if((testNumber%5 == 0)){
                System.out.print("bar,");
            }
            testNumber++;
        }
    }
    public static String cutOut(String mainString, String subString){
        return mainString.replaceFirst(subString, "");
    }
    public static void multiplicationTable(int base, int range){
        int[] resultArray = new int[range + 1];
        int currentMultiplier = 0;
        while(currentMultiplier < (range + 1)){
            resultArray[currentMultiplier] = currentMultiplier * base;
            currentMultiplier++;
        }
        for(int i = 0; i < resultArray.length; i++){
            System.out.println(resultArray[i]);
        }
    }
}
