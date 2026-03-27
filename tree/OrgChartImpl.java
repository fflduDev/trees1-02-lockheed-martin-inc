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
		GenericTreeNode<Employee> rootEmployee = new GenericTreeNode<Employee>(e);
		//throw new UnsupportedOperationException("Unimplemented method 'addRoot'");
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'clear'");
	}

	@Override
	public void addDirectReport(Employee manager, Employee newPerson) {
		// TODO Auto-generated method stub
		for(int i = 0; i < nodes.size(); i++) {
			GenericTreeNode<Employee> currentEmployee = nodes.get(i);
			if(currentEmployee.data.equals(manager)) {
				GenericTreeNode<Employee> newE = new GenericTreeNode<Employee>(newPerson);

				currentEmployee.addChild(newE);
				nodes.add(newE);
				break;


			}
		}
		//throw new UnsupportedOperationException("Unimplemented method 'addDirectReport'");
	}

	@Override
	public void removeEmployee(Employee firedPerson) {
		// TODO Auto-generated method stub
		//throw new UnsupportedOperationException("Unimplemented method 'removeEmployee'");
	}

	@Override
	public void showOrgChartDepthFirst() {
		// TODO Auto-generated method stub
		//throw new UnsupportedOperationException("Unimplemented method 'showOrgChartDepthFirst'");
	}

	@Override
	public void showOrgChartBreadthFirst() {
		// TODO Auto-generated method stub
		//throw new UnsupportedOperationException("Unimplemented method 'showOrgChartBreadthFirst'");
	}
	
	// Provide public implementations to satisfy the interface's public clone/finalize declarations.
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public void finalize() throws Throwable {
		super.finalize();
	}
	
}
