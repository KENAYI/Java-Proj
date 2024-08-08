class HelloWorld {
    static int age;

    public static void main(String[] args) {
        int age = 21;

        System.out.println("I am " + age + " years old.");

        int num1 = 5;
        double num2 = num1;

        System.err.println(num2);

        double num3 = 5.8;
        int num4 = (int)num3;

        System.err.println(num4);
    }
}