package calculator;

public enum Operation {
    ADD {
        @Override
        public double apply(Double d1, double d2) {
            return d1 + d2;
        }
    },
    SUBTRACT {
        @Override
        public double apply(Double d1, double d2) {
            return d1 - d2;
        }
    },
    DIVIDE {
        @Override
        public double apply(Double d1, double d2) {
            return d1 / d2;
        }
    },
    MULTIPLY {
        @Override
        public double apply(Double d1, double d2) {
            return d1 * d2;
        }
    };


    public abstract double apply(Double d1, double d2);
}
