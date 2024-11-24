public class TerminalSection {
    public static void main(String[] args) {
        int topRow = 5, bottomRow = 15, leftCol = 10, rightCol = 30;
        
        // Clear and define the section
        clearSection(topRow, bottomRow, leftCol, rightCol);
        
        // Draw boundaries (optional)
        drawBoundary(topRow, bottomRow, leftCol, rightCol);

        // Print within the section
        printInSection(6, 12, "Hello!", topRow, bottomRow, leftCol, rightCol);
        printInSection(7, 12, "Restricted", topRow, bottomRow, leftCol, rightCol);
    }

    private static void drawBoundary(int topRow, int bottomRow, int leftCol, int rightCol) {
        for (int col = leftCol; col <= rightCol; col++) {
            moveTo(topRow, col);
            System.out.print("-");
            moveTo(bottomRow, col);
            System.out.print("-");
        }
        for (int row = topRow; row <= bottomRow; row++) {
            moveTo(row, leftCol);
            System.out.print("|");
            moveTo(row, rightCol);
            System.out.print("|");
        }
    }

    private static void clearSection(int topRow, int bottomRow, int leftCol, int rightCol) {
        for (int row = topRow; row <= bottomRow; row++) {
            moveTo(row, leftCol);
            System.out.print("\033[2K");
        }
    }

    private static void printInSection(int row, int col, String text, int topRow, int bottomRow, int leftCol, int rightCol) {
        if (row >= topRow && row <= bottomRow && col >= leftCol && col + text.length() - 1 <= rightCol) {
            moveTo(row, col);
            System.out.print(text);
        } else {
            System.out.println("Error: Text exceeds section boundaries.");
        }
    }

    private static void moveTo(int row, int col) {
        System.out.print("\033[" + row + ";" + col + "H");
    }
}
