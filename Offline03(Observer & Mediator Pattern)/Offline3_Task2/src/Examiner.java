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
