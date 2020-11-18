package Zadanie7;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Account {
    protected int accountId;
    protected String holder;
    protected int amount;

    void read() throws FileNotFoundException {
        try (BufferedReader br = new BufferedReader(
                new FileReader("D:\\Users\\dmitriy.klochkov\\Dom_zadaniya\\Zadanie7\\List.txt"))) {
            HashMap<Integer, ArrayList> hashMap = new HashMap<>();
            String str;
            while ((str = br.readLine()) != null) {
                accountId = (Integer.parseInt(String.valueOf(str.split("."))));
                holder = str.substring(str.indexOf('.') + 1, str.indexOf(','));
                amount = (Integer.parseInt(String.valueOf(str.split("\\,"))));
                ArrayList arrayList = new ArrayList();
                arrayList.add(0, amount);
                arrayList.add(1, holder);
                hashMap.put(accountId, arrayList);

                System.out.println(str + accountId + holder + amount);
            }
            // catch (FileNotFoundException e){
            //System.out.println(e.getMessage());
            // }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void record(HashMap hashMap) throws FileNotFoundException {
        try (PrintWriter pr = new PrintWriter(
                new FileWriter("D:\\Users\\dmitriy.klochkov\\Dom_zadaniya\\Zadanie7\\File.txt"))) {


        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
