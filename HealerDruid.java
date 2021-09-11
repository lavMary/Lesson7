public class HealerDruid extends Healer implements Trainee {
    private Beast beast;
    public HealerDruid (int hp, int level, int damage) {
        super(hp, level, damage);
    }

    public Beast getBeast() {
        return beast;
    }

    public void setBeast(Beast beast) {
        this.beast = beast;
    }

    void tameBeast() {
        System.out.println("The beast is tamed.");
    }

    @Override
    void heroInfo() {
        System.out.println("Hi! My name is Ella.");
    }

    @Override
    public void train() {
        System.out.println("Healer cant training here");
    }
}
