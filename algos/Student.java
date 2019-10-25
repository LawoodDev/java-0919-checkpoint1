public class Student {

    /**
     * Return if age is up or equals to 18
     * @param age The age to test
     * @return
     */
    public static boolean hasLegalAge(int age){
        return age>= 18;
    }

    /**
     * Return if student is from group A or B
     * @param studentId
     * @return
     */
    public static char getGroup(int studentId){
        return studentId%2==0? 'A':'B';
    }

    /**
     * Count java students from list
     * @param students All the languages choose
     * @return The number of java occurences
     */
    public static int countStudents(String[] students){
        int count=0;
        for(String s : students)
        {
            if (s.toLowerCase().equals("java"))
                count++;
        }
        return count;
    }
}


           


