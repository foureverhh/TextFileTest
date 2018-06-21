package Nackademin.com;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        /*
        BufferedReader input  = new BufferedReader
                (new InputStreamReader
                (new FileInputStream("list.txt"),"UTF-8"));
        int i = 0;
        while (true){
            String s = input.readLine();
            if(s == null)
                break;
            i++;
            System.out.println(i+": "+s);
        }

        BufferedReader input = new BufferedReader(new FileReader("list.txt"));
        int rowNum = 0;
        while(true){
            String row = input.readLine();
            if(row == null)
                break;
            rowNum++;
            System.out.println(rowNum + ": "+row);
        }
        */
        /*
        BufferedReader getFileName = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input the name of the file");
        System.out.flush();

        String fileName = getFileName.readLine();
        BufferedReader getInfo = new BufferedReader(new FileReader(fileName));
        while (true){
            String info = getInfo.readLine();
            if(info == null)
                break;
            String getNumber = getInfo.readLine();
            int num = Integer.parseInt(getNumber);
            if(num >= 50)
                System.out.println(info+" "+num);
        }
        System.out.print("Input the file for scanner:");
        Scanner getFile = new Scanner(System.in);
        String fileNameFromScanner = getFile.next();
        Scanner scanner = new Scanner(new File(fileNameFromScanner));
        while(scanner.hasNext()){
            String name = scanner.next();
            while(!scanner.hasNextInt())
                name += " "+scanner.next();
            int point1 = scanner.nextInt();
            int point2 = scanner.nextInt();
            System.out.println(name+" "+point1+" "+ point2);
        }
        */

    }
}
