package stack;
 class S {
	int stack[]=new int[4];
	int top=0;
public  void push(int data) {
	stack[top]=data;
	top++;
}
public int pop () {
	int data;
	top--;
	data=stack[top];
	stack[top]=0;
	return data;
}
public int peek() {
	int data;
	data=stack[top-1];
	return data;
}
public int size() {
	return top;
}
public boolean isEmpty() {
	return top<=0;
}
	public void show() {
		for(int n : stack)
			System.out.print(n + " ");
		System.out.println();
	}
}
public class Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
S st=new S();
System.out.println(st.isEmpty());
st.push(10);
st.push(20);
st.push(30);
st.show();
System.out.println(st.peek());

st.pop();
st.show();
System.out.println(st.size());
System.out.println(st.isEmpty());

	}

}
