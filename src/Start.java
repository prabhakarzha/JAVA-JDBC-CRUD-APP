import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import com.student.manage.*;
public class Start {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		System.out.println("Welcome to Student Management App");
		BufferedReader br =new BufferedReader (new InputStreamReader(System.in));
		while(true) {
			System.out.println("PRESS 1 to Add Students");
			System.out.println("PRESS 2 to Delete Students");
			System.out.println("PRESS 3 to display Students");
			System.out.println("PRESS 4 to exit Students");
			
			int c = Integer.parseInt(br.readLine());
			
			if(c==1)
			{
				//add student
				System.out.println("Enter User Name :");
				String name = br.readLine();

				System.out.println("Enter user phone :");
				String phone = br.readLine();

				System.out.println("Enter user city :");
				String city = br.readLine();

				//create Student object to store student
				Student st = new Student(name,phone,city);
				System.out.println(st);

			}
			else if(c==2)
			{
				//delete student
				
			}
			else if(c==3)
			{
				//display student
				
			}
			else if(c==4)
			{
				//exit
				break;
			}
			else {
				
			}



		}
		System.out.println("Thank You using my App");
		System.out.println("See You Soon Bye Bye");


	}

}
