package stackarray;

public class StackUse {
	public static void main(String[] args) throws StackEmptyException {
		StackUsingArray stack=new StackUsingArray();
		int arr[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34};
		
		for(int i=0;i<arr.length;i++) {
			stack.push(arr[i]);
		}
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		/*
		 * try { stack.push(10); stack.push(20); stack.push(30); stack.push(40); } catch
		 * (StackFullException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 * 
		 * 
		 * int value; try { value = stack.top(); System.out.println(value); } catch
		 * (StackEmptyException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 * 
		 * 
		 * try { value = stack.pop(); System.out.println(value); } catch
		 * (StackEmptyException e1) { // TODO Auto-generated catch block
		 * e1.printStackTrace(); }
		 * 
		 * try { value =stack.top(); System.out.println(value);
		 * 
		 * } catch (StackEmptyException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } value = stack.size(); System.out.println(value);
		 * 
		 * boolean isEmpty=stack.isEmpty();
		 * 
		 * System.out.println(isEmpty); try { stack.pop(); stack.pop(); stack.pop();
		 * stack.pop();} catch(StackEmptyException e) { // e.printStackTrace();
		 * System.err.print(e); }
		 */
		
		
		
	}

}
