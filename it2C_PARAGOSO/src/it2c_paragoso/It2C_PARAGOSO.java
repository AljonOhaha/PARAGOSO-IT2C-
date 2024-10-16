
package it2c_paragoso;

import java.util.Scanner;

public class It2C_PARAGOSO {
        public void AddRecords(){
        Scanner sc = new Scanner(System.in);
        config conf = new config();
       
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Department: ");
        String department = sc.next();
        System.out.print("Phone Number: ");
        String phone = sc.next();
        System.out.print("Hire Date: ");
        String hire = sc.next();

        String sql = "INSERT INTO instructor ( NAME, EMAIL, DEPARTMENT, PHONE_NUMBER, HIRE_DATE) VALUES (?, ?, ?, ?, ?)";


        conf.AddRecords(sql, name, email, department, phone, hire);
    }
        
        
          public void viewRecords(){
  config conf = new config ();
        String votersQuery = "SELECT * FROM instructor";
        String[] votersHeaders = {"INSTRUCTOR_ID", "NAME", "EMAIL", "DEPARTMENT", "PHONE_NUMBER", "HIRE_DATE"};
        String[] votersColumns = {"inbstructor_id", "name", "email", "department", "phone_number", "hire_date"};

        conf.viewRecords(votersQuery, votersHeaders, votersColumns);
    }
          
          
           public void updateRecords(){
     Scanner sc = new Scanner(System.in);
     
        System.out.println("Enter ID you want to update:");
        int id = sc.nextInt();
         System.out.print("Enter new  Name: ");
         String name = sc.next();
         System.out.print("Enter new Email: ");
         String email = sc.next();
         System.out.print("Enter new Department: ");
         String department = sc.next();
         System.out.print("Enter new Phone: ");
         String phone = sc.next();
          System.out.print("Enter new Hire Date: ");
         String hire = sc.next();
         String sqlUpdate = "UPDATE instructor SET name = ?, email = ?, department = ?, phone_number = ?, hire_date = ? WHERE instructor_id = ?";
         config conf = new config ();
         conf.updateRecords(sqlUpdate,  name, email, department, phone, hire, id);
         
       
}
           
           
            
    public void deleteRecords(){
Scanner sc = new Scanner(System.in);
          System.out.println("Enter ID you want to delete:");
            int id = sc.nextInt();
           
          String sqlDelete = "DELETE FROM instructor WHERE id = ?";
          config conf = new config();
          conf.deleteRecords(sqlDelete, id);
}

    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
       
        String another = null;
        It2C_PARAGOSO prod = new It2C_PARAGOSO();
       
        do{
            System.out.println("1. ADD RECORD");
            System.out.println("2. VIEW");
            System.out.println("3. UPDATE");
            System.out.println("4. DELeTE");    
            System.out.println("5. Exit");
           
            System.out.println("Enter Action: ");
            int action = in.nextInt();
           
                switch (action){
                   
                    case 1:
                           
                            prod.AddRecords();
                           
                           
                           break;
                           
                    case 2:
                       
                            prod.viewRecords();
                       
                        break;
                       
                    case 3:
                        prod.viewRecords();
                         prod.updateRecords();
                        break;
                       
                    case 4:
                        prod.viewRecords();
                        prod.deleteRecords();
                         
                        break;
                       
                    case 5:
                        System.exit(0);
                               
                        break;
                }
            System.out.println("Continue (yes|no)");
            another = in.next();                  
       
        }while(another.equals("yes"));
        System.out.println("Thank You for using ohaha");
       
    }
        
       
    
    
}
