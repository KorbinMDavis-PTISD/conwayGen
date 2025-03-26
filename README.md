# conwayGen
 Generates a .dat file for the constructed UIL Computer Science Problem "Conway"


 ### Conway
 Conway's Game of Life is a mathematical game played on a euclidean grid, and is
 a type of "Cellular Automata", i.e. discrete computational models consisting of
 cells that evolve in parallel at discrete time steps, following rules based on 
 their own state and the states of their neighbors, used to model complex 
 systems and phenomena. Conway's Game of Life has 3 simple rules that determine
 whether or not a cell is 'alive' (1) or 'dead' (0) at any given time:
1. A dead cell comes to life if it has exactly 3 neighbors
2. A live cell dies if it has less than 2 or more than 3 neighbors
3. A live cell survives if it has exactly 2 or 3 neighbors

**Input:**   
- An integer value `n` ranging from 1 to 100 (inclusive) representing the numberof iterations of Conway's Game of Life to simulate
- An integer value `r` ranging from 50 to 1000 (inclusive) representing the height of the game simulation
- An integer value `c` ranging from 50 to 1000 (inclusive) representing the width of the game simulation
- A set of data containing `1` and `0` values that determine the initial state of the game simulation

**Output:**  
The number of living cells at the end of the simulation.

**Sample Input:**  
1  
4  
5  
0 1 1 0 1  
0 0 1 0 1  
1 0 1 0 0  
1 1 0 0 1  

**Sample Output:**  
6
