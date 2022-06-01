

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
      Scanner input = new Scanner(System.in);//Scanner�Է�
      MystudyManager mystudyManager = getObject("mystudymanager.ser");
      if(mystudyManager == null) {
         mystudyManager = new MystudyManager(input);
      }
      //new MystudyManager(input);
      //if���� Ȱ���ϱ� ���� MystudyManager�� �ν��Ͻ� ����
      //Scanner�� 1���� 5������ ���ڸ� �Է��Ͽ� number�� �Ҵ��ϰ� if���� ����ϰ� ���� ����� Ȱ���Ѵ�.
      
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
            //if���� Scanner�� �Է¹��� ���ڸ� ���� 1����5������ �� ������ �����Ѵ�.
            if(number==1) {
               mystudyManager.addSubject();
               //MystudyManager�� �����ϴ� addSubject�޼ҵ带 ȣ���Ѵ�.
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
               //1����4�� ������ ���ڸ� �Է��ϸ� if���� Ż���Ѵ�.
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