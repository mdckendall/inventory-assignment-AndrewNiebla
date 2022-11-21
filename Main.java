import java.util.ArrayList;
import java.util.Scanner;

class Inventory {

  String name = "";
 public String serialNumber = "";
  int value;

  public Inventory(String name, String serialNumber, int value){
  this.name = name;
  this.serialNumber = serialNumber;
  this.value = value;
}
}


class Main {
  public static void main(String[] args) {
     
    ArrayList<Inventory> arrayList = new ArrayList<Inventory>();
     int userInput = 0;
    Scanner UI = new Scanner(System.in);
   
    
while(userInput != 5){
  System.out.println("Press 1 to add an item.");
  System.out.println("Press 2 to delete an item.");
  System.out.println("Press 3 to update an item.");
  System.out.println("Press 4 to show all the items.");
  System.out.println("Press 5 to quit the program.");
  userInput = UI.nextInt();
  UI.nextLine();
  if(userInput == 1){
    
    System.out.println("Enter the name:");
   
    String name = UI.nextLine();
     
    
    System.out.println("Enter the Serial Number:");
    
    String serialNumber = UI.nextLine();
    System.out.println("Enter the value in dollars (whole number:");
    
    int value = UI.nextInt();
     Inventory Items = new Inventory(name, serialNumber, value);
    arrayList.add(Items);
    
  }else if(userInput == 2){
    System.out.println("Enter the serial number of the item to delete:");
    
    String sn = UI.nextLine();
    
    for(int i = 0; i < arrayList.size(); i++){
      if(sn.equals(arrayList.get(i).serialNumber)){
         arrayList.remove(i);
        
      }
    }
   
    }else if(userInput == 3){
   for(int i = 0; i < arrayList.size(); i++){
      System.out.println("Enter the serial number of the item to change:");
    String n = UI.nextLine();
     
    if(n.equals(arrayList.get(i).serialNumber)){
    
   System.out.println("Enter the new name:");
    String name = UI.nextLine();
    
    System.out.println("Enter the new value in dollars (whole number):");
int value = UI.nextInt();
      UI.nextLine();
        Inventory Items2 = new Inventory(name, n, value);
      arrayList.set(i,Items2);
   }
}
      
      
    
    
  }else if(userInput == 4){
    
    for(int i = 0; i < arrayList.size(); i++){
      System.out.println(arrayList.get(i).name + "," + arrayList.get(i).serialNumber + "," + arrayList.get(i).value);
     
    }
       
    
   
 
}
    }
}
}