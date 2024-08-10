import java.util.HashMap;

class Hashmapss {
    public static void main(String[] args) {
        // Create and Populate Hashmap
        HashMap<String, Integer> examScores = new HashMap<String, Integer>();

        examScores.put("EngMath", 90);
        examScores.put("EAP", 85);
        examScores.put("Physics", 81);
        examScores.put("IntroToComputing", 89);
        
        // Replace math score
        //examScores.replace("EngMath", 91);

        // Remove element from Hashmap
        //examScores.remove("EAP");

        // Include a new element if not already present in Hashmap
        //examScores.putIfAbsent("EngMaterials", 71);

        // Check that element/key is in Hashmap, returns boolean
        //System.out.println(examScores.containsKey("EngMath"));

        // Check that value is in Hashmap, returns boolean
        //System.out.println(examScores.containsValue(85));
        //System.out.println(examScores.containsValue(Integer.valueOf(85)));

        // Check if Hashmap is empty, returns boolean
        //System.out.println(examScores.isEmpty());

        // Print out all elements in created Hashmap
        //System.out.println(examScores.toString());

        // Print out number of elements within Hashmap
        //System.out.println(examScores.size());

        // Print out single value from Hashmap, EAP score
        //System.out.println(examScores.get("EAP"));

        // Print out single value of element which is not included within Hashmap
        //System.out.println(examScores.getOrDefault("FMET", 50));

        // To clear out entire Hashmap
        //examScores.clear();


        // Print out subjects and scores with new format, using loop and lambda function
        //examScores.forEach((subject, score) -> {
            //System.out.println(subject + " - " + score);
        //});

        // Print out updated subjects and scores from Hashmap, using loops and lambda function
        examScores.forEach((subject, score) -> {
            examScores.replace(subject, score - 10);
        });

        System.out.println(examScores.toString());
    }
}