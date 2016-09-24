package no7_BuilderPattern;

public interface Builder {
	public void addSolute(double soluteAmount);
	public void addSolvent(double solventAmount);
	public void abandonSolution(double solutionAmount);
	public Object getResult();
}
