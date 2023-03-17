package podstawy;

import java.io.*;
import java.net.UnknownHostException;
import java.rmi.ServerException;
import java.security.PrivilegedExceptionAction;
import java.sql.SQLDataException;
import java.util.Scanner;

public class Wyajtki {
    public static void main(String[] args) {

    }

    public void read(String filename) {
        try{
            var in = new FileInputStream(filename);
            int b;
            while ((b = in.read()) != -1){

            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Wystąpił błąd!...");
        }
    }

//    public void read(String filename) throws IOException {
//
//            var in = new FileInputStream(filename);
//            int b;
//            while ((b = in.read()) != -1){
//
//            }
//        }
    }


