public class Student {

   String name;
   int idNumber;
   double GPA;
   int numTestsTaken;
   int absences;
   int number of classes;

//CONSTRUCTORS
   public Student() {
      name = "Unnamed";
      idNumber = 000000000;
      GPA = 4.0;
      numTestsTaken = 0;
   }

   public Student(String inputName, int inputIdNumber, double inputGPA, int inputNumTestsTaken) {
      name = inputName;
      idNumber = inputIdNumber;
      GPA = inputGPA;
      numTestsTaken = inputNumTestsTaken;
   }

//METHODS
   public void takeTest() {
      numTestsTaken++; //same thing as saying numTestsTaken += 1 --> which is the same thing as numTestsTaken = numTestsTaken + 1;
      System.out.println("number of tests taken is " + numTestsTaken);
   }

   public void setGPA(int inputGPA) {
      //what we would want to do in this method?
   }

   public void setName() { //<-- what do we want to put in these parantheses?
      //what we would want to do in this method?
   }
public void skipsSchool(){
    absences +=1;
}
public void dropsClass(){
    number of classes -=1
}
}
