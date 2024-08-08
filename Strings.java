class Strings {
    public static void main(String[] args) {
        //char percentSign = '%';
        //System.out.println(percentSign);

        //String name = "Chikenayi Weli";
        //System.out.println(name);

        //String literalString1 = "abc";
        //String literalString2 = "abc";

        //String objectString1 = new String("xyz");
        //String objectString2 = new String("xyz");

        //System.out.println(literalString1 == literalString2);
        //System.out.println(objectString1 == objectString2);

        String name = "Chikenayi Weli";
        String country = "Nigeria";
        int age = 21;

        String formattedString = String.format("My name is %s. I am from %s. I am %d years old.", name, country, age);

        System.out.println(formattedString);
    }
}
