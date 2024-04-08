import java.util.LinkedList;

public class CountStudents {
    public static void main(String[] args) {
        int  [] students={1,1,1,0,0,1};
        int[]  sandwiches = {1,0,0,0,1,1};
        LinkedList<Integer> student = new LinkedList<>();
        LinkedList<Integer> sandwich = new LinkedList<>();
        for(int i =0;i<students.length;i++)
        {
            student.add(students[i]);
            sandwich.add(sandwiches[i]);
        }

        int count=0;
        while (!sandwich.isEmpty() && count<500)
        {
            if(student.peek() == sandwich.peek())
            {
                student.remove();
                sandwich.remove();
            }
            else
            {
               int data = student.remove();
               student.add(data);
            }
             count++;
        }
        System.out.println(sandwich.size());
    }
}
