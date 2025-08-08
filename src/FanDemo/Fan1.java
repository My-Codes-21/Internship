package FanDemo;

    public enum Fan1 {
        off,
        low,
        medium,
        high;

        public Fan1 increase() {
            return switch (this) {
                case off -> low;
                case low -> medium;
                case medium -> high;
                case high -> high;
            };
        }

        public Fan1 decrease() {
            return switch (this) {
                case high -> medium;
                case medium -> low;
                case low -> off;
                case off -> off;
            };

        }
    }

