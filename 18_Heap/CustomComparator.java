import java.util.Arrays;
class Student implements Comparable<Student>{
    String name; 
    int rno;
    double cgpa;
    Student(String name, int rno, double cgpa){
        this.name = name;
        this.rno = rno;
        this.cgpa = cgpa;
    }
    public int compareTo(Student s){
        if(this.cgpa == s.cgpa)
            return this.rno - s.rno;
        return Double.compare(this.cgpa,s.cgpa);
        // return Integer.compare(this.rno,s.rno);
    }
}
public class CustomComparator{
    public static void main(String[] args) {
         Student s1 = new Student("Aashish", 3, 7);
         Student s2 = new Student("Isha", 88, 8.3);
         Student s3 = new Student("Vishal", 9, 9.7);
         Student[] arr = {s1, s2, s3};
         Arrays.sort(arr);
         for(Student s: arr){
            System.out.print(s.name+" ");
         }
    }
}