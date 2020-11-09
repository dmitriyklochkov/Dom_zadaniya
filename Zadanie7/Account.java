package Zadanie7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Account {
   protected int accountId;
   protected String holder;
   protected double amount;

   void read()throws FileNotFoundException{
         try (BufferedReader br = new BufferedReader(
                 new FileReader("D:\\Users\\dmitriy.klochkov\\Dom_zadaniya\\Zadanie7\\List.txt"))){
            String str;
            while ((str = br.readLine()) != null) {
               System.out.println(str);
            }
         } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
         } catch (IOException e) {
            e.printStackTrace();
         }
   }
   }