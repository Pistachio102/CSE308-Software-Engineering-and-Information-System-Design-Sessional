import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Examiner {
    private List<Student> studentList = new ArrayList<>();


    public void getExamPapers(List<Student> students)
    {
        this.studentList = students;
        checkExamPaper();

    }

    public void sendExaminedpapers()
    {
        System.out.print("Examiner prompt : Scripts and marks of student id ");
        for (int i =0 ; i<this.studentList.size() ; i++)
        {
            System.out.print(this.studentList.get(i).studentID);

            if (i< this.studentList.size()-1)
            {
                System.out.print(" ,");
            }
        }

        System.out.println(" have been sent to exam controller office.");
        System.out.println();
        ExamController.getExaminedPapers(this.studentList);
    }
    public void checkExamPaper()
    {
        Random random = new Random();
        for (int i=0 ; i<studentList.size() ; i++)
        {
            int mark = random.nextInt(101);
            studentList.get(i).marks = mark;
        }
    }
}
