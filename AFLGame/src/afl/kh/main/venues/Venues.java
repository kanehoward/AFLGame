package afl.kh.main.venues;

public class Venues {

    private String name;
    private int crowdCapacity;
    private boolean isHome;
    public static Venues optus = new Venues("Optus Stadium", 60_000);
    public static Venues mcg = new Venues("MCG", 100_000);

    public Venues(String name, int crowdCapacity) {
        this.name = name;
        this.crowdCapacity = crowdCapacity;
    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCrowdCapacity() {
        return crowdCapacity;
    }

    public void setCrowdCapacity(int crowdCapacity) {
        this.crowdCapacity = crowdCapacity;
    }

    public boolean isHome() {
        return isHome;
    }

    public void setHome(boolean home) {
        isHome = home;
    }
}
