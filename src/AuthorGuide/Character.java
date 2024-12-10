package AuthorGuide;

import java.util.HashMap;

public class Character extends DataManagement {
    private String name;
    private HashMap<String, String> traits; // Store traits in a map

    public Character(String name) {
        this.name = name;

        this.traits = new HashMap<>();

        // Initialize default traits
        this.traits.put("Name", name); // Set the name trait
        this.traits.put("Age", "0"); // Default age
        this.traits.put("Gender", "Not Specified"); // Default gender
    }

    public String getName() {
        return name;
    }

    public String getTraitValue(String trait) {
        return traits.get(trait); // Get trait value
    }

    public void setTraitValue(String trait, String value) {
        if (trait.equalsIgnoreCase("Name")) {
            this.name = value; // Update the character's name directly
        }

        if (value == null) {
            traits.remove(trait); // Remove the trait if the value is null
        } else {
            traits.put(trait, value); // Update or add the trait
        }
    }

    public HashMap<String, String> getTraits() {
        return traits; // Return all traits
    }

    public void displayTraits() {

        for (String key : traits.keySet()) {
            System.out.println(key + ": " + traits.get(key));
        }
    }
}
