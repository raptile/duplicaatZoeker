package nl.raptile.app;

import java.io.File;
import java.io.IOException;

public class App {

    private static String DIR_A = "/";
    private static String DIR_B = ".";

    public static void main(String[] args) throws IOException {

        System.out.println("List files from locatio A");
        File dirLocation_A = new File(DIR_A);
        File[] dir_a_Files = dirLocation_A.listFiles();
        if (null != dir_a_Files) {
            for (int fileIntList = 0; fileIntList < dir_a_Files.length; fileIntList++) {
                String ss = dir_a_Files[fileIntList].toString();
                if (null != ss && ss.length() > 0) {
                    System.out.println("File: " + (fileIntList + 1) + " :" + ss.substring(ss.lastIndexOf("\\") + 1, ss.length()));
                }
            }
        }

        System.out.println("List files from locatio B");
        File dirLocation_B = new File(DIR_B);
        File[] dir_b_Files = dirLocation_B.listFiles();

        // System.out.println("BLA" + dir_b_Files[2]);

        if (null != dir_b_Files) {
            for (int fileIntList = 0; fileIntList < dir_b_Files.length; fileIntList++) {
                String file = dir_b_Files[fileIntList].toString();

                for (File bestand : dir_b_Files) {
                    System.out.println("FREESPACE: " + bestand.getFreeSpace());
                    System.out.println("CONIAL: " + bestand.getCanonicalPath());
                    System.out.println("TOTAL: " + bestand.getTotalSpace());
                }

                if (null != file && file.length() > 0) {
                    System.out.println(file.substring(file.lastIndexOf("\\") + 1, file.length()));
                }
            }
        }
    }
}
