package oops.polymorphism;
class Tree
{
	public void leafs()
	{
		
		System.out.println("tree leafs");
	}
}
public class BananaTree extends Tree {
	public void leafs()
	{
		
		System.out.println("Banana tree leafs");
	}
	
	public static void main(String[] args) {
		
		BananaTree b = new BananaTree();
		b.leafs();
	
	
		Tree t = new Tree();
		t.leafs();
		
//		Tree t = new Banana tree(); // auto upchasting
//		t.leafs();
	}
}
