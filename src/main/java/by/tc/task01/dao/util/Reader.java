package by.tc.task01.dao.util;

import by.tc.task01.entity.criteria.Criteria;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    private final List<String> strings=new ArrayList<>();

    public <E> List<String> takeData(String source, Criteria<E> criteria) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(source));

        while (br.ready()){
            String buffer=br.readLine();
            if (buffer.startsWith(criteria.genericClassName())) {
                strings.add(buffer);
            }
        }

        return strings;
    }
}
