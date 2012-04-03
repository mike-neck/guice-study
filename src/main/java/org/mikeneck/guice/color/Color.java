package org.mikeneck.guice.color;

/**
 * @author: mike
 * @since: 12/04/03
 */
public enum Color {
    BLUE {
        @Override
        int getR() {
            return 0;
        }

        @Override
        int getG() {
            return 0;
        }

        @Override
        int getB() {
            return 204;
        }
    }, RED {
        @Override
        int getR() {
            return 204;
        }

        @Override
        int getG() {
            return 0;
        }

        @Override
        int getB() {
            return 0;
        }
    }, YELLOW {
        @Override
        int getR() {
            return 204;
        }

        @Override
        int getG() {
            return 204;
        }

        @Override
        int getB() {
            return 0;
        }
    }, GREEN {
        @Override
        int getR() {
            return 0;
        }

        @Override
        int getG() {
            return 153;
        }

        @Override
        int getB() {
            return 0;
        }
    }, WHITE {
        @Override
        int getR() {
            return 255;
        }

        @Override
        int getG() {
            return 255;
        }

        @Override
        int getB() {
            return 255;
        }
    };

    abstract int getR();

    abstract int getG();

    abstract int getB();

    public String getRGB () {
        return new StringBuilder()
                .append(Integer.toHexString(getR()))
                .append(Integer.toHexString(getG()))
                .append(Integer.toHexString(getB()))
                .toString();
    }
}
