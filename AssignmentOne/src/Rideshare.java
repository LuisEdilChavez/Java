import javax.swing.JOptionPane;

// LUIS CHAVEZ CIS 166 2/1
/* This program is calculates the distance between 
2 points using X-Y ordered pairs and then calculates the distance between both 
of the pickup point and the drop off point
*/


public class Rideshare {

    public static void main(String[] args) {
        // Get input for Point 1.
        double x1 = Double.parseDouble(JOptionPane.showInputDialog("Enter x-coordinate for Point 1:"));
        double y1 = Double.parseDouble(JOptionPane.showInputDialog("Enter y-coordinate for Point 1:"));

        // Get input for Point 2.
        double x2 = Double.parseDouble(JOptionPane.showInputDialog("Enter x-coordinate for Point 2:"));
        double y2 = Double.parseDouble(JOptionPane.showInputDialog("Enter y-coordinate for Point 2:"));

        // Calculate distance.
        double distance = calculateDistance(x1, y1, x2, y2);

        // Calculate price.
        double unitCost = 1.25;
        double totalPrice = distance * unitCost;

        // spit results
        JOptionPane.showMessageDialog(null, "Distance: " + distance + "\nTotal Price: $" + totalPrice);
    }

    // Function to calculate distance between two points.
    private static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        // Math.pow method raises parameters by chosen number. since the Prompt says squared then its 2. Slides came in clutch...
    }
}
