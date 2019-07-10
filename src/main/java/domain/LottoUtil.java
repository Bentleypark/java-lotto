package domain;

public enum LottoUtil {
    REST(","), BLANK(" "), NOTHING("");

    private String value;
    private final static int ONE_UNIT_OF_LOTTO = 6;

    private LottoUtil(String input) {
        value = input;
    }

    public String getValue() {
        return value;
    }

    public static int[] coverStrToArr(String inputWinningNumber) {
        String[] result = removeBlankAndSplit(inputWinningNumber);

        if (checkInputElement(result)) {
            throw new IllegalArgumentException("입력이 잘못되었습니다. 로또 번호를 다시 한번 입력해주세요.");
        }

        int[] inputNumber = new int[ONE_UNIT_OF_LOTTO];
        for (int i = 0; i < ONE_UNIT_OF_LOTTO; ++i) {
            inputNumber[i] = Integer.parseInt(result[i]);
        }
        return inputNumber;
    }

    private static boolean checkInputElement(String[] input) {
        return input.length != ONE_UNIT_OF_LOTTO;
    }

    private static String[] removeBlankAndSplit(String input) {
        return input.replaceAll(BLANK.getValue(), NOTHING.getValue()).split(REST.getValue());
    }
}
