class tnode{
	int data;
	tnode left,right;
	tnode(int d){
		this.data=d;
//root node is very importtant to perform any opertion on tree
	}
}
public class Binarytree{
	public static void preorder(tnode root){
		if(root==null){
			return;
		}
		System.out.print(root.data+" ");
		preorder(root.left);//here this using recursion
		preorder(root.right);
	}
	public static void main(String[] args) {
		tnode root=new tnode(3);
		root.left=new tnode(5);
		root.right=new tnode(7);
		root.left.left=new tnode(5);
		preorder(root);

	}
}