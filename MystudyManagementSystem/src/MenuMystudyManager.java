

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;

public class MenuMystudyManager {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);//Scanner입력
      MystudyManager mystudyManager = getObject("mystudymanager.ser");
      if(mystudyManager == null) {
         mystudyManager = new MystudyManager(input);
      }
      //new MystudyManager(input);
      //if문에 활용하기 위한 MystudyManager의 인스턴스 생성
      //Scanner로 1부터 5까지의 숫자를 입력하여 number에 할당하고 if문에 사용하고 싶은 기능을 활용한다.
      
      WindowFrame frame = new WindowFrame(mystudyManager);
      selectMenu(input, mystudyManager);
      putObject(mystudyManager, "mystudymanager.ser");
   }
   public static void selectMenu(Scanner input, MystudyManager mystudyManager) {
      int number = -1;
      while(number!=6) {
         try {
            showMenu();
            number = input.nextInt();
            //if문은 Scanner로 입력받은 숫자를 통해 1부터5까지의 각 역할을 수행한다.
            if(number==1) {
               mystudyManager.addSubject();
               //MystudyManager에 존재하는 addSubject메소드를 호출한다.
            }
            else if(number==2) {
               mystudyManager.deleteSubject();      
            }
            else if(number==3) {
               mystudyManager.editSubject();
            }
            else if(number==4) {
               mystudyManager.viewSubject();
            }
            else {
               break;
               //1부터4를 제외한 숫자를 입력하면 if문을 탈출한다.
            }
         } 
         catch(InputMismatchException e) {
            System.out.printf("Please put an integer between 1-5:\n");
            if(input.hasNext()) {
               input.next();
            }
            number = -1;
         }
      }   
   }
   public static void showMenu() {
      System.out.printf("1. Add Subject\n");
      System.out.printf("2. Delete Subject\n");
      System.out.printf("3. Edit Subject\n");
      System.out.printf("4. View Subject\n");
      System.out.printf("5. Exit Subject\n");
      System.out.printf("Select one number between 1-5:\n");
   }
   public static MystudyManager getObject(String filename){
      MystudyManager mystudyManager = null;
      try {
         FileInputStream file = new FileInputStream(filename);
         ObjectInputStream in = new ObjectInputStream(file);
         mystudyManager = (MystudyManager) in.readObject();
         mystudyManager.input = new Scanner(System.in);
         in.close();
         file.close();
      }catch(FileNotFoundException e) {
         return mystudyManager;
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } catch (ClassNotFoundException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      return mystudyManager;
   }

   public static void putObject(MystudyManager mystudyManager, String filename){
      try {
         FileOutputStream file = new FileOutputStream(filename);
         ObjectOutputStream out = new ObjectOutputStream(file);
         out.writeObject(mystudyManager);
         out.close();
         file.close();
      }catch(FileNotFoundException e) {
         // TODO Auto-generated catch block
                  e.printStackTrace();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }
}