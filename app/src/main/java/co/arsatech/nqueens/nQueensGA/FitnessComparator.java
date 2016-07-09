package co.arsatech.nqueens.nQueensGA;

import java.util.Comparator;

public class FitnessComparator implements Comparator<Chromosome> {

	@Override
	public int compare(Chromosome x, Chromosome y) {
		if (x.fitness == y.fitness) {
			return 0;
		} else if (x.fitness < y.fitness) {
			return 1;
		} else {
			return -1;
		}
	}
}