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
        double gpa = 3.9;
        char percentSign = '%';
        boolean amTellingthetruth = true;

        String formattedString = String.format("My name is %s. I am from %s. I am %d years old and my GPA is %f. I have attended 100%c of my university classes. These are all %b claims.", name, country, age, gpa, percentSign, amTellingthetruth);

        System.out.println(formattedString);

        // check length of string
        System.out.println(name.length());

        // check if string is empty
        System.out.println(name.isEmpty());

        // convert string from uppercase to lowercase
        System.out.println(name.toLowerCase());

        // compare strings
        String string1 = new String("abc");
        //string string2 = new string("abc");
        String string2 = new String("ABC");

        //System.out.println(string1.equals(string2));
        System.out.println(string1.equalsIgnoreCase(string2));

        // replace specific string values in a string
        String string = "The sky is blue";
        String updatedString = string.replace("blue", "red");

        //System.out.println(string.replace("blue", "red"));
        System.out.println(updatedString);

        // check if a string contains a specific string value
        System.out.println(string.contains("sky"));
    }
}
