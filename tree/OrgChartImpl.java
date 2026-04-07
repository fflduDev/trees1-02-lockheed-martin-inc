package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import tree.GenericTreeNode;

public class OrgChartImpl implements OrgChart{

    private List<GenericTreeNode<Employee>> nodes = new ArrayList<>();

	@Override
	public void addRoot(Employee e) {
		GenericTreeNode<Employee> rootEmployee = new GenericTreeNode<Employee>(e);
		nodes.add(rootEmployee);
	}

	@Override
	public void clear() {
		nodes.clear();
	}

	@Override
	public void addDirectReport(Employee manager, Employee newPerson) {
		for(int i = 0; i < nodes.size(); i++) {
			GenericTreeNode<Employee> currentEmployee = nodes.get(i);
			if(currentEmployee.data.equals(manager)) {
				GenericTreeNode<Employee> newE = new GenericTreeNode<Employee>(newPerson);

				currentEmployee.addChild(newE);
				nodes.add(newE);
				break;


			}
		}
	}

    @Override
    public void removeEmployee(Employee firedPerson) {
		GenericTreeNode <Employee> target = null;
		GenericTreeNode <Employee> parent = null;

		for (GenericTreeNode<Employee> node : nodes) {
			for (GenericTreeNode<Employee> child : node.children) {
				if (child.data.equals(firedPerson)) {
					target = child;
					parent = node;
					break;
				}
			}
		}

		if(target == null){
			if(!nodes.isEmpty() && nodes.get(0).data.equals(firedPerson)){
				target = nodes.get(0);
			} else {
				return;
			}
		}

		if (parent != null) {
			parent.children.remove(target);
			parent.children.addAll(target.children);
        }
		nodes.remove(target);
	}

	@Override
	public void showOrgChartDepthFirst() {
		System.out.println("\nDepth First:");
		Stack<GenericTreeNode<Employee>> stack = new Stack<>();
		if (nodes.isEmpty()) {
			return; 
		}
		
		stack.push(nodes.get(0));
		while (!stack.isEmpty()) {
			GenericTreeNode<Employee> current = stack.pop();
			System.out.println(current.data); 
			
			List<GenericTreeNode<Employee>> children = current.children;
			for (int i = children.size() - 1; i >= 0; i--) {
				stack.push(children.get(i));
			}
		}
	}

	@Override
	public void showOrgChartBreadthFirst() {
		System.out.println("\nBreadth First:");
		if (nodes.isEmpty()) {
			return; 
		}
		List<GenericTreeNode<Employee>> queue = new ArrayList<>();
		queue.add(nodes.get(0));
		while (!queue.isEmpty()) {
			GenericTreeNode<Employee> current = queue.remove(0);
			System.out.println(current.data); 
			
			queue.addAll(current.children);
		}
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public void finalize() throws Throwable {
		super.finalize();
	}
}