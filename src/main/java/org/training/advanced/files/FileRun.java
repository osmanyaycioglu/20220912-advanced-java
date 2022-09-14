package org.training.advanced.files;

import org.training.advanced.immutable.Person;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileRun {
    public static void main(String[] args) {
        Path path = Paths.get("./resource/my.txt");
        try {
            List<String> stringList = Files.readAllLines(path,
                                                         StandardCharsets.UTF_8);
            List<Person> personList = new ArrayList<>();
            for (String str : stringList) {
                String[] split = str.split(",");
                if (split.length == 2) {
                    Person person = new Person(split[0],
                                               split[1]);
                    personList.add(person);
                }
            }
            System.out.println(personList);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        File file = new File("my.txt");
//        try {
//            byte[] bytes = new byte[1024 * 1024 * 50];
//            FileInputStream fileInputStream = new FileInputStream(file);
//            int read = fileInputStream.read(bytes);
//            FileChannel channel = fileInputStream.getChannel();
//            ByteBuffer byteBuffer = ByteBuffer.allocate(1024 * 1024 * 50);
//            int read1 = channel.read(byteBuffer);
//
//            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
//            FileReader reader = new FileReader(file);
//            BufferedReader bufferedReader = new BufferedReader(reader);
//            bufferedReader.readLine();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
