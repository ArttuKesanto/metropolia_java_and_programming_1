package metropolia_java_2020;

import java.io.*;

public class EkaOhjelma
{
   public static void main (String [] args)
   {
      int luku;
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

      try // Virheen etsimistä, jos ei saa parsettua palautetaan catch.
      {
         System.out.print("Anna kokonaisluku: ");
         luku = Integer.parseInt(in.readLine());

         System.out.println("Luku oli: " + luku);
      }
      
      catch (Exception e)
      {
         System.out.println("Syöttämäsi luku oli väärin.");

      }
      
   }
}