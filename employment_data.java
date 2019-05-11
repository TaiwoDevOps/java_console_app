//using heirachical inheritance 
import java.util.Scanner;
//this applcation is expected to collate data of persons interested in applying for a job.
//giving to apply for job on educational background or work experince
//employment_data collection app
class person {//creating first super class
		String name,sex,age,nationality;
			Scanner input = new Scanner(System.in);
	public void bio_data(){//method for the super class
				System.out.println("Enter your Names: ");
				name =input.nextLine();
				System.out.println("Enter your Sex: ");
				sex =input.nextLine();
				System.out.println("Enter your Age: ");
				age =input.nextLine();
				System.out.println("Enter you Nationality: ");
				nationality =input.nextLine();
				}
	public void show_bio_data(){
System.out.println("------------------------------------------------ ");
					System.out.println("Candidates' Bio Data is as follows:- ");
					System.out.println("Names are: "+ name);
					System.out.println("Sex is: "+ sex);
					System.out.println("Age is: "+ age);
					System.out.println("Candidate Nationality is: "+ nationality);
				    }
		}
		
class educational extends person{
		String primary,secondary,university,highest_degree;
		Scanner input =new Scanner(System.in);
	public void educational_info(){
					super.bio_data();
				System.out.println("What is the name of your Primary school: ");
				primary =input.nextLine();
				System.out.println("What is the name of your Secondary school: ");
				secondary =input.nextLine();
				System.out.println("What is the name of your University or any attended Institution:");
				university =input.nextLine();
				System.out.println("List your Highest Qualification: ");
				highest_degree =input.nextLine();
					show_educational_info();
					}
	public void show_educational_info(){
					super.show_bio_data();
				System.out.println("Primary School: "+ primary);
				System.out.println("Secondary School: "+ secondary);
				System.out.println("Highest Institution: "+ university);
				System.out.println("Highest Qualification: "+ highest_degree);
						}
				}
class skill extends person {
			String placewk, dept,desig;
			int wkexperience;
	public void skill_info(){
				super.bio_data();
				System.out.println("Where have you worked before: ");
				placewk =input.nextLine();
				System.out.println("In what department did you serve: ");
				dept =input.nextLine();
				System.out.println("What was your designation(Role): ");
				desig =input.nextLine();
				System.out.println("How many years of Work experience do you have: ");
				wkexperience =input.nextInt();
					show_skill_info();
				} 
	public void show_skill_info(){
					super.show_bio_data();
				System.out.println("Place of Work: "+ placewk);
				System.out.println("Department served : "+ dept);
				System.out.println("Role served at place of work: "+ desig);
				System.out.println("Years of experience: "+ wkexperience);
					}
			}
public class employment_data
{
 	
	public static void main(String [] args)
				{
				System.out.println("Prospective Employee datas' are:-:-:-:-:");
				System.out.println("Application Collection Menu");
				System.out.println("1. With Educational Qualifications");
				System.out.println("2. Without Educational Qualifications");
				System.out.println("Select your choice");
				Scanner pick = new Scanner(System.in);
				int input = pick.nextInt();
					switch(input)
							{
								case 1: educational ed = new educational();
								ed.educational_info();
								break;

								case 2: skill sk = new skill();
								sk.skill_info();
								break;
							}
				}
}