import java.util.*;

class Grade {
    public String grade(int avg) {
        switch(avg/10) {
            case 10:
            return "A+";
            case 9:
            return "A";
            case 8:
            return "B+";
            case 7:
            return "B";
            case 6:
            return "C";
            case 5:
            return "D";
            default:
            return "F";
        }
    }
}

public class StudentGradeCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Grade g = new Grade();
        System.out.println("Enter the Number of Subjects");
        int NumSub = sc.nextInt();
        int Nummarks = 0;

        for(int i=0; i<NumSub; i++) {
            System.out.println("Enter the Marks obtained in Subjects " + (i+1));
            int marks = sc.nextInt();
            Nummarks += marks;
        }

        int avg = Nummarks / NumSub;
        String Grade = g.grade(avg);

        System.out.println("Total marks obtained: " + Nummarks);
        System.out.println("Percentage obtained: " + avg + "%");
        System.out.println("Grade obtained: " + Grade);
    }
}