import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ExamController {
    public static List<Student> studentList = new ArrayList<>();

    private static int probability = 0;
    private static int screwYou = 0;

    public static void addExaminees(Student student)
    {
        studentList.add(student);
    }

    public static void sendExamPapers(Examiner examiner)
    {
       examiner.getExamPapers(studentList);

    }
    public static void getExaminedPapers(List<Student> students)
    {
        System.out.print("Exam controller prompt : Scripts and marks of student id ");
        for (int i =0 ; i<students.size() ; i++)
        {
            System.out.print(students.get(i).studentID);

            if (i< students.size()-1)
            {
                System.out.print(" ,");
            }
        }

        System.out.println(" have been received.");
        System.out.println();
        studentList = students;

        publishResult();
        System.out.println();
        scrutinizeResult();
        System.out.println();
        System.out.println();
        System.out.println("Result has been published to the students.");
        System.out.println();
        publishResultTotheStudents();

    }
    public static void publishResult()
    {
      //  System.out.println("Student ID          Marks");
        for (int i=0; i<studentList.size(); i++)
        {
            System.out.println("Student ID : "+studentList.get(i).studentID + ", Marks : "+ studentList.get(i).marks);

        }
    }

    public static void scrutinizeResult() {
        System.out.println("Scrutinization has been done.");

        for (int a = 0; a < studentList.size(); a++) {
            Random rand = new Random();
            int mistake = rand.nextInt(2);
            if (mistake == 0) {
                screwYou++;
                if (screwYou >= 5 && screwYou <= 10) {
                    mistake = 1;
                    if (screwYou == 10)
                        screwYou = 0;
                }
                //else System.out.println("There is no change in the marks after re-examining the paper of studentID  "+i);

            }
            if (mistake == 1) {
                int mark = rand.nextInt(101);
                int roll = rand.nextInt(studentList.size()) ;

                System.out.println("Marks of student id "+studentList.get(roll).studentID + " was incorrect.");
                System.out.println("Previous marks : "+ studentList.get(roll).marks + ", Corrected marks : "+ mark);
                studentList.get(roll).marks = mark;

            }
        }
    }

    public static void publishResultTotheStudents()
    {
        Scanner input = new Scanner(System.in);
        for (int i=0 ; i<studentList.size() ; i++)
        {
            System.out.println("Student " + studentList.get(i).studentID + " prompt : Result published.Got marks " + studentList.get(i).marks + ".");
            System.out.println("Do you want to apply for re-examine? ");
            System.out.println("1.Yes");
            System.out.println("2.No");
            int option= input.nextInt();

            if (option == 1)
            {
                studentList.get(i).reexamine(studentList.get(i).studentID);
            }
        }
    }


    public static void reexamineRequest(int i)
    {
        System.out.println("Exam controller prompt : Re-examine request got from student id "+i);
        System.out.println("Exam script of student id "+ i +" sent to the examiner.");
        System.out.println();
        System.out.println();
        System.out.println("Examiner prompt: Exam script of student id " + i +" received for re-examine. ");
        Random rand = new Random();
        int mistake = rand.nextInt(2);
        if (mistake == 0)
        {
            probability++;
            if (probability>=5 && probability<=10)
            {
                mistake = 1;
                if (probability==10)
                probability = 0;
            }
            else
                {
                    System.out.println("Marks of student id "+i +" unchanged. ");
                    System.out.println();
                    System.out.println();
                    System.out.println("Exam controller prompt : Marks of student id "+i +" unchanged.");
                    System.out.println("Student id "+ i + " has been informed about no change in marks.");
                    System.out.println();
                    System.out.println();
                    System.out.println("Student id "+ i + " prompt : Marks unchanged.");
                }

        }
        if (mistake==1)
        {
            int mark = rand.nextInt(101);
            int roll = 0;
            for (int j=0 ;j<studentList.size() ;j++)
            {
                if (studentList.get(j).studentID == i)
                {
                    roll = j;
                    break;
                }
            }
            System.out.println("Marks of student id "+i +" is changed. ");
            System.out.println("Previous marks :  " + studentList.get(roll).marks + ", Corrected marks : " + mark);


            System.out.println();
            System.out.println();
            System.out.println("Exam controller prompt : Marks of student id "+ i + " updated from " + studentList.get(roll).marks + " to "+ mark + ".");
            System.out.println("Updated marks have been sent to student id "+ i );

            System.out.println();
            System.out.println();
            System.out.println("Student "+i+" prompt : Marks were previously "+studentList.get(roll).marks+". Now the corrected marks are "+mark+".");
            studentList.get(roll).marks = mark;
           // System.out.println("Corrected mark: " + studentList.get(roll).marks);

        }


        System.out.println();

    }
}
