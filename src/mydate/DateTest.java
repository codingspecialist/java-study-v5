package mydate;

/**
 * day 더하기 체크
 * month 더하기 체크 -> 2월일 때, 30나오면 안됨. 4년에 한번 30나오면 안됨.
 * year 체크할 것 없음
 */
public class DateTest {

    public static void main(String[] args) {
        String inputDate = "2024-02-29";
        String inputType = "year";
        int num = 1;

        // 1. 날짜 파싱
        Diary diary = new Diary();
        diary.parseDate(inputDate);

        // 2. 년, 월, 일 중 선택해서 값 증가
        if (inputType.equals("day")) {
            diary.addDay(num);
        } else if (inputType.equals("month")) {
            diary.addMonth(num);
        } else if (inputType.equals("year")) {
            diary.addYear(num);
        } else {
            System.out.println("잘못된 값을 입력하였어요 : " + inputType);
        }

        // 3. 결과 확인
        System.out.println("년 : " + diary.year);
        System.out.println("월 : " + diary.month);
        System.out.println("일 : " + diary.day);
    }
}
