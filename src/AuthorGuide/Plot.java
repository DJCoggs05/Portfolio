package AuthorGuide;

public class Plot extends DataManagement {
    private String name;

    public Plot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void displayPlotDetails() {
        System.out.println("Plot Point: " + name);
    }
}
