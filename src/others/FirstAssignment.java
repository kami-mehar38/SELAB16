package others;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FirstAssignment {
	
	/**
	 * 
	 * @param args
	 * @throws IOException
	 */
	
	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
		int total_no_students;
		System.out.println("Enter the total number of students: ");
		total_no_students = scanner.nextInt();
		Student[] student = new Student[total_no_students];
		if(total_no_students > 0){
			for(int studentNo = 0; studentNo < total_no_students; studentNo++){
				student[studentNo] = new Student();
				System.out.println((studentNo+1) + "/" + total_no_students + ".Enter student’s name: ");
				student[studentNo].name = br.readLine();
				System.out.println((studentNo+1) + "/" + total_no_students + ".Enter ID of " + student[studentNo].name + ":");
				student[studentNo].ID = br.readLine();
				System.out.println((studentNo+1) + "/" + total_no_students + ".Enter marks of " + student[studentNo].name + ":");
				student[studentNo].marks = scanner.nextFloat();
			}
			float tempMarks;
			String tempName;
			String tempID;
			for(int i = 0; i < total_no_students - 1; i++){
				for(int j = 1; j < total_no_students - i; j++){
					if(student[j-1].marks < student[j].marks){
	                    tempMarks = student[j-1].marks;
	                    tempName = student[j-1].name;
	                    tempID = student[j-1].ID;
	                    student[j-1].marks = student[j].marks;
	                    student[j-1].name = student[j].name;
	                    student[j-1].ID = student[j].ID;
	                    student[j].marks = tempMarks;
	                    student[j].name = tempName;
	                    student[j].ID = tempID;
				}
			}
		}
		
			System.out.println(student[0].name + " (" + student[0].ID + ")" + " stands first with " + student[0].marks + " marks");
			System.out.println(student[1].name + " (" + student[1].ID + ")" + " stands second to " + student[0].name + " with the difference of" + (student[0].marks - student[1].marks) + "marks");
			System.out.println(student[2].name + " (" + student[2].ID + ")" + " secured the third position");

		scanner.close();
	}
}
}
class Student{
	String name;
	String ID;
	float marks;
}
