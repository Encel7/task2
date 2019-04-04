package by.task.first.validator;

import by.task.first.exception.WrongDataException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.ListIterator;

public class DataValidator  {
    final static private int LIST_SIZE = 4;
    private final static Logger logger = LogManager.getLogger();

    public void validate (List<List<String>> data){
        ListIterator<List<String>> iterator = data.listIterator();
        while (iterator.hasNext()) {
            List<String> list = iterator.next();
            if (list.size() != LIST_SIZE) {
                iterator.remove();
                continue;
            }
            for(String l : list){
                if(!tryParse(l)){
                    iterator.remove();
                }
            }
        }
    }

    private boolean tryParse(String value){
        double temp;
        boolean isValid = false;
        try {
            temp = Double.parseDouble(value);
            if (temp >= 0){
                isValid = true;
            }
            else {
                throw new WrongDataException();
            }
        } catch (NumberFormatException|WrongDataException e) {
            logger.info("invalid data. line skipped");
        }
        return isValid;
    }
}
