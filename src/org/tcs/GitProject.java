package org.tcs;


public class GitProject {
	
	private void empdetails(int id) {
		System.out.println("employee id:"+id);
}
private void empdetails(String name,float sal) {
	System.out.println("employee name:"+name+ "\t employee sal:"+sal);
}
	private void empdetails(float pf,String mail) {
		System.out.println("employee pf:"+pf+"\n employee mail:+mail");

}
	private void employeedetails(long ph,int accno,String address) {
System.out.println("employee ph:"+ph  +"\n employee accno:"+accno +"\n "
		+ "employee address:"+address);
}
	public static void main(String[] args) {
		GitProject e=new GitProject ();
		e.empdetails(12345);
		e.empdetails("Raja",5896.445f);
		e.employeedetails(9790878766l,5455555,"Chennai");
		e.empdetails(525282f, "radiv0808@gmail.com");


}




}
