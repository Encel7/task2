package by.task.first.parser;

import by.task.first.validator.DataValidator;
import java.util.*;

public class DataParser {
    private static String REGEX_DELIMITER = "\\s+";

    public List<List<Double>> parseData(List<String> data){
        DataValidator validator = new DataValidator();
        List<List<Double>> listOfDoubles = new ArrayList<>();
        List<List<String>> parsedStringList = parseToList(data);
        validator.validate(parsedStringList);
        for(List<String> line : parsedStringList) {
            List<Double> doubles = new ArrayList<>();
            for (String number : line){
                doubles.add(Double.parseDouble(number));
            }
            listOfDoubles.add(doubles);
        }
        return listOfDoubles;
    }

    private List<List<String>> parseToList(List<String> lines){
        List<List<String>> listOfLines = new ArrayList<>();
        for(String line : lines) {
            line = line.trim();
            List<String> lineToParse = Arrays.asList(line.split(REGEX_DELIMITER));
            listOfLines.add(lineToParse);
        }
         return   listOfLines;
    }
}

