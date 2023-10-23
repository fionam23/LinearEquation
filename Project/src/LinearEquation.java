public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private double slope;
    private double intercept;
    private double distanceOfPoints;

    public double roundNumber( double number){
        int decimalPlaces = 2;
        double factor = Math.pow(10, decimalPlaces);
        double roundedNumber = (double) Math.round(number * factor)/factor;


        return roundedNumber;


    }


    private int getX(String coordinate){
        int myInt;
        int cutBegin = coordinate.indexOf("(");
        if (coordinate.charAt(cutBegin + 1) == '-'){
            myInt = -Integer.parseInt(coordinate.substring(cutBegin+2, cutBegin+3));
        } else {
            myInt = Integer.parseInt(coordinate.substring(cutBegin+1, cutBegin+2));
        }
        return myInt;
    }

    private int getY(String coordinate){
        int myInt;
        int cutBegin = coordinate.indexOf(",");
        if (coordinate.charAt(cutBegin + 1) == '-'){
            myInt = -Integer.parseInt(coordinate.substring(cutBegin + 2, cutBegin + 3));
        } else {
            myInt = Integer.parseInt(coordinate.substring(cutBegin+1, cutBegin+2));
        }
        return myInt;
    }

    public LinearEquation(String first, String second){

        x1 = getX(first);
        y1 = getY(first);
        x2 = getX(second);
        y2 = getY(second);
        slope =  ((double)y2-y1)/((double)x2-x1);
        intercept = (y1-slope*x1);
        distanceOfPoints = Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1, 2));
    }

    public String toString(){
        return ("First Pair: ("+x1+","+y1+");Second Pair: ("+x2+","+y2+");Slope of the Line: "+slope+";Y-intercept: "+intercept+";Slope intercept form: y ="+slope+"x + "+intercept+";Distance between points: "+roundNumber(distanceOfPoints));
    }

    public double solveForY(int coord){

        double thing  = (slope*coord)+intercept;

        return thing;
    }


}
