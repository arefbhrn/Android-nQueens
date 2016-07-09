package co.arsatech.nqueens.nQueensGA;

public final class Chromosome {
	public int[] genes;
	public int fitness;
	public double cumAvgFitness; //cumilative of average of fitness value

	public Chromosome clone() {
		Chromosome varCopy = new Chromosome();
		varCopy.genes = this.genes;
		varCopy.fitness = this.fitness;
		varCopy.cumAvgFitness = this.cumAvgFitness;
		return varCopy;
	}
}