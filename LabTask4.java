public class LabTask4{
  public static int numberOfDaysInAYear(int year) {
       if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            return 366;}
        else {
            return 365;}
    }
  public static void main(String[] args){
   for(int a = 2000;a<=2020;a++){
     System.out.println("Number of days in year "+a+" = "+  numberOfDaysInAYear(a));
     }
   }
}