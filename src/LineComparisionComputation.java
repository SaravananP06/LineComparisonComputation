public class LineComparisionComputation {
    public static void main(String[] args) {
        System.out.println("Welcome Line Comparision Computation Program");

        double x1 = 5.5;
        double x2 = 6.0;
        double y1 = 7.0;
        double y2 = 8.5;
        double lengthOfLine = Math.sqrt((Math.pow((x2-x1), 2) + (Math.pow((y2-y1), 2))));
        System.out.println("Length of the line: " +lengthOfLine);
    }

}
