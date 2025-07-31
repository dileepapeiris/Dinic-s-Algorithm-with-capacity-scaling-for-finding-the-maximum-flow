import java.io.IOException;
import java.util.Scanner;

public class Main {

     /**
     * Main method to run the Dinic's algorithm with capacity scaling.
     * It reads a flow network from a file, computes the maximum flow,
     * and optionally displays detailed flow information.
     *
     * @param args Command line arguments
     * @throws IOException If there is an error reading the file
     * @throws IllegalArgumentException If the input is invalid
     * @throws Exception For any other unexpected errors
     
     */
    public static void main(String[] args) {
        System.out.println("Network Flow Algorithm ");
        Scanner scanner = new Scanner(System.in);

        try {
            String filename;
            if (args.length > 0) {
                filename = "benchmarks/" + args[0];
            } else {
                System.out.print("\nEnter input file name (e.g., bridge_1.txt): ");
                filename = "benchmarks/" + scanner.nextLine();
            }

}
