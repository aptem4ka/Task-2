package by.tc.task01.dao.util;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.exception.ReaderException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Data {
    private final List<String> strings=new ArrayList<>();

    public <E> List<String> takeData(String source, Criteria<E> criteria) throws ReaderException {
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(source));
        }catch (IOException e){
            throw new ReaderException(e);
        }

        try {
            while (br.ready()){
                String buffer=br.readLine();
                if (buffer.startsWith(criteria.genericClassName()))
                    strings.add(buffer);
            }
        }catch (IOException e){
            throw new ReaderException(e);
        }

        return strings;
    }
}
