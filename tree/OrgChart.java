package tree;

public interface OrgChart {
	public void addRoot(Employee e);

	public void clear();
	Object clone() throws CloneNotSupportedException;


	@Override
	boolean equals(Object obj);


	void finalize() throws Throwable;


	@Override
	int hashCode();


	@Override
	String toString();


	public void addDirectReport(Employee manager, Employee newPerson);

	public void removeEmployee(Employee firedPerson);

	public void showOrgChartDepthFirst(); 
	
	public void showOrgChartBreadthFirst();
}