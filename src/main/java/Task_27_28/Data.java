package Task_27_28;

import java.util.ArrayList;

public class Data {
    private ArrayList<String> words;
    private ArrayList<Integer> values;
    private String sign;

    public Data(ArrayList<String> words, ArrayList<Integer> values, String sign) {
        this.words = words;
        this.values = values;
        this.sign = sign;
    }

    public ArrayList<String> getWords() {
        return words;
    }

    public void setWords(ArrayList<String> words) {
        this.words = words;
    }

    public ArrayList<Integer> getValues() {
        return values;
    }

    public void setValues(ArrayList<Integer> values) {
        this.values = values;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return "Data{" +
                "words=" + words +
                ", values=" + values +
                ", sign='" + sign + '\'' +
                '}';
    }
}
