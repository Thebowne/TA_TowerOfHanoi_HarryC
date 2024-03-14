public class TowerOfHanoi {
    public static void main(String[] args) {
        int numOfDisks = 3; // Number of disks in the Tower of Hanoi

        // Solving the tower of Hanoi
        solveTowerOfHanoi(numOfDisks, 'A', 'C', 'B');
    }

    public static void solveTowerOfHanoi(int numOfDisks, char source, char destination, char auxiliary) {
        if (numOfDisks == 1) { //the algorithm will keep on running until only 1 disk is remaining 
            System.out.println("Move disk 1 from rod " + source + " to rod " + destination);
            return;
        }

        solveTowerOfHanoi(numOfDisks - 1, source, auxiliary, destination);
        System.out.println("Move disk " + numOfDisks + " from rod " + source + " to rod " + destination);
        solveTowerOfHanoi(numOfDisks - 1, auxiliary, destination, source);
    }
}