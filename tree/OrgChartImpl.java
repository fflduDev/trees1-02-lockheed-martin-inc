package tree;

import java.util.ArrayList;
import java.util.List;

import tree.GenericTreeNode;

public class OrgChartImpl implements OrgChart{


	
	//Employee is your generic 'E'..
	private List<GenericTreeNode<Employee>> nodes = new ArrayList<>();

	@Override
	public void addRoot(Employee e) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'addRoot'");
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'clear'");
	}

	@Override
	public void addDirectReport(Employee manager, Employee newPerson) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'addDirectReport'");
	}

	@Override
	public void removeEmployee(Employee firedPerson) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'removeEmployee'");
	}

	@Override
	public void showOrgChartDepthFirst() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'showOrgChartDepthFirst'");
	}

	@Override
	public void showOrgChartBreadthFirst() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'showOrgChartBreadthFirst'");
	}
	
	
}
