package Problem;

public class Population {

    Map[] exSet;
 
    
    // Create a population
    public Population(int pSize, boolean init) {
        exSet = new Map[pSize];
        // Initialize population
        if (init) {
            // Loop and create individuals
            for (int i = 0; i < 8; i++) {
            	Map newTour = new Map();
                NewSet.initaOrder();
                saveIndividual(i, newIndividual);
            } 
        }
    }
  
    /* Getters */
    public Individual getIndividual(int index) {
        return individuals[index];
    }

    public Individual getFittest() {
        Individual fittest = individuals[0];
        // Loop through individuals to find fittest
        for (int i = 0; i < size(); i++) {
            if (fittest.getFitness() <= getIndividual(i).getFitness()) {
                fittest = getIndividual(i);
            }
        }
        return fittest;
    }

    /* Public methods */
    // Get population size
    public int size() {
        return individuals.length;
    }

    // Save individual
    public void saveIndividual(int index, Individual indiv) {
        individuals[index] = indiv;
    }
}