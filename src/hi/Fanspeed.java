package hi;

public enum Fanspeed {
    off,
    low,
    medium,
    high;

    public Fanspeed increase() {
        return switch (this) {
            case off -> low;
            case low -> medium;
            case medium -> high;
            case high -> high;
        };
    }

    public Fanspeed decrease() {
        return switch (this) {
            case high -> medium;
            case medium -> low;
            case low -> off;
            case off -> off;
        };

    }
}