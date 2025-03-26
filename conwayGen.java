import java.util.*;
import java.io.*;

public class conwayGen {
    public static void main(String args[]) throws IOException {
        BufferedWriter wr = new BufferedWriter(new FileWriter("conway.dat"));
        // Write code to generate random numbers for Conway
        
        int n = (int) (Math.random() * 50) + 1;
        int r = (int) (Math.random() * 950) + 50;
        int c = (int) (Math.random() * 950) + 50;
        int data;
        wr.write("" + n + "\n" + r + "\n" + c + "\n");
        for (int i = 0; i < r*c; i++) {
            data = (int) (Math.random() * 6);
            data = data % 6 == 0 ? 1 : 0;
            wr.write("" + data + " ");
        }
    }
}
