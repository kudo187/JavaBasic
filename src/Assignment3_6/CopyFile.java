package Assignment3_6;

import java.io.*;
public class CopyFile {

   public static void main(String args[]) throws IOException {
	   InputStream inStream = null;
       OutputStream outStream = null;

       try {
    	   
           inStream = new FileInputStream(new File("C:\\Users\\KhoaNV8\\workspace\\AssignmentBTJB\\input.txt"));
//       "C:\\Users\\KhoaNV8\\Desktop\\input.txt"
           outStream = new FileOutputStream(new File("C:\\Users\\KhoaNV8\\workspace\\AssignmentBTJB\\output.txt"));

           int length;
           byte[] buffer = new byte[1024];
           // copy the file content in bytes
           while ((length = inStream.read(buffer)) > 0) {
        	   System.out.println(buffer);
               outStream.write(buffer, 0, length);
           }
           System.out.println("File is copied successful!");
       } catch (IOException e) {
           e.printStackTrace();
       } finally {
           inStream.close();
           outStream.close();
       }

   }
}