import java.util.*;

    class bookAnAppointment extends Thread{
        
   public synchronized void run(){
            try{
                Scanner s=new Scanner(System.in);
        ArrayList al=new ArrayList();
         int time[][]=new int[5][13];
         
            int l=0;
            int d=0;
             String doctor="";
             while(true){
            
            while(true){
         
            System.out.println("choose An Option");
            System.out.println("press 1: To Consult Neurologist ");
            System.out.println("press 2: To Consult Dermatologist");
            System.out.println("press 3: To Consult Cardiologists ");
            System.out.println("press 4: To Consult Psychiatrists");
            l++;
             d=s.nextInt();
              

            if(d==1) doctor="Neurologist";
            else if(d==2)doctor="Dermatologist";
           else if(d==3)doctor="cardiologist";
           else if(d==4)doctor="Psychiatrists";
           else { System.out.println("entered Invalid choice please check");
         continue;
            }
             break;
            }
            System.out.println("Thankyou For Choosing "+doctor);
            int l1=0;
        
          s.nextLine();
            
            
            
            System.out.println("please enter your name");
           
            String a=s.nextLine();
             al.add(a);
            System.out.println("please enter you age");
            int age=s.nextInt();
            al.add(age);
            System.out.println(doctor+" is available 10 am to 9 pm only");
            while(true){
            System.out.println("please enter the time ");
           
            int t=s.nextInt();
            time[d][t]=time[d][t]+1;
            
            al.add(2,t);
           
      
           System.out.println("enter number your phone number");
               s.nextLine();
               String phoneno=s.nextLine();
               al.add(3,phoneno);
              // System.out.println(al);
           
            System.out.println("************************************");
             System.out.println();
            System.out.println("PLEASE ENSURE THE DETAIL TO MOVE FORWARD");
             System.out.println();
            System.out.println("************************************");
           Iterator itr=al.iterator();
             int j=0;
          for(int i=0;i<4;i++){
          String result = (i==0)?"Name entered is: ":(i==1)?"Age entered : ":(i==2)?"appointment time: ":"entered phone number: ";
              
               System.out.println(result+al.get(i));
                
           }
           System.out.println("If Details Are Correct Please Enter Yes Else No ");
               String conform=s.nextLine();
               
           if(conform.equalsIgnoreCase("YES")){
               System.out.println("please wait few mintues to conform your appointment");
               Thread.sleep(4000);
                    if(time[d][t]<=2){
                        System.out.println("your appointment is booked");
                Thread.sleep(2000);
               break;
              
           }
           else{
               
                System.out.println("Sorry for misconvience you're entered slot is full  ");
                System.out.println("please enter again make your to avoid full slots");
               System.out.println("Again");
               
               continue;
              
               
           }
           }
           else{
               System.out.println(" I Am So Sorry Again..............");
               continue;
           }
           
            
               
               
           }
           System.out.println("To Book Another Appointment please Enter New Else Exit");
              String again=s.nextLine(); 
              if(again.equalsIgnoreCase("new")){
                  System.out.println("New Booking");
                  al.clear();
                  continue;
                  
              }
              else {
                  System.out.println("Thankyou For Your Valid Time");
                   Hospital hp1=new Hospital();
                  hp1.first();
                 
                  break;
              }
              
                  
              
           
            }
            }
            catch(Exception e){
                System.out.println("Something went wrong");
            }
        }
             
        
    }
    class pharmacist extends Hospital{
        public void general(){
            try{
            ArrayList al1=new ArrayList();
            Scanner s=new Scanner(System.in);
    System.out.print("please enter your query regarding medicine.After completed the query pls press enter  ");
    System.out.println(" :)please don't forget to mention mail id:)   ");
             while(true){
                String s1=s.nextLine();
                if(s1.equals(""))break;
                else{
                    al1.add(s1);
                
            }
            }
            System.out.println("Thankyou we recieved the query our Pharmist will contact you soon");
            System.out.println("If your problem satified pls enter exit else no");
            String k2=s.nextLine();
            if(k2.equals("exit")){
                System.out.println("Thankyou ^_^");
            }
            else{
                 System.out.println("contact our hospital managment ");
                 System.out.println("To contact our hospital managment press 1 or else exit");
                 String n=s.nextLine();
                 if(n.equals("1")){
                    hospitalmanagement hp1=new hospitalmanagement();
                    hp1.general1();
                     
                 }
                 else{
                      Hospital hp1=new Hospital();
                  hp1.first();
                 }
            }
                
            
        }
        
        catch(Exception e){
              System.out.println("Something went wrong");
            
        }
        }
    }
   class  hospitalmanagement extends Hospital{
        public void general1(){
            
            ArrayList al2=new ArrayList();
            Scanner s=new Scanner(System.in);
            try{
           while(true){
            System.out.println("pls enter number based on your requirement given below");
            System.out.println("Press 1 To Get Hospital Contact Detail");
            System.out.println("Press 2 To Rate Us ");
            System.out.println("Press 3 to raise a complaint ");
             System.out.println("Press 4 to exit");
             int a=s.nextInt();
            if(a==1){
                System.out.println("You can reach us with a number 99999999");
                continue;
            }
            else if(a==2){
                System.out.println("rate us in scale 0 to 10");
                int b=s.nextInt();
                if(b>=0 && b<=5){
                    System.out.println(" THankyou We Try Improve more ");
                    
                }
                else{
                    System.out.println(" Thankyou .");
                }
                continue;
            }
            else if(a==3){
                System.out.println("Sorry for inconvience please provide the complaint along with mail id");
                s.nextLine();
                 while(true){
                String s1=s.nextLine();
                if(s1.equals(""))break;
                else{
                    al2.add(s1);
                
            }
            }
            System.out.println("We recived the complain based on complain our team procced to it as soon as possible");
                
            }
            else if(a==4){
              
                  Hospital hp1=new Hospital();
                  hp1.first();
                 break;
            }
            else {
                System.out.println("please enter valid number");
                continue;
            }
        }
        }
        catch(Exception e){
              System.out.println("Something went wrong");
        }
        }
        
    }
    

    public class Hospital{
        public static void main(String[] args){
              Hospital hm=new Hospital();
       hm.first();
    }
    public void first(){
        Scanner s=new Scanner(System.in);
        try{
        System.out.println("WELECOME TO PW Hospital");
       
          System.out.println("Choose An Option");
        System.out.println("1.Book An Appointment");
        System.out.println("2.Talk to hospital management");
         System.out.println("3.Talk To Pharmacist");
         System.out.println("4.Exit");
        int n=s.nextInt();
      
     if(n==1){
          bookAnAppointment bk=new  bookAnAppointment(); 
         bk.start();
       
     }
    else if(n==3) {
          pharmacist ph=new  pharmacist();
          ph.general();
         
     }
     else if(n==2){
          hospitalmanagement hp=new hospitalmanagement() ;
                    hp.general1();
                    
     }
     else{
            
         System.out.print("Thankyou >_<");
         System.out.println("Have a Good Day ^_^ ");
        
         
     }
        }
        catch(Exception e){
          System.out.println("Something went wrong");
    }

        
    }  
}