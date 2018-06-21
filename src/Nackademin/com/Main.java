package Nackademin.com;

import javax.swing.*;
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
         */
        /*
        System.out.print("Input the file for scanner:");
        Scanner getFile = new Scanner(System.in);
        String fileNameFromScanner = getFile.next();
        Scanner scanner = new Scanner(new File(fileNameFromScanner));
       // PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("getInfoFromResult.txt")));
        System.out.print("Input the file you wanted to store data"); System.out.flush();
        BufferedReader getStoredFileName = new BufferedReader(new InputStreamReader(System.in));
        String fileName = getStoredFileName.readLine();
        PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter(fileName,true))); //To append the extra value
        int row = 0, extra=0;
        while(scanner.hasNext()){
            row++;
            extra++;
            String name = scanner.next();
            while(!scanner.hasNextInt())
                name += " "+scanner.next();
            int point1 = scanner.nextInt();
            int point2 = scanner.nextInt();
            System.out.println(name+" "+point1+" "+ point2);
            output.println(row+": "+name+" "+point1+" "+ point2+ " "+extra);
        }
        output.close();
*/
        /*
        JFileChooser jFileChooser = new JFileChooser();
        //To show the file map
        int findAFile = jFileChooser.showOpenDialog(null);
        //If user choose a file JFileChooser.APPROVE_OPTION will work
        if(findAFile != JFileChooser.APPROVE_OPTION){
            System.out.println("No file is chosen");
            System.exit(0);
        }
        //to get the absolute path of the file chosen
        String chosenFile = jFileChooser.getSelectedFile().getAbsolutePath();
        BufferedReader reader = new BufferedReader(new FileReader(chosenFile));
        PrintWriter printWriter = new PrintWriter(new FileWriter("saveFromBufferedReader.txt"));
        System.out.println("Date from BufferedReader: ");
        while(true){
            String dataFromReader = reader.readLine();
            if(dataFromReader == null)
                break;
            String dataPoint = reader.readLine();
            int point = Integer.parseInt(dataPoint);
            //Write data to text file
            printWriter.println(dataFromReader+" "+point);
            System.out.println(dataFromReader+" "+point);

        }
        printWriter.close();
        System.out.println("Data saved to saveFromBufferedReader.txt");
        System.out.println();
        System.out.println("Data From Scanner: ");
        Scanner scanner = new Scanner(new FileReader(chosenFile));
        printWriter = new PrintWriter(new FileWriter("saveFromScanner.txt"));
        while(scanner.hasNext()){
            StringBuilder str = new StringBuilder();
            str.append(scanner.next());
            while (!scanner.hasNextInt()){
                str.append(" "+scanner.next());
            }
            int point = scanner.nextInt();
            printWriter.println(str+" "+point);
            System.out.println(str+" "+point);
        }
        printWriter.close();
        System.out.println("Data saved to saveFromScanner.txt");
*/
        /*
        //test JFileChooser showSaveDialog()
       // JFileChooser jf = new JFileChooser();
        String file = System.getProperty("user.dir");
        System.out.println(file);
        JFileChooser jf = new JFileChooser("C:\\Users\\zfgg0\\GitUpload");
        int result = jf.showSaveDialog(null);
        // int result = jf.showDialog(null,"Choose a file");
        if(result!=JFileChooser.APPROVE_OPTION){
            System.out.println("No file has been chosen");
            System.exit(0);
        }
        */
        //modify content data from a text file and save the changes back
        //get file name
        System.out.print("Name the name of your file:");System.out.flush();
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.next();

        while(true){
            System.out.print("Input the name of the new student:");System.out.flush();
            scanner = new Scanner(System.in);
            String newStudent = scanner.nextLine();
            if(newStudent == null)
                break;
            System.out.print("Input the credits of the new student:");System.out.flush();
            scanner = new Scanner(System.in);
            int newCredit = scanner.nextInt();
            boolean studentIsNotSaved = true;

            //Read data from the file of fileName
            BufferedReader input = new BufferedReader(new FileReader(fileName));
            //Save the data above to a file called file.tmp
            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("file.tmp")));

            while(true){
                String row1 = input.readLine();
                if(row1 == null)
                    break;
                String row2 = input.readLine();
                int credit = Integer.parseInt(row2);

                if(newCredit > credit && studentIsNotSaved){
                    output.println(newStudent);
                    output.println(newCredit);
                    studentIsNotSaved = false;
                }
                output.println(row1);
                output.println(row2);
            }
            // if the student is new but credit is not higher than nobody
            if(studentIsNotSaved){
                output.println(newStudent);
                output.println(newCredit);
            }

            input.close();
            output.close();

            //Write the new data back to fileName
            input = new BufferedReader(new FileReader("file.tmp"));
            output = new PrintWriter(new FileWriter(fileName));

            //Copy each row from fil.tmp back to fileName
            while (true){
                String row = input.readLine();
                if(row == null)
                    break;
                output.println(row);
            }
            System.out.println("New student has added.");
            input.close();
            output.close();
        }
    }
}
