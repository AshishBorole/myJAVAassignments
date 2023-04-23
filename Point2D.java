package letsdoit;

public class Point2D {
	    private double x;
	    private double y;
	    
	    public Point2D(double x, double y) {
	        this.x = x;
	        this.y = y;
	    }
	    
	    public String getDetails() {
	        return "(" + x + ", " + y + ")";
	    }
	    
	    public boolean isEqual(Point2D anotherPoint) {
	        return this.x == anotherPoint.x && this.y == anotherPoint.y;
	    }
	    
	    public double calculateDistance(Point2D anotherPoint) {
	        double xDiff = this.x - anotherPoint.x;
	        double yDiff = this.y - anotherPoint.y;
	        return Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));
	    }
	}


