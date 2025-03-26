import java.util.*;  // Random
import java.io.*;    // File Stuff

public class conwayGen {
    public static void main(String args[]) throws IOException {
        // Create the file writing tool that writes to 'conway.dat'
        BufferedWriter wr = new BufferedWriter(new FileWriter("conway.dat"));
        // Write code to generate random numbers for Conway

        // Create the integer values randomly that correspond to the inputs
        int n = (int) (Math.random() * 50) + 1;
        int r = (int) (Math.random() * 950) + 50;
        int c = (int) (Math.random() * 950) + 50;
        int data;

        // Write the initial values to the file
        wr.write("" + n + "\n" + r + "\n" + c + "\n");

        // Loop through the cells in the Game
        // and populate them with a random 1 or 0
        // There is a 1/6 chance for the cell to be 1
        for (int i = 0; i < r*c; i++) {
            data = (int) (Math.random() * 6);    // Generate the value from 1-6
            data = data % 6 == 0 ? 1 : 0;        // The cell is alive if 6, and dead if 0
            wr.write("" + data + " ");           // Write the value to the file
        }
    }
}
