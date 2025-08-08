package Phanka;
public enum Fanspeed1 {
    OFF, LOW, MEDIUM, HIGH;
    public Fanspeed1 increase() {
        return switch (this) {
            case OFF -> LOW;
            case LOW -> MEDIUM;
            case MEDIUM -> HIGH;
            case HIGH -> HIGH;
        };
    }
    public Fanspeed1 decrease() {
        return switch (this) {
            case HIGH -> MEDIUM;
            case MEDIUM -> LOW;
            case LOW -> LOW;
            case OFF -> OFF;
        };
    }
}