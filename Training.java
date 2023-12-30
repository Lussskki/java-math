public class Training {
    private static int add(int n1, int n2) {
        return n1 + n2;
    }
    private static int subtract(int n1, int n2) {
        return n1 - n2;
    }
    private static int multiplication(int n1, int n2) {
        return n1 * n2;
    }
    private static int division(int n1, int n2) {
        return n1 / n2;
    }
    private static String names(String str) {
        return  "Lukassss";
    }
    public static void main(String[] args) {
        String name = "Luka";
        String lastName = "Guledani";
        String fullName = name + " " + lastName;
        int age = 23;
        System.out.println("My full name is " + fullName + " And age is " + age);

        int add = add(10, 10);
        System.out.println(add);

        int subtract = subtract(20, 10);
        System.out.println(subtract);

        int multiplication = multiplication(20,10);
        System.out.println(multiplication);

        int division = division(20, 10);
        System.out.println(division);

        String nam = names("");
        System.out.println(nam);

    }
}


