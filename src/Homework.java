import java.util.ArrayList;

public class Homework {
    
    private String hwName;
    private String course;
    private String dueDate;
    private String difficultyLevel;
    private static int assignmentNumber;
    private static ArrayList<Homework> hwList = new ArrayList<Homework>();
    
    public Homework(String hwName, String course, String dueDate, String difficultyLevel) {  //Creates a Homework object with the given attributes
                                                                                             //and adds it into the hwList array list
        this.hwName = hwName;
        this.course = course;
        this.dueDate = dueDate;
        this.difficultyLevel = difficultyLevel;
        assignmentNumber++;
        hwList.add(this);
    }
    
    public static void removeAssignment(String homewName) {  //Removes the chosen Homework object from the list
        
    for (int i = 0; i < hwList.size(); i++) {
        if (homewName.equals(hwList.get(i).getName()))
            hwList.remove(i);
    }
    assignmentNumber--;
    }
    
    public String getName() {  //Returns the name of the Homework object
        return this.hwName;
    }
    
    public String getCourse() {  //Returns the course of the Homework project
        return this.course;
    }
    
    public String getDue() {   //Returns the due date of the Homework project
        return this.dueDate;
    }
    
    public String getDifficulty() {  //Returns the difficulty level of the Homework project
        return this.difficultyLevel;
    }
    
    public static void getAssignmentNumber() {  //Returns the total number of all existing Homework objects
        System.out.println(assignmentNumber);
    }
    
    public void setName(String nam) {  //Sets the name of the chosen Homework assignment to nam
        hwName = nam;
    }
    
    public void setCourse(String cour) {  //Sets the course of the chosen Homework assignment to cour
        course = cour;
    }
    
    public void setDue(String newDue) {  //Sets the due date of the chosen Homework assignment to newDue
        dueDate = newDue;
    }
    
    public void setDifficulty(String newDif) {  //Sets the difficulty level of the chosen Homework assignment to newDif
        difficultyLevel = newDif;
    }
    
}