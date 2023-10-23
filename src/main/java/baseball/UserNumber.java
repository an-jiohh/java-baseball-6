package baseball;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserNumber {

    public List<Integer> getUserNumber() {
        List<Integer> userNumber = new ArrayList<>();
        String readLine = getReadLine();
        return userNumber;
    }

    private String getReadLine() {
        return Console.readLine();
    }

    private void checkLength(String word) {
        if (word.length() != 3) {
            throw new IllegalArgumentException("입력한 수가 3자리가 아닙니다.");
        }
    }

    private void checkDigit(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (!Character.isDigit(word.charAt(i))) {
                throw new IllegalArgumentException("문자를 입력하였습니다.");
            }
        }
    }

    private List<Integer> stringToDigit(String word) {
        List<Integer> digitList = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            int digit = Character.getNumericValue(word.charAt(i));
            digitList.add(digit);
        }
        return digitList;
    }

    private void checkDuplication(List<Integer> digitList) {
        Set<Integer> digitSet = new HashSet<>(digitList);
        if (digitSet.size() != digitList.size()) {
            throw new IllegalArgumentException("입력한 수에 중복값이 있습니다.");
        }
    }

    //    private method 테스트를 위한 function
    public void testCheckLength(String word) throws IllegalArgumentException {
        checkLength(word);
    }

    public void testCheckDigit(String word) throws IllegalArgumentException {
        checkDigit(word);
    }

    public List<Integer> testCheckStringToDigit(String word) {
        return stringToDigit(word);
    }

    public void testCheckDuplication(List<Integer> digitList) {
        checkDuplication(digitList);
    }
}
