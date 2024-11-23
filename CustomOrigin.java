public class CustomOrigin {
    public static void main(String[] args) {
        // Set scrolling region from row 5 to bottom of the terminal
        System.out.print("\033[5;r");

        // Move cursor to the new "home" (row 5, column 1)
        System.out.print("\033[5;1H");

        // Print something relative to the custom origin
        System.out.println("This is the new starting point!");

        // Move the cursor down within the custom region
        System.out.print("\033[2B"); // Move down 2 rows relative to the custom origin
        System.out.println("Still within the custom origin!");

        // Reset the scrolling region (return to default behavior)
        System.out.print("\033[r");
    }
}
