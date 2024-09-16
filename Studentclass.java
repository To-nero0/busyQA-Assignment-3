package assignment;	
public class Studentclass {

		    public static void main(String[] args) {
	
		        Student stu1 = new Student();
		        Student stu2 = new Student();

		  
		        stu1.getStuData(67, "ANTHONY");
		        stu1.getStuMarks(75, 70, 78);
		        stu1.totalMarks();

		       
		        stu2.getStuData(68, "OKAFOR");
		        stu2.getStuMarks(88, 92, 71);
		        stu2.totalMarks();
		    }
		}