
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yoshitha
 */
public class edita {
 public Scanner y;
    public Scanner stu;
    public String serialNumber;
    public String title;
    public String author;
    public String genre;
    public String placement;
    public int borrowed;
    public String borrower;
    public String dueDate;
    public String userName;
    public String id;
    public String userPass;
    public String email;
    public String changedSerial;
    public String changedTitle;
    public String changedAuthor;
    public String changedGenre;
    public String changedPlacement;
    public String changedBorrower;
    public String changedDate;
    public String bookBorrowed;
    public String updatedID;
    public String updatedUserPass;
    public String updatedEmail;
    public String updatedName;
    public String serialIssue;

    public void AssigningTheBookRecords()
    {
        try {
            y = new Scanner(new File("book.txt"));
        }
        catch (FileNotFoundException e)
        {
            System.out.println("An error occurred");
        }

        while (y.hasNext()) {
            serialNumber = y.next();
            title=y.next();
            author = y.next();
            genre=y.next();
            placement=y.next();
            borrowed=y.nextInt();
            borrower=y.next();
            dueDate=y.next();

            if ( serialNumber.equals(serialIssue))
            {
                changedSerial=serialNumber;
                changedTitle=title;
                changedAuthor=author;
                changedGenre=genre;
                changedPlacement=placement;
                break;
            }
        }
        /*if (borrower!="NA")
        {
            System.out.println("The book has already been borrowed. Please check again.");
            // Exit from the rest
        }*/
        //System.out.println(changedSerial+"\t"+changedTitle+"\t"+changedAuthor+"\t"+changedGenre+"\t"+changedPlacement);

    }


    public void closeFile ()
    {
        y.close();
    }

    public void AssigningTheStudentRecords()
    {
        try {
            stu = new Scanner(new File("student.txt"));
        }
        catch (FileNotFoundException e)
        {
            System.out.println("An error occurred");
        }

        while (stu.hasNext()) {
            id = stu.next();
            userPass=stu.next();
            email = stu.next();
            userName=stu.next();
            bookBorrowed=stu.next();

            if ( id.equals(changedBorrower))
            {
                updatedID=id;
                updatedUserPass=userPass;
                updatedEmail=email;
                updatedName=userName;
                break;
            }
        }
        //System.out.println(updatedID+"\t"+updatedUserPass+"\t"+updatedEmail+"\t"+updatedName);
    /*if (bookBorrowed!="NA")
    {
        System.out.println("The student has already borrowed a book.");
        //Exit from the rest
    }*/
    }
    public void closeStuFile ()
    {
        stu.close();
    }

    public void DeleteEntry(String file,String removeTerm)
    {
        try {
            File inputFile = new File(file);
            File tempFile = new File("myTempFile.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
            String lineToRemove = removeTerm;
            System.out.println(removeTerm);
            String currentLine;

            while ((currentLine = reader.readLine()) != null) {
                String trimmedLine = currentLine.trim();
                if (trimmedLine.contains(lineToRemove)) continue;
                writer.write(currentLine + System.getProperty("line.separator"));
            }

            writer.close();
            reader.close();
            boolean del=inputFile.delete();
            System.out.println(del);
            boolean successful=tempFile.renameTo(inputFile);
        }
        catch (IOException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void reWriteRecord()
    {
        try{
            File file=new File("book.txt");
            FileWriter fileWriter=new FileWriter(file,true);
            fileWriter.write(changedSerial+"\t"+changedTitle+"\t"+changedAuthor+"\t"+changedGenre+"\t"+changedPlacement+"\t"+1+"\t"+changedBorrower+"\t"+changedDate);
            fileWriter.close();}
        catch (IOException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void reWriteStuRecord()
    {
        try{
            File f1=new File("student.txt");
            FileWriter fileWriter=new FileWriter(f1,true);
            fileWriter.write(updatedID+"\t"+updatedUserPass+"\t"+updatedEmail+"\t"+updatedName+"\t"+serialIssue);
            fileWriter.close();}
        catch (IOException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

    class testingblah
    {
        public static void main(String[] args) {
            //String serialIssue;
            edita d1=new edita();
            System.out.println("Enter the Serial Number of the book to be Issued:");
            Scanner s1=new Scanner(System.in);
            d1.serialIssue=s1.nextLine();
            System.out.println("Enter the Borrower's ID:");
            Scanner s2=new Scanner(System.in);
            d1.changedBorrower=s2.nextLine();
            System.out.println("Enter the Due date:");
            Scanner s3=new Scanner(System.in);
            d1.changedDate=s3.nextLine();
            d1.AssigningTheBookRecords();
            d1.closeFile();
            d1.DeleteEntry("book.txt",d1.serialIssue);
            d1.reWriteRecord();
            d1.AssigningTheStudentRecords();
            d1.closeStuFile();
            d1.DeleteEntry("student.txt",d1.changedBorrower);
            d1.reWriteStuRecord();
        }
    }