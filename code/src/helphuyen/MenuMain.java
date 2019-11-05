package helphuyen;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuMain {
    public ArrayList<Danhba> listD = new ArrayList<>();
    public Scanner sc = new Scanner(System.in);
    public void menu(){
        readFromFile("DB.txt");
        int choose = -1;
        Scanner sc = new Scanner(System.in);
        while (choose!=-0){
            System.out.println("1.Them\t" +
                    "2.Sua\t" +
                    "3.Tim kiem\t" +
                    "4.In ra man hinh\t" +
                    "0.Thoat");

            choose = sc.nextInt();
            switch (choose){
                case 1:{
                    addNumber();
                    break;
                }
                case 2:{
                    sc.nextLine();
                    String number;
                    System.out.println("Nhap vao sdt can update");
                    number = sc.nextLine();
                    updateNumber(number);
                    break;
                }
                case 3:{
                    sc.nextLine();
                    String number;
                    System.out.println("Nhap vao sdt can tim kiem");
                    number = sc.nextLine();
                    findByNumber(number);
                    break;
                }
                case 4:{
                    for(Danhba d: listD)
                        System.out.println(d);
                    break;
                }
                case 0:{
                    break;
                }
            }
        }
        appendToFile("DB.txt");
    }
    public void addNumber(){ //Them sdt
        String name,number;
        System.out.println("Nhap ten:");
        name = sc.nextLine();
        System.out.println("Nhap sdt:");
        number = sc.nextLine();
        listD.add(new Danhba(name,number));
    }
    public void updateNumber(String number){ //sua sdt
        for(Danhba d: listD){
            if(number.equals(d.getNumber())){
                String name;
                System.out.println("Nhap ten moi cho sdt nay:");
                name = sc.nextLine();
                d.setName(name);
                return;
            }
        }
        System.out.println("Can't find this number");
    }
    public void findByNumber(String number){  //tim kiem
        for(Danhba d: listD){
            if(number.equals(d.getNumber())){
                System.out.println(d);
                return;
            }
        }
        System.out.println("Can't find this number");
    }
    public void readFromFile(String path){  //doc file
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String name,number;
            while((name = br.readLine())!=null){
                number = br.readLine();
                listD.add(new Danhba(name,number));
            }
            fr.close();
            br.close();
        } catch (Exception e) {
            //e.printStackTrace();
        }
    }

    public void appendToFile(String path){ //ghi file
        try {
            FileWriter fw = new FileWriter(path,true);
            for(Danhba d: listD) {
                fw.append(d.getName() + "\n");
                fw.append(d.getNumber() + "\n");
            }
            fw.close();
        } catch (IOException e) {
            //e.printStackTrace();
        }

    }
}
