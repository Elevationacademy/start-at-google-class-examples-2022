public class Soldier {
    public enum Rank {PRIVATE, CORPORAL, SARGENT;
        public Rank next() {
            return values()[(this.ordinal() + 1) % values().length];
        }
    }

    private Rank rank;
    private boolean isActive;

    public Soldier() {
        rank = Rank.PRIVATE;
        isActive = true;
    }

    public void promote(){
        rank = rank.next();
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Soldier{" +
                "rank=" + rank +
                ", isActive=" + isActive +
                '}';
    }
}
