public class LineComparisionComputation {

    public static void main(String[] args) {
        Line l1 = new Line(0, 0, 0, 10);
        Line l2 = new Line(10, 0, 10, 10);

        System.out.println(lineDescription(l1.compareTo(l2)));

        l1 = new Line(0, 0, 0, 10);
        l2 = new Line(10, 0, 20, 10);

        System.out.println(lineDescription(l1.compareTo(l2)));

    }

    public static String lineDescription(int val) {
        if (val > 0) {
            return "Line 1 Greater";
        } else if (val < 0) {
            return "Line 1 Smaller";
        } else {
            return "Line 1 and Line 2 are equal";
        }
    }

}

class Line implements Comparable<Line> {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Line() {
        super();
    }

    public Line(int x1, int y1, int x2, int y2) {
        super();
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    @Override
    public int compareTo(Line o) {
        Line other = (Line) o;
        // line 1
        double line1x = Math.pow((x2 - x1), 2);
        double line1y = Math.pow((y2 - y1), 2);
        double length1 = Math.sqrt(line1x + line1y);
        // line 2
        double line2x = Math.pow((other.x2 - other.x1), 2);
        double line2y = Math.pow((other.y2 - other.y1), 2);
        double length2 = Math.sqrt(line2x + line2y);

        return (int) (length1 - length2);
    }

}