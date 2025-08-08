package keylo;

public enum Fan3Speed {
        OFF, LOW, MEDIUM, HIGH;
        public Fan3Speed increase() {
            return switch (this) {
                case OFF -> LOW;
                case LOW -> MEDIUM;
                case MEDIUM -> HIGH;
                case HIGH -> HIGH; // already max
            };
        }


        public Fan3Speed decrease() {
            return switch (this) {
                case HIGH -> MEDIUM;
                case MEDIUM -> LOW;
                case LOW -> OFF;
                case OFF -> OFF; // already min
            };
        }
    }



