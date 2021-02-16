import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExamController {
    public static List<Student> studentList = new ArrayList<>();

    private static int probability = 0;

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
        studentList = students;
    }
    public static void publishResult()
    {
        System.out.println("Student ID          Marks");
        for (int i=0; i<studentList.size(); i++)
        {
            System.out.println(studentList.get(i).studentID + "                   "+ studentList.get(i).marks);

        }
    }

    public static void reexamineRequest(int i)
    {
        System.out.println("re-examine request got from student id "+i);
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
            else System.out.println("There is no change in the marks after re-examining the paper of studentID  "+i);

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
            System.out.println("There is a change in the marks after re-examining the paper of studentID  "+i);
            System.out.println("Previous mark:  " + studentList.get(roll).marks);

            studentList.get(roll).marks = mark;
            System.out.println("Corrected mark: " + studentList.get(roll).marks);

        }



    }
}
