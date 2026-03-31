package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import tree.GenericTreeNode;

public class OrgChartImpl implements OrgChart{


	
	//Employee is your generic 'E'..
	private List<GenericTreeNode<Employee>> nodes = new ArrayList<>();

	@Override
	public void addRoot(Employee e) {
		// TODO Auto-generated method stub
		GenericTreeNode<Employee> rootEmployee = new GenericTreeNode<Employee>(e);
		nodes.add(rootEmployee);
		//throw new UnsupportedOperationException("Unimplemented method 'addRoot'");
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		nodes.clear();
		// throw new UnsupportedOperationException("Unimplemented method 'clear'");
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
        GenericTreeNode<Employee> target = null;

        for (int i = 0; i < nodes.size(); i++) {
            if (nodes.get(i).data.equals(firedPerson)) {
                target = nodes.get(i);
                break;
            }
        }

        if (target == null) {
            return;
        }

        for (int i = 0; i < nodes.size(); i++) {
            nodes.get(i).children.remove(target);
        }

        nodes.remove(target);
    }
		//throw new UnsupportedOperationException("Unimplemented method 'removeEmployee'");

	@Override
	public void showOrgChartDepthFirst() {
		System.out.println("\nDepth First:");
		// TODO Auto-generated method stub
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
		//throw new UnsupportedOperationException("Unimplemented method 'showOrgChartDepthFirst'");
	}

	@Override
	public void showOrgChartBreadthFirst() {
		System.out.println("\nBreadth First:");
		// TODO Auto-generated method stub
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
