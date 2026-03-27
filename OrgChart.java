package tree;

public interface OrgChart {
	public void addRoot(Employee e); 
		// if there is no orgchart, start it
	
	
	public void clear();
		// get rid of the org chart
	
	Object clone() throws CloneNotSupportedException;


	@Override
	boolean equals(Object obj);


	void finalize() throws Throwable;


	@Override
	int hashCode();


	@Override
	String toString();


	public void addDirectReport(Employee manager, Employee newPerson);
		// add the newPerson as a direct report (child) of manager
	
	public void removeEmployee(Employee firedPerson);
		// remove the employee, give their direct reports to their supervisor
	
	public void showOrgChartDepthFirst(); 
	
	public void showOrgChartBreadthFirst();
	

}
