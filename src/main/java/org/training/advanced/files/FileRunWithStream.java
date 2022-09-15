package org.training.advanced.files;

import org.training.advanced.immutable.Person;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileRunWithStream {
    public static void main(String[] args) {
        Path path = Paths.get("./resource/my.txt");
        try {
            List<String> stringList = Files.readAllLines(path,
                                                         StandardCharsets.UTF_8);
            List<Person> collect = stringList.stream()
                                             .map(s -> s.split(","))
                                             .filter(sa -> sa.length == 2)
                                             .map(sa -> new Person(sa[0],
                                                                   sa[1]))
                                             .filter(p -> p.getSurname()
                                                           .length() > 5)
                                             .collect(Collectors.toList());
            collect.forEach(System.out::println);
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
