package com.mycompany.java_horstman.chapter3;

    /*
    Exercise11
    Using the listFiles(FileFilter) and isDirectory methods of the java.io.File
    class, write a method that returns all subdirectories of a given directory.
    Use a lambda expression instead of a FileFilter object. Repeat with a
    method expression and an anonymous inner class.

    Exercise12
    Using the list(FilenameFilter) method of the java.io.File class, write a method
    that returns all files in a given directory with a given extension. Use a
    lambda expression, not a FilenameFilter. Which variable from the enclosing
    scope does it capture?

     Exercise13
     Given an array of File objects, sort it so that directories come before files,
     and within each group, elements are sorted by path name. Use a lambda
     expression to specify the Comparator
    */



import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class Directory {


    public static File[] getSubDir1(File files) {   //Returns all subdirectories of a given directory.Use lambda
        return files.listFiles(File::isDirectory);
    }

    public static File[] getSubDir2(File files) {   //Returns all subdirectories of a given directory.
        return files.listFiles(new FileFilter() {   // Use anonymous class
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        });
    }

    public static File[] getAllFiles(File dir, String extension) {  //Returns all files in a given directory
        return dir.listFiles((file,name) -> name.endsWith("." + extension));
    }

    public static void sortFiles(File[] files){
        Arrays.sort(files,(f1,f2)->{
            if (f1.isDirectory() && !f2.isDirectory()){
                return -1;
            }else if (!f1.isDirectory() && f2.isDirectory()){
                return 1;
            }else {
                return f1.getPath().compareTo(f2.toString());
            }
        });
    }


    static public void printFiles(File[] files) {
        for (File file: files) {
            System.out.println(file.getName());
        }
    }

}
