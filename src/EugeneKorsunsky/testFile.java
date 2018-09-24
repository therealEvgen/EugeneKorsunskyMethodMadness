package EugeneKorsunsky;

public class testFile {

    public static void main(String[] args) {
        int lcm = EKorsunskyLib.leastCommonMultiple(10, 55, 78);
        System.out.println("The least common multiple is: " + lcm);
        int sum = EKorsunskyLib.sumUpTo(100);
        System.out.println("The sum up to the number is: " + sum);
        EKorsunskyLib.fooBarBaz(100);
        String cutString = EKorsunskyLib.cutOut("catatonic cat", "cat");
        System.out.println(cutString);
        EKorsunskyLib.multiplicationTable(2,50);
    }
}
