package phase1;
import java.util.*;
import java.io.*;
public class Lockers {
	static Scanner sc=new Scanner(System.in);
	static File f=new File("E:\\Phase-1");
	
	public static void Initial() throws IOException {
		System.out.println("\nSelect an operation to perform");
		System.out.println("1. Display file names in ascending order.\n2. Add, delete or search a file.\n3. Close the application.");
		int input=sc.nextInt();
		switch(input) {
		case 1:File[] files=f.listFiles();
			System.out.println("Files are :");
			if(files.length==0)
				System.out.println("Empty!!");
			else {
			for (int i = 0; i < files.length; i++) 
                System.out.println(files[i].getName());
			}
			Initial();
			break;
		case 2:
			Second();
			break;
		case 3:System.exit(0);
		}
	}
	
	public static void Second() throws IOException {
		System.out.println("\n1. Add a file into existing directory list.\n2. Delete a file fron the existing directory list.\n3. Search a file from the directory.\n4. Navigate back.");
		int choice=sc.nextInt();
		do {
		switch(choice) {
		case 1:
			System.out.print("Enter filename to add (with extension):");
			String n=sc.next();
			addFile(n.toLowerCase());
			System.out.println("Do you want to do other operation? choose index of operation :");
			choice=sc.nextInt();break;
		case 2:
			System.out.print("Enter filename to delete (with extension):");
			String name=sc.next();
			deleteFile(name);
			System.out.println("Do you want to do other operation? choose index of operation :");
			choice=sc.nextInt();break;
		case 3:
			System.out.print("Enter filename to search (with extension):");
			String s=sc.next();
			searchFile(s);
			System.out.println("Do you want to do other operation? choose index of operation :");
			choice=sc.nextInt();break;
		case 4:
			Initial();
			break;
		}}while(true);
	}
	public static void main(String[] args) throws IOException {
		
		
		System.out.println("*****************************************************************************************************");
		System.out.println("\n\t\tWelcome to LockedMe.com");
		System.out.println("\t\tDeveloped by - Mithila Reddy Gaddam, TEKSystems Global Services Pvt. Ltd.\n");
		System.out.println("*****************************************************************************************************");
		System.out.println();
		
		Initial();
		
	
	}

	public static void searchFile(String name) {
		File myObj = new File("E:\\Phase-1\\"+name);
		if(myObj.exists())
			System.out.println("File found!");
		else
			System.out.println("File Not Found");
		
	}

	public static void deleteFile(String name) {
		 File myObj = new File("E:\\Phase-1\\"+name); 
		 if(myObj.exists()) {
			 myObj.delete();
			 System.out.println("Deleted file successfully");
		 }else
			 System.out.println("File not found");
		
	}

	public static void addFile(String name) throws IOException {
		File myObj=new File("E:\\Phase-1\\"+name);
		if(!myObj.exists()) {
		myObj.createNewFile();
		System.out.println("File added successfully!");
		}
		else
			System.out.println("File already exist!");
		
	}

}
