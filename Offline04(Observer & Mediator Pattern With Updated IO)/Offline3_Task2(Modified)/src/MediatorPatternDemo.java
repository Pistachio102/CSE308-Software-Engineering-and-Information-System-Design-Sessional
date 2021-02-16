public interface MediatorPatternDemo {
    public static void main(String[] args)
    {
        Examiner examiner = new Examiner();
        Student nisa = new Student("Nisa",1);
        Student adiba = new Student("Adiba",2);
        Student nazifa = new Student("Nazifa",3);
        Student mafruha = new Student("Mafruha",4);
        Student rhitu = new Student("Rhitu",5);

        ExamController.sendExamPapers(examiner);
        examiner.sendExaminedpapers();
        //ExamController.publishResult();



    }
}
